/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.ztravel.paygate.thrift.model;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 交易查询结果
 */
public class QueryResponse implements org.apache.thrift.TBase<QueryResponse, QueryResponse._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("QueryResponse");

  private static final org.apache.thrift.protocol.TField RET_CODE_FIELD_DESC = new org.apache.thrift.protocol.TField("retCode", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField RET_MSG_FIELD_DESC = new org.apache.thrift.protocol.TField("retMsg", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField ORDER_NUM_FIELD_DESC = new org.apache.thrift.protocol.TField("orderNum", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField TRACE_NUM_FIELD_DESC = new org.apache.thrift.protocol.TField("traceNum", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField AMOUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("amount", org.apache.thrift.protocol.TType.I64, (short)5);
  private static final org.apache.thrift.protocol.TField PAY_STATE_FIELD_DESC = new org.apache.thrift.protocol.TField("payState", org.apache.thrift.protocol.TType.STRING, (short)6);
  private static final org.apache.thrift.protocol.TField EXTRA_INFOS_FIELD_DESC = new org.apache.thrift.protocol.TField("extraInfos", org.apache.thrift.protocol.TType.MAP, (short)7);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new QueryResponseStandardSchemeFactory());
    schemes.put(TupleScheme.class, new QueryResponseTupleSchemeFactory());
  }

  /**
   * 返回码, 0000 代表处理成功
   */
  public String retCode; // required
  /**
   * 返回信息，是对返回码的详细描述
   */
  public String retMsg; // optional
  /**
   * 订单号。返回码为0000时，该字段不能为空
   */
  public String orderNum; // optional
  /**
   * 支付平台生成的流水号,返回码为0000时,该字段不为空
   */
  public String traceNum; // optional
  /**
   * 支付金额
   */
  public long amount; // optional
  /**
   * 支付状态,SUCCESS,FAIL,HANDING
   */
  public String payState; // optional
  /**
   * 额外的返回信息
   */
  public Map<String,String> extraInfos; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 返回码, 0000 代表处理成功
     */
    RET_CODE((short)1, "retCode"),
    /**
     * 返回信息，是对返回码的详细描述
     */
    RET_MSG((short)2, "retMsg"),
    /**
     * 订单号。返回码为0000时，该字段不能为空
     */
    ORDER_NUM((short)3, "orderNum"),
    /**
     * 支付平台生成的流水号,返回码为0000时,该字段不为空
     */
    TRACE_NUM((short)4, "traceNum"),
    /**
     * 支付金额
     */
    AMOUNT((short)5, "amount"),
    /**
     * 支付状态,SUCCESS,FAIL,HANDING
     */
    PAY_STATE((short)6, "payState"),
    /**
     * 额外的返回信息
     */
    EXTRA_INFOS((short)7, "extraInfos");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // RET_CODE
          return RET_CODE;
        case 2: // RET_MSG
          return RET_MSG;
        case 3: // ORDER_NUM
          return ORDER_NUM;
        case 4: // TRACE_NUM
          return TRACE_NUM;
        case 5: // AMOUNT
          return AMOUNT;
        case 6: // PAY_STATE
          return PAY_STATE;
        case 7: // EXTRA_INFOS
          return EXTRA_INFOS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __AMOUNT_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private _Fields optionals[] = {_Fields.RET_MSG,_Fields.ORDER_NUM,_Fields.TRACE_NUM,_Fields.AMOUNT,_Fields.PAY_STATE,_Fields.EXTRA_INFOS};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.RET_CODE, new org.apache.thrift.meta_data.FieldMetaData("retCode", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.RET_MSG, new org.apache.thrift.meta_data.FieldMetaData("retMsg", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ORDER_NUM, new org.apache.thrift.meta_data.FieldMetaData("orderNum", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TRACE_NUM, new org.apache.thrift.meta_data.FieldMetaData("traceNum", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.AMOUNT, new org.apache.thrift.meta_data.FieldMetaData("amount", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.PAY_STATE, new org.apache.thrift.meta_data.FieldMetaData("payState", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.EXTRA_INFOS, new org.apache.thrift.meta_data.FieldMetaData("extraInfos", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(QueryResponse.class, metaDataMap);
  }

  public QueryResponse() {
  }

  public QueryResponse(
    String retCode)
  {
    this();
    this.retCode = retCode;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public QueryResponse(QueryResponse other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetRetCode()) {
      this.retCode = other.retCode;
    }
    if (other.isSetRetMsg()) {
      this.retMsg = other.retMsg;
    }
    if (other.isSetOrderNum()) {
      this.orderNum = other.orderNum;
    }
    if (other.isSetTraceNum()) {
      this.traceNum = other.traceNum;
    }
    this.amount = other.amount;
    if (other.isSetPayState()) {
      this.payState = other.payState;
    }
    if (other.isSetExtraInfos()) {
      Map<String,String> __this__extraInfos = new HashMap<String,String>();
      for (Map.Entry<String, String> other_element : other.extraInfos.entrySet()) {

        String other_element_key = other_element.getKey();
        String other_element_value = other_element.getValue();

        String __this__extraInfos_copy_key = other_element_key;

        String __this__extraInfos_copy_value = other_element_value;

        __this__extraInfos.put(__this__extraInfos_copy_key, __this__extraInfos_copy_value);
      }
      this.extraInfos = __this__extraInfos;
    }
  }

  public QueryResponse deepCopy() {
    return new QueryResponse(this);
  }

  @Override
  public void clear() {
    this.retCode = null;
    this.retMsg = null;
    this.orderNum = null;
    this.traceNum = null;
    setAmountIsSet(false);
    this.amount = 0;
    this.payState = null;
    this.extraInfos = null;
  }

  /**
   * 返回码, 0000 代表处理成功
   */
  public String getRetCode() {
    return this.retCode;
  }

  /**
   * 返回码, 0000 代表处理成功
   */
  public QueryResponse setRetCode(String retCode) {
    this.retCode = retCode;
    return this;
  }

  public void unsetRetCode() {
    this.retCode = null;
  }

  /** Returns true if field retCode is set (has been assigned a value) and false otherwise */
  public boolean isSetRetCode() {
    return this.retCode != null;
  }

  public void setRetCodeIsSet(boolean value) {
    if (!value) {
      this.retCode = null;
    }
  }

  /**
   * 返回信息，是对返回码的详细描述
   */
  public String getRetMsg() {
    return this.retMsg;
  }

  /**
   * 返回信息，是对返回码的详细描述
   */
  public QueryResponse setRetMsg(String retMsg) {
    this.retMsg = retMsg;
    return this;
  }

  public void unsetRetMsg() {
    this.retMsg = null;
  }

  /** Returns true if field retMsg is set (has been assigned a value) and false otherwise */
  public boolean isSetRetMsg() {
    return this.retMsg != null;
  }

  public void setRetMsgIsSet(boolean value) {
    if (!value) {
      this.retMsg = null;
    }
  }

  /**
   * 订单号。返回码为0000时，该字段不能为空
   */
  public String getOrderNum() {
    return this.orderNum;
  }

  /**
   * 订单号。返回码为0000时，该字段不能为空
   */
  public QueryResponse setOrderNum(String orderNum) {
    this.orderNum = orderNum;
    return this;
  }

  public void unsetOrderNum() {
    this.orderNum = null;
  }

  /** Returns true if field orderNum is set (has been assigned a value) and false otherwise */
  public boolean isSetOrderNum() {
    return this.orderNum != null;
  }

  public void setOrderNumIsSet(boolean value) {
    if (!value) {
      this.orderNum = null;
    }
  }

  /**
   * 支付平台生成的流水号,返回码为0000时,该字段不为空
   */
  public String getTraceNum() {
    return this.traceNum;
  }

  /**
   * 支付平台生成的流水号,返回码为0000时,该字段不为空
   */
  public QueryResponse setTraceNum(String traceNum) {
    this.traceNum = traceNum;
    return this;
  }

  public void unsetTraceNum() {
    this.traceNum = null;
  }

  /** Returns true if field traceNum is set (has been assigned a value) and false otherwise */
  public boolean isSetTraceNum() {
    return this.traceNum != null;
  }

  public void setTraceNumIsSet(boolean value) {
    if (!value) {
      this.traceNum = null;
    }
  }

  /**
   * 支付金额
   */
  public long getAmount() {
    return this.amount;
  }

  /**
   * 支付金额
   */
  public QueryResponse setAmount(long amount) {
    this.amount = amount;
    setAmountIsSet(true);
    return this;
  }

  public void unsetAmount() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __AMOUNT_ISSET_ID);
  }

  /** Returns true if field amount is set (has been assigned a value) and false otherwise */
  public boolean isSetAmount() {
    return EncodingUtils.testBit(__isset_bitfield, __AMOUNT_ISSET_ID);
  }

  public void setAmountIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __AMOUNT_ISSET_ID, value);
  }

  /**
   * 支付状态,SUCCESS,FAIL,HANDING
   */
  public String getPayState() {
    return this.payState;
  }

  /**
   * 支付状态,SUCCESS,FAIL,HANDING
   */
  public QueryResponse setPayState(String payState) {
    this.payState = payState;
    return this;
  }

  public void unsetPayState() {
    this.payState = null;
  }

  /** Returns true if field payState is set (has been assigned a value) and false otherwise */
  public boolean isSetPayState() {
    return this.payState != null;
  }

  public void setPayStateIsSet(boolean value) {
    if (!value) {
      this.payState = null;
    }
  }

  public int getExtraInfosSize() {
    return (this.extraInfos == null) ? 0 : this.extraInfos.size();
  }

  public void putToExtraInfos(String key, String val) {
    if (this.extraInfos == null) {
      this.extraInfos = new HashMap<String,String>();
    }
    this.extraInfos.put(key, val);
  }

  /**
   * 额外的返回信息
   */
  public Map<String,String> getExtraInfos() {
    return this.extraInfos;
  }

  /**
   * 额外的返回信息
   */
  public QueryResponse setExtraInfos(Map<String,String> extraInfos) {
    this.extraInfos = extraInfos;
    return this;
  }

  public void unsetExtraInfos() {
    this.extraInfos = null;
  }

  /** Returns true if field extraInfos is set (has been assigned a value) and false otherwise */
  public boolean isSetExtraInfos() {
    return this.extraInfos != null;
  }

  public void setExtraInfosIsSet(boolean value) {
    if (!value) {
      this.extraInfos = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case RET_CODE:
      if (value == null) {
        unsetRetCode();
      } else {
        setRetCode((String)value);
      }
      break;

    case RET_MSG:
      if (value == null) {
        unsetRetMsg();
      } else {
        setRetMsg((String)value);
      }
      break;

    case ORDER_NUM:
      if (value == null) {
        unsetOrderNum();
      } else {
        setOrderNum((String)value);
      }
      break;

    case TRACE_NUM:
      if (value == null) {
        unsetTraceNum();
      } else {
        setTraceNum((String)value);
      }
      break;

    case AMOUNT:
      if (value == null) {
        unsetAmount();
      } else {
        setAmount((Long)value);
      }
      break;

    case PAY_STATE:
      if (value == null) {
        unsetPayState();
      } else {
        setPayState((String)value);
      }
      break;

    case EXTRA_INFOS:
      if (value == null) {
        unsetExtraInfos();
      } else {
        setExtraInfos((Map<String,String>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case RET_CODE:
      return getRetCode();

    case RET_MSG:
      return getRetMsg();

    case ORDER_NUM:
      return getOrderNum();

    case TRACE_NUM:
      return getTraceNum();

    case AMOUNT:
      return Long.valueOf(getAmount());

    case PAY_STATE:
      return getPayState();

    case EXTRA_INFOS:
      return getExtraInfos();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case RET_CODE:
      return isSetRetCode();
    case RET_MSG:
      return isSetRetMsg();
    case ORDER_NUM:
      return isSetOrderNum();
    case TRACE_NUM:
      return isSetTraceNum();
    case AMOUNT:
      return isSetAmount();
    case PAY_STATE:
      return isSetPayState();
    case EXTRA_INFOS:
      return isSetExtraInfos();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof QueryResponse)
      return this.equals((QueryResponse)that);
    return false;
  }

  public boolean equals(QueryResponse that) {
    if (that == null)
      return false;

    boolean this_present_retCode = true && this.isSetRetCode();
    boolean that_present_retCode = true && that.isSetRetCode();
    if (this_present_retCode || that_present_retCode) {
      if (!(this_present_retCode && that_present_retCode))
        return false;
      if (!this.retCode.equals(that.retCode))
        return false;
    }

    boolean this_present_retMsg = true && this.isSetRetMsg();
    boolean that_present_retMsg = true && that.isSetRetMsg();
    if (this_present_retMsg || that_present_retMsg) {
      if (!(this_present_retMsg && that_present_retMsg))
        return false;
      if (!this.retMsg.equals(that.retMsg))
        return false;
    }

    boolean this_present_orderNum = true && this.isSetOrderNum();
    boolean that_present_orderNum = true && that.isSetOrderNum();
    if (this_present_orderNum || that_present_orderNum) {
      if (!(this_present_orderNum && that_present_orderNum))
        return false;
      if (!this.orderNum.equals(that.orderNum))
        return false;
    }

    boolean this_present_traceNum = true && this.isSetTraceNum();
    boolean that_present_traceNum = true && that.isSetTraceNum();
    if (this_present_traceNum || that_present_traceNum) {
      if (!(this_present_traceNum && that_present_traceNum))
        return false;
      if (!this.traceNum.equals(that.traceNum))
        return false;
    }

    boolean this_present_amount = true && this.isSetAmount();
    boolean that_present_amount = true && that.isSetAmount();
    if (this_present_amount || that_present_amount) {
      if (!(this_present_amount && that_present_amount))
        return false;
      if (this.amount != that.amount)
        return false;
    }

    boolean this_present_payState = true && this.isSetPayState();
    boolean that_present_payState = true && that.isSetPayState();
    if (this_present_payState || that_present_payState) {
      if (!(this_present_payState && that_present_payState))
        return false;
      if (!this.payState.equals(that.payState))
        return false;
    }

    boolean this_present_extraInfos = true && this.isSetExtraInfos();
    boolean that_present_extraInfos = true && that.isSetExtraInfos();
    if (this_present_extraInfos || that_present_extraInfos) {
      if (!(this_present_extraInfos && that_present_extraInfos))
        return false;
      if (!this.extraInfos.equals(that.extraInfos))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(QueryResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    QueryResponse typedOther = (QueryResponse)other;

    lastComparison = Boolean.valueOf(isSetRetCode()).compareTo(typedOther.isSetRetCode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRetCode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.retCode, typedOther.retCode);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRetMsg()).compareTo(typedOther.isSetRetMsg());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRetMsg()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.retMsg, typedOther.retMsg);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetOrderNum()).compareTo(typedOther.isSetOrderNum());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOrderNum()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.orderNum, typedOther.orderNum);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTraceNum()).compareTo(typedOther.isSetTraceNum());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTraceNum()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.traceNum, typedOther.traceNum);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAmount()).compareTo(typedOther.isSetAmount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAmount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.amount, typedOther.amount);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPayState()).compareTo(typedOther.isSetPayState());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPayState()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.payState, typedOther.payState);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetExtraInfos()).compareTo(typedOther.isSetExtraInfos());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExtraInfos()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.extraInfos, typedOther.extraInfos);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("QueryResponse(");
    boolean first = true;

    sb.append("retCode:");
    if (this.retCode == null) {
      sb.append("null");
    } else {
      sb.append(this.retCode);
    }
    first = false;
    if (isSetRetMsg()) {
      if (!first) sb.append(", ");
      sb.append("retMsg:");
      if (this.retMsg == null) {
        sb.append("null");
      } else {
        sb.append(this.retMsg);
      }
      first = false;
    }
    if (isSetOrderNum()) {
      if (!first) sb.append(", ");
      sb.append("orderNum:");
      if (this.orderNum == null) {
        sb.append("null");
      } else {
        sb.append(this.orderNum);
      }
      first = false;
    }
    if (isSetTraceNum()) {
      if (!first) sb.append(", ");
      sb.append("traceNum:");
      if (this.traceNum == null) {
        sb.append("null");
      } else {
        sb.append(this.traceNum);
      }
      first = false;
    }
    if (isSetAmount()) {
      if (!first) sb.append(", ");
      sb.append("amount:");
      sb.append(this.amount);
      first = false;
    }
    if (isSetPayState()) {
      if (!first) sb.append(", ");
      sb.append("payState:");
      if (this.payState == null) {
        sb.append("null");
      } else {
        sb.append(this.payState);
      }
      first = false;
    }
    if (isSetExtraInfos()) {
      if (!first) sb.append(", ");
      sb.append("extraInfos:");
      if (this.extraInfos == null) {
        sb.append("null");
      } else {
        sb.append(this.extraInfos);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (retCode == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'retCode' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class QueryResponseStandardSchemeFactory implements SchemeFactory {
    public QueryResponseStandardScheme getScheme() {
      return new QueryResponseStandardScheme();
    }
  }

  private static class QueryResponseStandardScheme extends StandardScheme<QueryResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, QueryResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // RET_CODE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.retCode = iprot.readString();
              struct.setRetCodeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // RET_MSG
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.retMsg = iprot.readString();
              struct.setRetMsgIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // ORDER_NUM
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.orderNum = iprot.readString();
              struct.setOrderNumIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // TRACE_NUM
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.traceNum = iprot.readString();
              struct.setTraceNumIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // AMOUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.amount = iprot.readI64();
              struct.setAmountIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // PAY_STATE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.payState = iprot.readString();
              struct.setPayStateIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // EXTRA_INFOS
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map30 = iprot.readMapBegin();
                struct.extraInfos = new HashMap<String,String>(2*_map30.size);
                for (int _i31 = 0; _i31 < _map30.size; ++_i31)
                {
                  String _key32; // required
                  String _val33; // required
                  _key32 = iprot.readString();
                  _val33 = iprot.readString();
                  struct.extraInfos.put(_key32, _val33);
                }
                iprot.readMapEnd();
              }
              struct.setExtraInfosIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, QueryResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.retCode != null) {
        oprot.writeFieldBegin(RET_CODE_FIELD_DESC);
        oprot.writeString(struct.retCode);
        oprot.writeFieldEnd();
      }
      if (struct.retMsg != null) {
        if (struct.isSetRetMsg()) {
          oprot.writeFieldBegin(RET_MSG_FIELD_DESC);
          oprot.writeString(struct.retMsg);
          oprot.writeFieldEnd();
        }
      }
      if (struct.orderNum != null) {
        if (struct.isSetOrderNum()) {
          oprot.writeFieldBegin(ORDER_NUM_FIELD_DESC);
          oprot.writeString(struct.orderNum);
          oprot.writeFieldEnd();
        }
      }
      if (struct.traceNum != null) {
        if (struct.isSetTraceNum()) {
          oprot.writeFieldBegin(TRACE_NUM_FIELD_DESC);
          oprot.writeString(struct.traceNum);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetAmount()) {
        oprot.writeFieldBegin(AMOUNT_FIELD_DESC);
        oprot.writeI64(struct.amount);
        oprot.writeFieldEnd();
      }
      if (struct.payState != null) {
        if (struct.isSetPayState()) {
          oprot.writeFieldBegin(PAY_STATE_FIELD_DESC);
          oprot.writeString(struct.payState);
          oprot.writeFieldEnd();
        }
      }
      if (struct.extraInfos != null) {
        if (struct.isSetExtraInfos()) {
          oprot.writeFieldBegin(EXTRA_INFOS_FIELD_DESC);
          {
            oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, struct.extraInfos.size()));
            for (Map.Entry<String, String> _iter34 : struct.extraInfos.entrySet())
            {
              oprot.writeString(_iter34.getKey());
              oprot.writeString(_iter34.getValue());
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class QueryResponseTupleSchemeFactory implements SchemeFactory {
    public QueryResponseTupleScheme getScheme() {
      return new QueryResponseTupleScheme();
    }
  }

  private static class QueryResponseTupleScheme extends TupleScheme<QueryResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, QueryResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.retCode);
      BitSet optionals = new BitSet();
      if (struct.isSetRetMsg()) {
        optionals.set(0);
      }
      if (struct.isSetOrderNum()) {
        optionals.set(1);
      }
      if (struct.isSetTraceNum()) {
        optionals.set(2);
      }
      if (struct.isSetAmount()) {
        optionals.set(3);
      }
      if (struct.isSetPayState()) {
        optionals.set(4);
      }
      if (struct.isSetExtraInfos()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetRetMsg()) {
        oprot.writeString(struct.retMsg);
      }
      if (struct.isSetOrderNum()) {
        oprot.writeString(struct.orderNum);
      }
      if (struct.isSetTraceNum()) {
        oprot.writeString(struct.traceNum);
      }
      if (struct.isSetAmount()) {
        oprot.writeI64(struct.amount);
      }
      if (struct.isSetPayState()) {
        oprot.writeString(struct.payState);
      }
      if (struct.isSetExtraInfos()) {
        {
          oprot.writeI32(struct.extraInfos.size());
          for (Map.Entry<String, String> _iter35 : struct.extraInfos.entrySet())
          {
            oprot.writeString(_iter35.getKey());
            oprot.writeString(_iter35.getValue());
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, QueryResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.retCode = iprot.readString();
      struct.setRetCodeIsSet(true);
      BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.retMsg = iprot.readString();
        struct.setRetMsgIsSet(true);
      }
      if (incoming.get(1)) {
        struct.orderNum = iprot.readString();
        struct.setOrderNumIsSet(true);
      }
      if (incoming.get(2)) {
        struct.traceNum = iprot.readString();
        struct.setTraceNumIsSet(true);
      }
      if (incoming.get(3)) {
        struct.amount = iprot.readI64();
        struct.setAmountIsSet(true);
      }
      if (incoming.get(4)) {
        struct.payState = iprot.readString();
        struct.setPayStateIsSet(true);
      }
      if (incoming.get(5)) {
        {
          org.apache.thrift.protocol.TMap _map36 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.extraInfos = new HashMap<String,String>(2*_map36.size);
          for (int _i37 = 0; _i37 < _map36.size; ++_i37)
          {
            String _key38; // required
            String _val39; // required
            _key38 = iprot.readString();
            _val39 = iprot.readString();
            struct.extraInfos.put(_key38, _val39);
          }
        }
        struct.setExtraInfosIsSet(true);
      }
    }
  }

}

