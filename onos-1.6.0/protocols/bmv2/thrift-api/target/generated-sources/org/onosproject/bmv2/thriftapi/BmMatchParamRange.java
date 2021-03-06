/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.onosproject.bmv2.thriftapi;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
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
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2018-03-14")
public class BmMatchParamRange implements org.apache.thrift.TBase<BmMatchParamRange, BmMatchParamRange._Fields>, java.io.Serializable, Cloneable, Comparable<BmMatchParamRange> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("BmMatchParamRange");

  private static final org.apache.thrift.protocol.TField START_FIELD_DESC = new org.apache.thrift.protocol.TField("start", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField END__FIELD_DESC = new org.apache.thrift.protocol.TField("end_", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new BmMatchParamRangeStandardSchemeFactory());
    schemes.put(TupleScheme.class, new BmMatchParamRangeTupleSchemeFactory());
  }

  public ByteBuffer start; // required
  public ByteBuffer end_; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    START((short)1, "start"),
    END_((short)2, "end_");

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
        case 1: // START
          return START;
        case 2: // END_
          return END_;
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
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.START, new org.apache.thrift.meta_data.FieldMetaData("start", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    tmpMap.put(_Fields.END_, new org.apache.thrift.meta_data.FieldMetaData("end_", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(BmMatchParamRange.class, metaDataMap);
  }

  public BmMatchParamRange() {
  }

  public BmMatchParamRange(
    ByteBuffer start,
    ByteBuffer end_)
  {
    this();
    this.start = org.apache.thrift.TBaseHelper.copyBinary(start);
    this.end_ = org.apache.thrift.TBaseHelper.copyBinary(end_);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public BmMatchParamRange(BmMatchParamRange other) {
    if (other.isSetStart()) {
      this.start = org.apache.thrift.TBaseHelper.copyBinary(other.start);
    }
    if (other.isSetEnd_()) {
      this.end_ = org.apache.thrift.TBaseHelper.copyBinary(other.end_);
    }
  }

  public BmMatchParamRange deepCopy() {
    return new BmMatchParamRange(this);
  }

  @Override
  public void clear() {
    this.start = null;
    this.end_ = null;
  }

  public byte[] getStart() {
    setStart(org.apache.thrift.TBaseHelper.rightSize(start));
    return start == null ? null : start.array();
  }

  public ByteBuffer bufferForStart() {
    return org.apache.thrift.TBaseHelper.copyBinary(start);
  }

  public BmMatchParamRange setStart(byte[] start) {
    this.start = start == null ? (ByteBuffer)null : ByteBuffer.wrap(Arrays.copyOf(start, start.length));
    return this;
  }

  public BmMatchParamRange setStart(ByteBuffer start) {
    this.start = org.apache.thrift.TBaseHelper.copyBinary(start);
    return this;
  }

  public void unsetStart() {
    this.start = null;
  }

  /** Returns true if field start is set (has been assigned a value) and false otherwise */
  public boolean isSetStart() {
    return this.start != null;
  }

  public void setStartIsSet(boolean value) {
    if (!value) {
      this.start = null;
    }
  }

  public byte[] getEnd_() {
    setEnd_(org.apache.thrift.TBaseHelper.rightSize(end_));
    return end_ == null ? null : end_.array();
  }

  public ByteBuffer bufferForEnd_() {
    return org.apache.thrift.TBaseHelper.copyBinary(end_);
  }

  public BmMatchParamRange setEnd_(byte[] end_) {
    this.end_ = end_ == null ? (ByteBuffer)null : ByteBuffer.wrap(Arrays.copyOf(end_, end_.length));
    return this;
  }

  public BmMatchParamRange setEnd_(ByteBuffer end_) {
    this.end_ = org.apache.thrift.TBaseHelper.copyBinary(end_);
    return this;
  }

  public void unsetEnd_() {
    this.end_ = null;
  }

  /** Returns true if field end_ is set (has been assigned a value) and false otherwise */
  public boolean isSetEnd_() {
    return this.end_ != null;
  }

  public void setEnd_IsSet(boolean value) {
    if (!value) {
      this.end_ = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case START:
      if (value == null) {
        unsetStart();
      } else {
        setStart((ByteBuffer)value);
      }
      break;

    case END_:
      if (value == null) {
        unsetEnd_();
      } else {
        setEnd_((ByteBuffer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case START:
      return getStart();

    case END_:
      return getEnd_();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case START:
      return isSetStart();
    case END_:
      return isSetEnd_();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof BmMatchParamRange)
      return this.equals((BmMatchParamRange)that);
    return false;
  }

  public boolean equals(BmMatchParamRange that) {
    if (that == null)
      return false;

    boolean this_present_start = true && this.isSetStart();
    boolean that_present_start = true && that.isSetStart();
    if (this_present_start || that_present_start) {
      if (!(this_present_start && that_present_start))
        return false;
      if (!this.start.equals(that.start))
        return false;
    }

    boolean this_present_end_ = true && this.isSetEnd_();
    boolean that_present_end_ = true && that.isSetEnd_();
    if (this_present_end_ || that_present_end_) {
      if (!(this_present_end_ && that_present_end_))
        return false;
      if (!this.end_.equals(that.end_))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_start = true && (isSetStart());
    list.add(present_start);
    if (present_start)
      list.add(start);

    boolean present_end_ = true && (isSetEnd_());
    list.add(present_end_);
    if (present_end_)
      list.add(end_);

    return list.hashCode();
  }

  @Override
  public int compareTo(BmMatchParamRange other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetStart()).compareTo(other.isSetStart());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStart()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.start, other.start);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetEnd_()).compareTo(other.isSetEnd_());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEnd_()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.end_, other.end_);
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
    StringBuilder sb = new StringBuilder("BmMatchParamRange(");
    boolean first = true;

    sb.append("start:");
    if (this.start == null) {
      sb.append("null");
    } else {
      org.apache.thrift.TBaseHelper.toString(this.start, sb);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("end_:");
    if (this.end_ == null) {
      sb.append("null");
    } else {
      org.apache.thrift.TBaseHelper.toString(this.end_, sb);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class BmMatchParamRangeStandardSchemeFactory implements SchemeFactory {
    public BmMatchParamRangeStandardScheme getScheme() {
      return new BmMatchParamRangeStandardScheme();
    }
  }

  private static class BmMatchParamRangeStandardScheme extends StandardScheme<BmMatchParamRange> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, BmMatchParamRange struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // START
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.start = iprot.readBinary();
              struct.setStartIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // END_
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.end_ = iprot.readBinary();
              struct.setEnd_IsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, BmMatchParamRange struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.start != null) {
        oprot.writeFieldBegin(START_FIELD_DESC);
        oprot.writeBinary(struct.start);
        oprot.writeFieldEnd();
      }
      if (struct.end_ != null) {
        oprot.writeFieldBegin(END__FIELD_DESC);
        oprot.writeBinary(struct.end_);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class BmMatchParamRangeTupleSchemeFactory implements SchemeFactory {
    public BmMatchParamRangeTupleScheme getScheme() {
      return new BmMatchParamRangeTupleScheme();
    }
  }

  private static class BmMatchParamRangeTupleScheme extends TupleScheme<BmMatchParamRange> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, BmMatchParamRange struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetStart()) {
        optionals.set(0);
      }
      if (struct.isSetEnd_()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetStart()) {
        oprot.writeBinary(struct.start);
      }
      if (struct.isSetEnd_()) {
        oprot.writeBinary(struct.end_);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, BmMatchParamRange struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.start = iprot.readBinary();
        struct.setStartIsSet(true);
      }
      if (incoming.get(1)) {
        struct.end_ = iprot.readBinary();
        struct.setEnd_IsSet(true);
      }
    }
  }

}

