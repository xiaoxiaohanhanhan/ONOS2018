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
public class BmCrc32Config implements org.apache.thrift.TBase<BmCrc32Config, BmCrc32Config._Fields>, java.io.Serializable, Cloneable, Comparable<BmCrc32Config> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("BmCrc32Config");

  private static final org.apache.thrift.protocol.TField POLYNOMIAL_FIELD_DESC = new org.apache.thrift.protocol.TField("polynomial", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField INITIAL_REMAINDER_FIELD_DESC = new org.apache.thrift.protocol.TField("initial_remainder", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField FINAL_XOR_VALUE_FIELD_DESC = new org.apache.thrift.protocol.TField("final_xor_value", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField DATA_REFLECTED_FIELD_DESC = new org.apache.thrift.protocol.TField("data_reflected", org.apache.thrift.protocol.TType.BOOL, (short)4);
  private static final org.apache.thrift.protocol.TField REMAINDER_REFLECTED_FIELD_DESC = new org.apache.thrift.protocol.TField("remainder_reflected", org.apache.thrift.protocol.TType.BOOL, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new BmCrc32ConfigStandardSchemeFactory());
    schemes.put(TupleScheme.class, new BmCrc32ConfigTupleSchemeFactory());
  }

  public int polynomial; // required
  public int initial_remainder; // required
  public int final_xor_value; // required
  public boolean data_reflected; // required
  public boolean remainder_reflected; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    POLYNOMIAL((short)1, "polynomial"),
    INITIAL_REMAINDER((short)2, "initial_remainder"),
    FINAL_XOR_VALUE((short)3, "final_xor_value"),
    DATA_REFLECTED((short)4, "data_reflected"),
    REMAINDER_REFLECTED((short)5, "remainder_reflected");

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
        case 1: // POLYNOMIAL
          return POLYNOMIAL;
        case 2: // INITIAL_REMAINDER
          return INITIAL_REMAINDER;
        case 3: // FINAL_XOR_VALUE
          return FINAL_XOR_VALUE;
        case 4: // DATA_REFLECTED
          return DATA_REFLECTED;
        case 5: // REMAINDER_REFLECTED
          return REMAINDER_REFLECTED;
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
  private static final int __POLYNOMIAL_ISSET_ID = 0;
  private static final int __INITIAL_REMAINDER_ISSET_ID = 1;
  private static final int __FINAL_XOR_VALUE_ISSET_ID = 2;
  private static final int __DATA_REFLECTED_ISSET_ID = 3;
  private static final int __REMAINDER_REFLECTED_ISSET_ID = 4;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.POLYNOMIAL, new org.apache.thrift.meta_data.FieldMetaData("polynomial", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.INITIAL_REMAINDER, new org.apache.thrift.meta_data.FieldMetaData("initial_remainder", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.FINAL_XOR_VALUE, new org.apache.thrift.meta_data.FieldMetaData("final_xor_value", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.DATA_REFLECTED, new org.apache.thrift.meta_data.FieldMetaData("data_reflected", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.REMAINDER_REFLECTED, new org.apache.thrift.meta_data.FieldMetaData("remainder_reflected", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(BmCrc32Config.class, metaDataMap);
  }

  public BmCrc32Config() {
  }

  public BmCrc32Config(
    int polynomial,
    int initial_remainder,
    int final_xor_value,
    boolean data_reflected,
    boolean remainder_reflected)
  {
    this();
    this.polynomial = polynomial;
    setPolynomialIsSet(true);
    this.initial_remainder = initial_remainder;
    setInitial_remainderIsSet(true);
    this.final_xor_value = final_xor_value;
    setFinal_xor_valueIsSet(true);
    this.data_reflected = data_reflected;
    setData_reflectedIsSet(true);
    this.remainder_reflected = remainder_reflected;
    setRemainder_reflectedIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public BmCrc32Config(BmCrc32Config other) {
    __isset_bitfield = other.__isset_bitfield;
    this.polynomial = other.polynomial;
    this.initial_remainder = other.initial_remainder;
    this.final_xor_value = other.final_xor_value;
    this.data_reflected = other.data_reflected;
    this.remainder_reflected = other.remainder_reflected;
  }

  public BmCrc32Config deepCopy() {
    return new BmCrc32Config(this);
  }

  @Override
  public void clear() {
    setPolynomialIsSet(false);
    this.polynomial = 0;
    setInitial_remainderIsSet(false);
    this.initial_remainder = 0;
    setFinal_xor_valueIsSet(false);
    this.final_xor_value = 0;
    setData_reflectedIsSet(false);
    this.data_reflected = false;
    setRemainder_reflectedIsSet(false);
    this.remainder_reflected = false;
  }

  public int getPolynomial() {
    return this.polynomial;
  }

  public BmCrc32Config setPolynomial(int polynomial) {
    this.polynomial = polynomial;
    setPolynomialIsSet(true);
    return this;
  }

  public void unsetPolynomial() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __POLYNOMIAL_ISSET_ID);
  }

  /** Returns true if field polynomial is set (has been assigned a value) and false otherwise */
  public boolean isSetPolynomial() {
    return EncodingUtils.testBit(__isset_bitfield, __POLYNOMIAL_ISSET_ID);
  }

  public void setPolynomialIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __POLYNOMIAL_ISSET_ID, value);
  }

  public int getInitial_remainder() {
    return this.initial_remainder;
  }

  public BmCrc32Config setInitial_remainder(int initial_remainder) {
    this.initial_remainder = initial_remainder;
    setInitial_remainderIsSet(true);
    return this;
  }

  public void unsetInitial_remainder() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __INITIAL_REMAINDER_ISSET_ID);
  }

  /** Returns true if field initial_remainder is set (has been assigned a value) and false otherwise */
  public boolean isSetInitial_remainder() {
    return EncodingUtils.testBit(__isset_bitfield, __INITIAL_REMAINDER_ISSET_ID);
  }

  public void setInitial_remainderIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __INITIAL_REMAINDER_ISSET_ID, value);
  }

  public int getFinal_xor_value() {
    return this.final_xor_value;
  }

  public BmCrc32Config setFinal_xor_value(int final_xor_value) {
    this.final_xor_value = final_xor_value;
    setFinal_xor_valueIsSet(true);
    return this;
  }

  public void unsetFinal_xor_value() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __FINAL_XOR_VALUE_ISSET_ID);
  }

  /** Returns true if field final_xor_value is set (has been assigned a value) and false otherwise */
  public boolean isSetFinal_xor_value() {
    return EncodingUtils.testBit(__isset_bitfield, __FINAL_XOR_VALUE_ISSET_ID);
  }

  public void setFinal_xor_valueIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __FINAL_XOR_VALUE_ISSET_ID, value);
  }

  public boolean isData_reflected() {
    return this.data_reflected;
  }

  public BmCrc32Config setData_reflected(boolean data_reflected) {
    this.data_reflected = data_reflected;
    setData_reflectedIsSet(true);
    return this;
  }

  public void unsetData_reflected() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __DATA_REFLECTED_ISSET_ID);
  }

  /** Returns true if field data_reflected is set (has been assigned a value) and false otherwise */
  public boolean isSetData_reflected() {
    return EncodingUtils.testBit(__isset_bitfield, __DATA_REFLECTED_ISSET_ID);
  }

  public void setData_reflectedIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __DATA_REFLECTED_ISSET_ID, value);
  }

  public boolean isRemainder_reflected() {
    return this.remainder_reflected;
  }

  public BmCrc32Config setRemainder_reflected(boolean remainder_reflected) {
    this.remainder_reflected = remainder_reflected;
    setRemainder_reflectedIsSet(true);
    return this;
  }

  public void unsetRemainder_reflected() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __REMAINDER_REFLECTED_ISSET_ID);
  }

  /** Returns true if field remainder_reflected is set (has been assigned a value) and false otherwise */
  public boolean isSetRemainder_reflected() {
    return EncodingUtils.testBit(__isset_bitfield, __REMAINDER_REFLECTED_ISSET_ID);
  }

  public void setRemainder_reflectedIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __REMAINDER_REFLECTED_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case POLYNOMIAL:
      if (value == null) {
        unsetPolynomial();
      } else {
        setPolynomial((Integer)value);
      }
      break;

    case INITIAL_REMAINDER:
      if (value == null) {
        unsetInitial_remainder();
      } else {
        setInitial_remainder((Integer)value);
      }
      break;

    case FINAL_XOR_VALUE:
      if (value == null) {
        unsetFinal_xor_value();
      } else {
        setFinal_xor_value((Integer)value);
      }
      break;

    case DATA_REFLECTED:
      if (value == null) {
        unsetData_reflected();
      } else {
        setData_reflected((Boolean)value);
      }
      break;

    case REMAINDER_REFLECTED:
      if (value == null) {
        unsetRemainder_reflected();
      } else {
        setRemainder_reflected((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case POLYNOMIAL:
      return getPolynomial();

    case INITIAL_REMAINDER:
      return getInitial_remainder();

    case FINAL_XOR_VALUE:
      return getFinal_xor_value();

    case DATA_REFLECTED:
      return isData_reflected();

    case REMAINDER_REFLECTED:
      return isRemainder_reflected();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case POLYNOMIAL:
      return isSetPolynomial();
    case INITIAL_REMAINDER:
      return isSetInitial_remainder();
    case FINAL_XOR_VALUE:
      return isSetFinal_xor_value();
    case DATA_REFLECTED:
      return isSetData_reflected();
    case REMAINDER_REFLECTED:
      return isSetRemainder_reflected();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof BmCrc32Config)
      return this.equals((BmCrc32Config)that);
    return false;
  }

  public boolean equals(BmCrc32Config that) {
    if (that == null)
      return false;

    boolean this_present_polynomial = true;
    boolean that_present_polynomial = true;
    if (this_present_polynomial || that_present_polynomial) {
      if (!(this_present_polynomial && that_present_polynomial))
        return false;
      if (this.polynomial != that.polynomial)
        return false;
    }

    boolean this_present_initial_remainder = true;
    boolean that_present_initial_remainder = true;
    if (this_present_initial_remainder || that_present_initial_remainder) {
      if (!(this_present_initial_remainder && that_present_initial_remainder))
        return false;
      if (this.initial_remainder != that.initial_remainder)
        return false;
    }

    boolean this_present_final_xor_value = true;
    boolean that_present_final_xor_value = true;
    if (this_present_final_xor_value || that_present_final_xor_value) {
      if (!(this_present_final_xor_value && that_present_final_xor_value))
        return false;
      if (this.final_xor_value != that.final_xor_value)
        return false;
    }

    boolean this_present_data_reflected = true;
    boolean that_present_data_reflected = true;
    if (this_present_data_reflected || that_present_data_reflected) {
      if (!(this_present_data_reflected && that_present_data_reflected))
        return false;
      if (this.data_reflected != that.data_reflected)
        return false;
    }

    boolean this_present_remainder_reflected = true;
    boolean that_present_remainder_reflected = true;
    if (this_present_remainder_reflected || that_present_remainder_reflected) {
      if (!(this_present_remainder_reflected && that_present_remainder_reflected))
        return false;
      if (this.remainder_reflected != that.remainder_reflected)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_polynomial = true;
    list.add(present_polynomial);
    if (present_polynomial)
      list.add(polynomial);

    boolean present_initial_remainder = true;
    list.add(present_initial_remainder);
    if (present_initial_remainder)
      list.add(initial_remainder);

    boolean present_final_xor_value = true;
    list.add(present_final_xor_value);
    if (present_final_xor_value)
      list.add(final_xor_value);

    boolean present_data_reflected = true;
    list.add(present_data_reflected);
    if (present_data_reflected)
      list.add(data_reflected);

    boolean present_remainder_reflected = true;
    list.add(present_remainder_reflected);
    if (present_remainder_reflected)
      list.add(remainder_reflected);

    return list.hashCode();
  }

  @Override
  public int compareTo(BmCrc32Config other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetPolynomial()).compareTo(other.isSetPolynomial());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPolynomial()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.polynomial, other.polynomial);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetInitial_remainder()).compareTo(other.isSetInitial_remainder());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetInitial_remainder()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.initial_remainder, other.initial_remainder);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFinal_xor_value()).compareTo(other.isSetFinal_xor_value());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFinal_xor_value()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.final_xor_value, other.final_xor_value);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetData_reflected()).compareTo(other.isSetData_reflected());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetData_reflected()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.data_reflected, other.data_reflected);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRemainder_reflected()).compareTo(other.isSetRemainder_reflected());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRemainder_reflected()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.remainder_reflected, other.remainder_reflected);
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
    StringBuilder sb = new StringBuilder("BmCrc32Config(");
    boolean first = true;

    sb.append("polynomial:");
    sb.append(this.polynomial);
    first = false;
    if (!first) sb.append(", ");
    sb.append("initial_remainder:");
    sb.append(this.initial_remainder);
    first = false;
    if (!first) sb.append(", ");
    sb.append("final_xor_value:");
    sb.append(this.final_xor_value);
    first = false;
    if (!first) sb.append(", ");
    sb.append("data_reflected:");
    sb.append(this.data_reflected);
    first = false;
    if (!first) sb.append(", ");
    sb.append("remainder_reflected:");
    sb.append(this.remainder_reflected);
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class BmCrc32ConfigStandardSchemeFactory implements SchemeFactory {
    public BmCrc32ConfigStandardScheme getScheme() {
      return new BmCrc32ConfigStandardScheme();
    }
  }

  private static class BmCrc32ConfigStandardScheme extends StandardScheme<BmCrc32Config> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, BmCrc32Config struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // POLYNOMIAL
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.polynomial = iprot.readI32();
              struct.setPolynomialIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // INITIAL_REMAINDER
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.initial_remainder = iprot.readI32();
              struct.setInitial_remainderIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // FINAL_XOR_VALUE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.final_xor_value = iprot.readI32();
              struct.setFinal_xor_valueIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // DATA_REFLECTED
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.data_reflected = iprot.readBool();
              struct.setData_reflectedIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // REMAINDER_REFLECTED
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.remainder_reflected = iprot.readBool();
              struct.setRemainder_reflectedIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, BmCrc32Config struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(POLYNOMIAL_FIELD_DESC);
      oprot.writeI32(struct.polynomial);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(INITIAL_REMAINDER_FIELD_DESC);
      oprot.writeI32(struct.initial_remainder);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(FINAL_XOR_VALUE_FIELD_DESC);
      oprot.writeI32(struct.final_xor_value);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(DATA_REFLECTED_FIELD_DESC);
      oprot.writeBool(struct.data_reflected);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(REMAINDER_REFLECTED_FIELD_DESC);
      oprot.writeBool(struct.remainder_reflected);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class BmCrc32ConfigTupleSchemeFactory implements SchemeFactory {
    public BmCrc32ConfigTupleScheme getScheme() {
      return new BmCrc32ConfigTupleScheme();
    }
  }

  private static class BmCrc32ConfigTupleScheme extends TupleScheme<BmCrc32Config> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, BmCrc32Config struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetPolynomial()) {
        optionals.set(0);
      }
      if (struct.isSetInitial_remainder()) {
        optionals.set(1);
      }
      if (struct.isSetFinal_xor_value()) {
        optionals.set(2);
      }
      if (struct.isSetData_reflected()) {
        optionals.set(3);
      }
      if (struct.isSetRemainder_reflected()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetPolynomial()) {
        oprot.writeI32(struct.polynomial);
      }
      if (struct.isSetInitial_remainder()) {
        oprot.writeI32(struct.initial_remainder);
      }
      if (struct.isSetFinal_xor_value()) {
        oprot.writeI32(struct.final_xor_value);
      }
      if (struct.isSetData_reflected()) {
        oprot.writeBool(struct.data_reflected);
      }
      if (struct.isSetRemainder_reflected()) {
        oprot.writeBool(struct.remainder_reflected);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, BmCrc32Config struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.polynomial = iprot.readI32();
        struct.setPolynomialIsSet(true);
      }
      if (incoming.get(1)) {
        struct.initial_remainder = iprot.readI32();
        struct.setInitial_remainderIsSet(true);
      }
      if (incoming.get(2)) {
        struct.final_xor_value = iprot.readI32();
        struct.setFinal_xor_valueIsSet(true);
      }
      if (incoming.get(3)) {
        struct.data_reflected = iprot.readBool();
        struct.setData_reflectedIsSet(true);
      }
      if (incoming.get(4)) {
        struct.remainder_reflected = iprot.readBool();
        struct.setRemainder_reflectedIsSet(true);
      }
    }
  }

}

