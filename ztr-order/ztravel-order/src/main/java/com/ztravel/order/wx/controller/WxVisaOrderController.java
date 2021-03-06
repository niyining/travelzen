package com.ztravel.order.wx.controller;

import java.sql.SQLException;

import java.util.Map;

import javax.annotation.Resource;


import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;
import com.travelzen.framework.logger.core.ri.RequestIdentityLogger;
import com.ztravel.common.bean.AjaxResponse;
import com.ztravel.common.constants.Const;
import com.ztravel.common.entity.MemberSessionBean;
import com.ztravel.common.enums.ZtOrderStatus;
import com.ztravel.common.util.SSOUtil;
import com.ztravel.order.po.Order;
import com.ztravel.order.po.OrderContactor;
import com.ztravel.order.po.OrderProduct;
import com.ztravel.order.wx.convertor.OrderConvert;
import com.ztravel.order.wx.service.IWxOrderDetailService;
import com.ztravel.order.wx.service.IWxOrderService;
import com.ztravel.order.wx.validate.OrderValidation;
import com.ztravel.order.wx.vo.ContactorInfoVo;
import com.ztravel.order.wx.vo.OrderPriceDetailVo;
import com.ztravel.order.wx.vo.OrderVo;
import com.ztravel.reuse.order.service.ICommonOrderReuseService;
import com.ztravel.reuse.order.service.IOrderContactorReuseService;
import com.ztravel.reuse.order.service.IOrderPassengerReuseService;
import com.ztravel.reuse.order.service.IOrderProductReuseService;
import com.ztravel.reuse.order.service.IOrderReuseService;
import com.ztravel.sraech.client.service.IAutoComplete;

@Controller
@RequestMapping("/visaorder/weixin")
public class WxVisaOrderController {
	@Resource
	IWxOrderDetailService wxOrderDetailServiceImpl;

	@Resource
	IWxOrderService wxOrderServiceImpl;
	
	@Resource
	private IOrderContactorReuseService orderContactorReuseService;
	
	@Resource 
	IOrderPassengerReuseService orderPassengerReuseService;
	
	@Resource
	private IOrderReuseService orderReuseService;
	
	@Resource
	private ICommonOrderReuseService commonOrderReuseService;
	
	@Resource
	private IOrderProductReuseService orderProductReuseService;

	@Resource(name="tThriftAutoComplete")
	IAutoComplete autoComplete;

	private static Logger LOGGER = RequestIdentityLogger.getLogger(WxOrderDetailController.class);


	@RequestMapping(value="/detail/{orderId}")
	public String detail(@PathVariable String orderId,Model model){
		MemberSessionBean memberSessionBean = SSOUtil.getMemberSessionBean();
		if(null != memberSessionBean){
			String mid = memberSessionBean.getMid();
			Map<String,String> params = OrderConvert.getDetailParams(mid,orderId);
			try {
				Order order = orderReuseService.selectByMap(params);
				OrderProduct orderProduct = orderProductReuseService.getOrderProductByOrderId(orderId);
				Boolean canEdit = wxOrderServiceImpl.isOrderCanEdit(orderProduct.getBookDate(),order.getBackState());
				Boolean isDomestic = wxOrderServiceImpl.isDomestic(orderProduct.getProductSnapshot(),orderId);
				model.addAttribute("canEdit", canEdit);
				model.addAttribute("isDomestic", isDomestic);
				OrderVo orderVo = wxOrderServiceImpl.order2Vo(order,orderProduct);
				model.addAttribute("orderVo", orderVo);
				OrderPriceDetailVo priceDetailVo = wxOrderDetailServiceImpl.getPriceDetailVoBySnapshot(orderProduct.getProductSnapshot(), order);
				model.addAttribute("priceDetailVo", priceDetailVo);
				
			} catch (Exception e) {
				LOGGER.error("查询订单[{}]详情异常:{}", orderId,e);
			}
		}
		return "order/weixin/orderDetail/visadetail";
	}

	@RequestMapping("/detail/updateContactor")
	@ResponseBody
	public AjaxResponse updateContactor(@RequestBody OrderContactor contactor){
		try{
			OrderProduct orderProduct = orderProductReuseService.getOrderProductByOrderId(contactor.getOrderId());
			Map<String,String> params = OrderConvert.getDetailParams(SSOUtil.getMemberSessionBean().getMid(),contactor.getOrderId());
			Order order = orderReuseService.selectByMap(params);
			Boolean canEdit = wxOrderServiceImpl.isOrderCanEdit(orderProduct.getBookDate(),order.getBackState());
			if(!canEdit || order == null || order.getBackState().equals(ZtOrderStatus.CANCELED.name()) || order.getBackState().equals(ZtOrderStatus.REFUNDFAILED.name()) || order.getBackState().equals(ZtOrderStatus.REFUNDING.name())){
				return AjaxResponse.instance(Const.FO_ORDE_CODE_1020, Const.FF_ORDE_REASON_1020);
			}
			if(contactor == null || !OrderValidation.validateOrderContactor(contactor)){
				return AjaxResponse.instance(Const.FF_ORDE_CODE_1005, Const.FF_ORDE_REASON_1005);
			}
			orderContactorReuseService.updateOrderContactor(contactor, SSOUtil.getMemberId());
	    }catch(SQLException ex){
	    	LOGGER.error("failed to update orderContactor from DB", ex);
	    	return AjaxResponse.instance(Const.FF_ORDE_CODE_1006, Const.FF_ORDE_REASON_1006);
	    }catch(Exception e){
	    	LOGGER.error("failed to update orderContactor", e);
	    	return AjaxResponse.instance(Const.FF_ORDE_CODE_1007, Const.FF_ORDE_REASON_1007);
	    }
		return AjaxResponse.instance(Const.SF_ORDE_CODE_1001, Const.SUCCESS);

	}

	


	@RequestMapping(value="/detail/getContactor")
	public String getContactor(@RequestBody String orderId,Model model){
		MemberSessionBean memberSessionBean = SSOUtil.getMemberSessionBean();
		if(null != memberSessionBean){
			String mid = memberSessionBean.getMid();
			Map<String,String> params = OrderConvert.getDetailParams(mid,orderId);
			try {
				Order order = orderReuseService.selectByMap(params);
				OrderProduct orderProduct = orderProductReuseService.getOrderProductByOrderId(orderId);
				Boolean canEdit = wxOrderServiceImpl.isOrderCanEdit(orderProduct.getBookDate(),order.getBackState());
				model.addAttribute("canEdit", canEdit);
				ContactorInfoVo contactorInfoVo = wxOrderDetailServiceImpl.getContactorInfoByOrder(order);
				model.addAttribute("contactorInfoVo", contactorInfoVo);
			} catch (Exception e) {
				LOGGER.error("查询订单[{}]详情异常:{}", orderId,e);
			}
		}
		return "order/weixin/orderDetail/contactor";
	}

	
}
