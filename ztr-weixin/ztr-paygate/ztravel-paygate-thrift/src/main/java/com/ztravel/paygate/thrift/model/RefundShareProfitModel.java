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
 * 退款时的退分润请求
 */
public class RefundShareProfitModel implements org.apache.thrift.TBase<RefundShareProfitModel, RefundShareProfitModel._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("RefundShareProfitModel");

  private static final org.apache.thrift.protocol.TField REFUND_ACCOUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("refundAccount", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField AMOUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("amount", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField COMMENT_FIELD_DESC = new org.apache.thrift.protocol.TField("comment", org.apache.thrift.protocol.TType.STRING, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new RefundShareProfitModelStandardSchemeFactory());
    schemes.put(TupleScheme.class, new RefundShareProfitModelTupleSchemeFactory());
  }

  /**
   * 原分润方账户
   */
  public String refundAccount; // required
  /**
   * 退分润金额
   */
  public long amount; // required
  /**
   * 退分润备注
   */
  public String comment; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 原分润方账户
     */
    REFUND_ACCOUNT((short)1, "refundAccount"),
    /**
     * 退分润金额
     */
    AMOUNT((short)2, "amount"),
    /**
     * 退分润备注
     */
    COMMENT((short)3, "comment");

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
        case 1: // REFUND_ACCOUNT
          return REFUND_ACCOUNT;
        case 2: // AMOUNT
          return AMOUNT;
        case 3: // COMMENT
          return COMMENT;
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
  private _Fields optionals[] = {_Fields.COMMENT};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.REFUND_ACCOUNT, new org.apache.thrift.meta_data.FieldMetaData("refundAccount", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.AMOUNT, new org.apache.thrift.meta_data.FieldMetaData("amount", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.COMMENT, new org.apache.thrift.meta_data.FieldMetaData("comment", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(RefundShareProfitModel.class, metaDataMap);
  }

  public RefundShareProfitModel() {
  }

  public RefundShareProfitModel(
    String refundAccount,
    long amount)
  {
    this();
    this.refundAccount = refundAccount;
    this.amount = amount;
    setAmountIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public RefundShareProfitModel(RefundShareProfitModel other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetRefundAccount()) {
      this.refundAccount = other.refundAccount;
    }
    this.amount = other.amount;
    if (other.isSetComment()) {
      this.comment = other.comment;
    }
  }

  public RefundShareProfitModel deepCopy() {
    return new RefundShareProfitModel(this);
  }

  @Override
  public void clear() {
    this.refundAccount = null;
    setAmountIsSet(false);
    this.amount = 0;
    this.comment = null;
  }

  /**
   * 原分润方账户
   */
  public String getRefundAccount() {
    return this.refundAccount;
  }

  /**
   * 原分润方账户
   */
  public RefundShareProfitModel setRefundAccount(String refundAccount) {
    this.refundAccount = refundAccount;
    return this;
  }

  public void unsetRefundAccount() {
    this.refundAccount = null;
  }

  /** Returns true if field refundAccount is set (has been assigned a value) and false otherwise */
  public boolean isSetRefundAccount() {
    return this.refundAccount != null;
  }

  public void setRefundAccountIsSet(boolean value) {
    if (!value) {
      this.refundAccount = null;
    }
  }

  /**
   * 退分润金额
   */
  public long getAmount() {
    return this.amount;
  }

  /**
   * 退分润金额
   */
  public RefundShareProfitModel setAmount(long amount) {
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
   * 退分润备注
   */
  public String getComment() {
    return this.comment;
  }

  /**
   * 退分润备注
   */
  public RefundShareProfitModel setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public void unsetComment() {
    this.comment = null;
  }

  /** Returns true if field comment is set (has been assigned a value) and false otherwise */
  public boolean isSetComment() {
    return this.comment != null;
  }

  public void setCommentIsSet(boolean value) {
    if (!value) {
      this.comment = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case REFUND_ACCOUNT:
      if (value == null) {
        unsetRefundAccount();
      } else {
        setRefundAccount((String)value);
      }
      break;

    case AMOUNT:
      if (value == null) {
        unsetAmount();
      } else {
        setAmount((Long)value);
      }
      break;

    case COMMENT:
      if (value == null) {
        unsetComment();
      } else {
        setComment((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case REFUND_ACCOUNT:
      return getRefundAccount();

    case AMOUNT:
      return Long.valueOf(getAmount());

    case COMMENT:
      return getComment();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case REFUND_ACCOUNT:
      return isSetRefundAccount();
    case AMOUNT:
      return isSetAmount();
    case COMMENT:
      return isSetComment();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof RefundShareProfitModel)
      return this.equals((RefundShareProfitModel)that);
    return false;
  }

  public boolean equals(RefundShareProfitModel that) {
    if (that == null)
      return false;

    boolean this_present_refundAccount = true && this.isSetRefundAccount();
    boolean that_present_refundAccount = true && that.isSetRefundAccount();
    if (this_present_refundAccount || that_present_refundAccount) {
      if (!(this_present_refundAccount && that_present_refundAccount))
        return false;
      if (!this.refundAccount.equals(that.refundAccount))
        return false;
    }

    boolean this_present_amount = true;
    boolean that_present_amount = true;
    if (this_present_amount || that_present_amount) {
      if (!(this_present_amount && that_present_amount))
        return false;
      if (this.amount != that.amount)
        return false;
    }

    boolean this_present_comment = true && this.isSetComment();
    boolean that_present_comment = true && that.isSetComment();
    if (this_present_comment || that_present_comment) {
      if (!(this_present_comment && that_present_comment))
        return false;
      if (!this.comment.equals(that.comment))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(RefundShareProfitModel other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    RefundShareProfitModel typedOther = (RefundShareProfitModel)other;

    lastComparison = Boolean.valueOf(isSetRefundAccount()).compareTo(typedOther.isSetRefundAccount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRefundAccount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.refundAccount, typedOther.refundAccount);
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
    lastComparison = Boolean.valueOf(isSetComment()).compareTo(typedOther.isSetComment());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetComment()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.comment, typedOther.comment);
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
    StringBuilder sb = new StringBuilder("RefundShareProfitModel(");
    boolean first = true;

    sb.append("refundAccount:");
    if (this.refundAccount == null) {
      sb.append("null");
    } else {
      sb.append(this.refundAccount);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("amount:");
    sb.append(this.amount);
    first = false;
    if (isSetComment()) {
      if (!first) sb.append(", ");
      sb.append("comment:");
      if (this.comment == null) {
        sb.append("null");
      } else {
        sb.append(this.comment);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (refundAccount == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'refundAccount' was not present! Struct: " + toString());
    }
    // alas, we cannot check 'amount' because it's a primitive and you chose the non-beans generator.
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

  private static class RefundShareProfitModelStandardSchemeFactory implements SchemeFactory {
    public RefundShareProfitModelStandardScheme getScheme() {
      return new RefundShareProfitModelStandardScheme();
    }
  }

  private static class RefundShareProfitModelStandardScheme extends StandardScheme<RefundShareProfitModel> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, RefundShareProfitModel struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // REFUND_ACCOUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.refundAccount = iprot.readString();
              struct.setRefundAccountIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // AMOUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.amount = iprot.readI64();
              struct.setAmountIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // COMMENT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.comment = iprot.readString();
              struct.setCommentIsSet(true);
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
      if (!struct.isSetAmount()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'amount' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, RefundShareProfitModel struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.refundAccount != null) {
        oprot.writeFieldBegin(REFUND_ACCOUNT_FIELD_DESC);
        oprot.writeString(struct.refundAccount);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(AMOUNT_FIELD_DESC);
      oprot.writeI64(struct.amount);
      oprot.writeFieldEnd();
      if (struct.comment != null) {
        if (struct.isSetComment()) {
          oprot.writeFieldBegin(COMMENT_FIELD_DESC);
          oprot.writeString(struct.comment);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class RefundShareProfitModelTupleSchemeFactory implements SchemeFactory {
    public RefundShareProfitModelTupleScheme getScheme() {
      return new RefundShareProfitModelTupleScheme();
    }
  }

  private static class RefundShareProfitModelTupleScheme extends TupleScheme<RefundShareProfitModel> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, RefundShareProfitModel struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.refundAccount);
      oprot.writeI64(struct.amount);
      BitSet optionals = new BitSet();
      if (struct.isSetComment()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetComment()) {
        oprot.writeString(struct.comment);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, RefundShareProfitModel struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.refundAccount = iprot.readString();
      struct.setRefundAccountIsSet(true);
      struct.amount = iprot.readI64();
      struct.setAmountIsSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.comment = iprot.readString();
        struct.setCommentIsSet(true);
      }
    }
  }

}
