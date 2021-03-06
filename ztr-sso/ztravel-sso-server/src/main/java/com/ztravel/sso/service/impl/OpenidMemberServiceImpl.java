package com.ztravel.sso.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ztravel.reuse.sso.service.IOpenidMemberReuseService;
import com.ztravel.sso.po.OpenidMemberEntity;
import com.ztravel.sso.service.OpenidMemberService;

/**
 * @author xutian
 */
@Service
public class OpenidMemberServiceImpl implements OpenidMemberService {

	@Resource
    private IOpenidMemberReuseService openidMemberReuseService;

    @Override
    public void insertOpenidMember(OpenidMemberEntity openidMember) {
    	openidMemberReuseService.insertOpenidMember(openidMember);
    }

    @Override
    public void updateOpenidMember(OpenidMemberEntity openidMember) {
    	openidMemberReuseService.updateOpenidMember(openidMember);
    }

    @Override
    public void deleteOpenidMemberByOpenId(String openId) {
    	openidMemberReuseService.deleteOpenidMemberByOpenId(openId);

    }

    @Override
    public OpenidMemberEntity selectOpenidMemberByOpenId(String openId) {
        return openidMemberReuseService.selectOpenidMemberByOpenId(openId) ;
    }

    @Override
    public List<OpenidMemberEntity> selectOpenidMemberBymemberId(String memberId) {
    	return openidMemberReuseService.selectOpenidMemberBymemberId(memberId) ;
    }

    @Override
    public int countOpenidMemberBymemberId(String memberId) {
        return openidMemberReuseService.countOpenidMemberBymemberId(memberId) ;
    }

    @Override
    public void updateOpenidMemberToUnBind(OpenidMemberEntity openidMember) {
    	openidMemberReuseService.updateOpenidMemberToUnBind(openidMember);
    }

}
