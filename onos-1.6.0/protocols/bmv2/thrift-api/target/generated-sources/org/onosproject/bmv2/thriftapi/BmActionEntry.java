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
public class BmActionEntry implements org.apache.thrift.TBase<BmActionEntry, BmActionEntry._Fields>, java.io.Serializable, Cloneable, Comparable<BmActionEntry> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("BmActionEntry");

  private static final org.apache.thrift.protocol.TField ACTION_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("action_type", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField ACTION_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("action_name", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField ACTION_DATA_FIELD_DESC = new org.apache.thrift.protocol.TField("action_data", org.apache.thrift.protocol.TType.LIST, (short)3);
  private static final org.apache.thrift.protocol.TField MBR_HANDLE_FIELD_DESC = new org.apache.thrift.protocol.TField("mbr_handle", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField GRP_HANDLE_FIELD_DESC = new org.apache.thrift.protocol.TField("grp_handle", org.apache.thrift.protocol.TType.I32, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new BmActionEntryStandardSchemeFactory());
    schemes.put(TupleScheme.class, new BmActionEntryTupleSchemeFactory());
  }

  /**
   * 
   * @see BmActionEntryType
   */
  public BmActionEntryType action_type; // required
  public String action_name; // optional
  public List<ByteBuffer> action_data; // optional
  public int mbr_handle; // optional
  public int grp_handle; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see BmActionEntryType
     */
    ACTION_TYPE((short)1, "action_type"),
    ACTION_NAME((short)2, "action_name"),
    ACTION_DATA((short)3, "action_data"),
    MBR_HANDLE((short)4, "mbr_handle"),
    GRP_HANDLE((short)5, "grp_handle");

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
        case 1: // ACTION_TYPE
          return ACTION_TYPE;
        case 2: // ACTION_NAME
          return ACTION_NAME;
        case 3: // ACTION_DATA
          return ACTION_DATA;
        case 4: // MBR_HANDLE
          return MBR_HANDLE;
        case 5: // GRP_HANDLE
          return GRP_HANDLE;
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
  private static final int __MBR_HANDLE_ISSET_ID = 0;
  private static final int __GRP_HANDLE_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.ACTION_NAME,_Fields.ACTION_DATA,_Fields.MBR_HANDLE,_Fields.GRP_HANDLE};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ACTION_TYPE, new org.apache.thrift.meta_data.FieldMetaData("action_type", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, BmActionEntryType.class)));
    tmpMap.put(_Fields.ACTION_NAME, new org.apache.thrift.meta_data.FieldMetaData("action_name", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ACTION_DATA, new org.apache.thrift.meta_data.FieldMetaData("action_data", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.LIST        , "BmActionData")));
    tmpMap.put(_Fields.MBR_HANDLE, new org.apache.thrift.meta_data.FieldMetaData("mbr_handle", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "BmMemberHandle")));
    tmpMap.put(_Fields.GRP_HANDLE, new org.apache.thrift.meta_data.FieldMetaData("grp_handle", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "BmGroupHandle")));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(BmActionEntry.class, metaDataMap);
  }

  public BmActionEntry() {
  }

  public BmActionEntry(
    BmActionEntryType action_type)
  {
    this();
    this.action_type = action_type;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public BmActionEntry(BmActionEntry other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetAction_type()) {
      this.action_type = other.action_type;
    }
    if (other.isSetAction_name()) {
      this.action_name = other.action_name;
    }
    if (other.isSetAction_data()) {
      this.action_data = other.action_data;
    }
    this.mbr_handle = other.mbr_handle;
    this.grp_handle = other.grp_handle;
  }

  public BmActionEntry deepCopy() {
    return new BmActionEntry(this);
  }

  @Override
  public void clear() {
    this.action_type = null;
    this.action_name = null;
    this.action_data = null;
    setMbr_handleIsSet(false);
    this.mbr_handle = 0;
    setGrp_handleIsSet(false);
    this.grp_handle = 0;
  }

  /**
   * 
   * @see BmActionEntryType
   */
  public BmActionEntryType getAction_type() {
    return this.action_type;
  }

  /**
   * 
   * @see BmActionEntryType
   */
  public BmActionEntry setAction_type(BmActionEntryType action_type) {
    this.action_type = action_type;
    return this;
  }

  public void unsetAction_type() {
    this.action_type = null;
  }

  /** Returns true if field action_type is set (has been assigned a value) and false otherwise */
  public boolean isSetAction_type() {
    return this.action_type != null;
  }

  public void setAction_typeIsSet(boolean value) {
    if (!value) {
      this.action_type = null;
    }
  }

  public String getAction_name() {
    return this.action_name;
  }

  public BmActionEntry setAction_name(String action_name) {
    this.action_name = action_name;
    return this;
  }

  public void unsetAction_name() {
    this.action_name = null;
  }

  /** Returns true if field action_name is set (has been assigned a value) and false otherwise */
  public boolean isSetAction_name() {
    return this.action_name != null;
  }

  public void setAction_nameIsSet(boolean value) {
    if (!value) {
      this.action_name = null;
    }
  }

  public int getAction_dataSize() {
    return (this.action_data == null) ? 0 : this.action_data.size();
  }

  public java.util.Iterator<ByteBuffer> getAction_dataIterator() {
    return (this.action_data == null) ? null : this.action_data.iterator();
  }

  public void addToAction_data(ByteBuffer elem) {
    if (this.action_data == null) {
      this.action_data = new ArrayList<ByteBuffer>();
    }
    this.action_data.add(elem);
  }

  public List<ByteBuffer> getAction_data() {
    return this.action_data;
  }

  public BmActionEntry setAction_data(List<ByteBuffer> action_data) {
    this.action_data = action_data;
    return this;
  }

  public void unsetAction_data() {
    this.action_data = null;
  }

  /** Returns true if field action_data is set (has been assigned a value) and false otherwise */
  public boolean isSetAction_data() {
    return this.action_data != null;
  }

  public void setAction_dataIsSet(boolean value) {
    if (!value) {
      this.action_data = null;
    }
  }

  public int getMbr_handle() {
    return this.mbr_handle;
  }

  public BmActionEntry setMbr_handle(int mbr_handle) {
    this.mbr_handle = mbr_handle;
    setMbr_handleIsSet(true);
    return this;
  }

  public void unsetMbr_handle() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __MBR_HANDLE_ISSET_ID);
  }

  /** Returns true if field mbr_handle is set (has been assigned a value) and false otherwise */
  public boolean isSetMbr_handle() {
    return EncodingUtils.testBit(__isset_bitfield, __MBR_HANDLE_ISSET_ID);
  }

  public void setMbr_handleIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __MBR_HANDLE_ISSET_ID, value);
  }

  public int getGrp_handle() {
    return this.grp_handle;
  }

  public BmActionEntry setGrp_handle(int grp_handle) {
    this.grp_handle = grp_handle;
    setGrp_handleIsSet(true);
    return this;
  }

  public void unsetGrp_handle() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __GRP_HANDLE_ISSET_ID);
  }

  /** Returns true if field grp_handle is set (has been assigned a value) and false otherwise */
  public boolean isSetGrp_handle() {
    return EncodingUtils.testBit(__isset_bitfield, __GRP_HANDLE_ISSET_ID);
  }

  public void setGrp_handleIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __GRP_HANDLE_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ACTION_TYPE:
      if (value == null) {
        unsetAction_type();
      } else {
        setAction_type((BmActionEntryType)value);
      }
      break;

    case ACTION_NAME:
      if (value == null) {
        unsetAction_name();
      } else {
        setAction_name((String)value);
      }
      break;

    case ACTION_DATA:
      if (value == null) {
        unsetAction_data();
      } else {
        setAction_data((List<ByteBuffer>)value);
      }
      break;

    case MBR_HANDLE:
      if (value == null) {
        unsetMbr_handle();
      } else {
        setMbr_handle((Integer)value);
      }
      break;

    case GRP_HANDLE:
      if (value == null) {
        unsetGrp_handle();
      } else {
        setGrp_handle((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ACTION_TYPE:
      return getAction_type();

    case ACTION_NAME:
      return getAction_name();

    case ACTION_DATA:
      return getAction_data();

    case MBR_HANDLE:
      return getMbr_handle();

    case GRP_HANDLE:
      return getGrp_handle();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ACTION_TYPE:
      return isSetAction_type();
    case ACTION_NAME:
      return isSetAction_name();
    case ACTION_DATA:
      return isSetAction_data();
    case MBR_HANDLE:
      return isSetMbr_handle();
    case GRP_HANDLE:
      return isSetGrp_handle();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof BmActionEntry)
      return this.equals((BmActionEntry)that);
    return false;
  }

  public boolean equals(BmActionEntry that) {
    if (that == null)
      return false;

    boolean this_present_action_type = true && this.isSetAction_type();
    boolean that_present_action_type = true && that.isSetAction_type();
    if (this_present_action_type || that_present_action_type) {
      if (!(this_present_action_type && that_present_action_type))
        return false;
      if (!this.action_type.equals(that.action_type))
        return false;
    }

    boolean this_present_action_name = true && this.isSetAction_name();
    boolean that_present_action_name = true && that.isSetAction_name();
    if (this_present_action_name || that_present_action_name) {
      if (!(this_present_action_name && that_present_action_name))
        return false;
      if (!this.action_name.equals(that.action_name))
        return false;
    }

    boolean this_present_action_data = true && this.isSetAction_data();
    boolean that_present_action_data = true && that.isSetAction_data();
    if (this_present_action_data || that_present_action_data) {
      if (!(this_present_action_data && that_present_action_data))
        return false;
      if (!this.action_data.equals(that.action_data))
        return false;
    }

    boolean this_present_mbr_handle = true && this.isSetMbr_handle();
    boolean that_present_mbr_handle = true && that.isSetMbr_handle();
    if (this_present_mbr_handle || that_present_mbr_handle) {
      if (!(this_present_mbr_handle && that_present_mbr_handle))
        return false;
      if (this.mbr_handle != that.mbr_handle)
        return false;
    }

    boolean this_present_grp_handle = true && this.isSetGrp_handle();
    boolean that_present_grp_handle = true && that.isSetGrp_handle();
    if (this_present_grp_handle || that_present_grp_handle) {
      if (!(this_present_grp_handle && that_present_grp_handle))
        return false;
      if (this.grp_handle != that.grp_handle)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_action_type = true && (isSetAction_type());
    list.add(present_action_type);
    if (present_action_type)
      list.add(action_type.getValue());

    boolean present_action_name = true && (isSetAction_name());
    list.add(present_action_name);
    if (present_action_name)
      list.add(action_name);

    boolean present_action_data = true && (isSetAction_data());
    list.add(present_action_data);
    if (present_action_data)
      list.add(action_data);

    boolean present_mbr_handle = true && (isSetMbr_handle());
    list.add(present_mbr_handle);
    if (present_mbr_handle)
      list.add(mbr_handle);

    boolean present_grp_handle = true && (isSetGrp_handle());
    list.add(present_grp_handle);
    if (present_grp_handle)
      list.add(grp_handle);

    return list.hashCode();
  }

  @Override
  public int compareTo(BmActionEntry other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetAction_type()).compareTo(other.isSetAction_type());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAction_type()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.action_type, other.action_type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAction_name()).compareTo(other.isSetAction_name());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAction_name()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.action_name, other.action_name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAction_data()).compareTo(other.isSetAction_data());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAction_data()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.action_data, other.action_data);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMbr_handle()).compareTo(other.isSetMbr_handle());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMbr_handle()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.mbr_handle, other.mbr_handle);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetGrp_handle()).compareTo(other.isSetGrp_handle());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGrp_handle()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.grp_handle, other.grp_handle);
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
    StringBuilder sb = new StringBuilder("BmActionEntry(");
    boolean first = true;

    sb.append("action_type:");
    if (this.action_type == null) {
      sb.append("null");
    } else {
      sb.append(this.action_type);
    }
    first = false;
    if (isSetAction_name()) {
      if (!first) sb.append(", ");
      sb.append("action_name:");
      if (this.action_name == null) {
        sb.append("null");
      } else {
        sb.append(this.action_name);
      }
      first = false;
    }
    if (isSetAction_data()) {
      if (!first) sb.append(", ");
      sb.append("action_data:");
      if (this.action_data == null) {
        sb.append("null");
      } else {
        sb.append(this.action_data);
      }
      first = false;
    }
    if (isSetMbr_handle()) {
      if (!first) sb.append(", ");
      sb.append("mbr_handle:");
      sb.append(this.mbr_handle);
      first = false;
    }
    if (isSetGrp_handle()) {
      if (!first) sb.append(", ");
      sb.append("grp_handle:");
      sb.append(this.grp_handle);
      first = false;
    }
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

  private static class BmActionEntryStandardSchemeFactory implements SchemeFactory {
    public BmActionEntryStandardScheme getScheme() {
      return new BmActionEntryStandardScheme();
    }
  }

  private static class BmActionEntryStandardScheme extends StandardScheme<BmActionEntry> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, BmActionEntry struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ACTION_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.action_type = org.onosproject.bmv2.thriftapi.BmActionEntryType.findByValue(iprot.readI32());
              struct.setAction_typeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ACTION_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.action_name = iprot.readString();
              struct.setAction_nameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // ACTION_DATA
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list10 = iprot.readListBegin();
                struct.action_data = new ArrayList<ByteBuffer>(_list10.size);
                ByteBuffer _elem11;
                for (int _i12 = 0; _i12 < _list10.size; ++_i12)
                {
                  _elem11 = iprot.readBinary();
                  struct.action_data.add(_elem11);
                }
                iprot.readListEnd();
              }
              struct.setAction_dataIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // MBR_HANDLE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.mbr_handle = iprot.readI32();
              struct.setMbr_handleIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // GRP_HANDLE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.grp_handle = iprot.readI32();
              struct.setGrp_handleIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, BmActionEntry struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.action_type != null) {
        oprot.writeFieldBegin(ACTION_TYPE_FIELD_DESC);
        oprot.writeI32(struct.action_type.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.action_name != null) {
        if (struct.isSetAction_name()) {
          oprot.writeFieldBegin(ACTION_NAME_FIELD_DESC);
          oprot.writeString(struct.action_name);
          oprot.writeFieldEnd();
        }
      }
      if (struct.action_data != null) {
        if (struct.isSetAction_data()) {
          oprot.writeFieldBegin(ACTION_DATA_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.action_data.size()));
            for (ByteBuffer _iter13 : struct.action_data)
            {
              oprot.writeBinary(_iter13);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetMbr_handle()) {
        oprot.writeFieldBegin(MBR_HANDLE_FIELD_DESC);
        oprot.writeI32(struct.mbr_handle);
        oprot.writeFieldEnd();
      }
      if (struct.isSetGrp_handle()) {
        oprot.writeFieldBegin(GRP_HANDLE_FIELD_DESC);
        oprot.writeI32(struct.grp_handle);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class BmActionEntryTupleSchemeFactory implements SchemeFactory {
    public BmActionEntryTupleScheme getScheme() {
      return new BmActionEntryTupleScheme();
    }
  }

  private static class BmActionEntryTupleScheme extends TupleScheme<BmActionEntry> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, BmActionEntry struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetAction_type()) {
        optionals.set(0);
      }
      if (struct.isSetAction_name()) {
        optionals.set(1);
      }
      if (struct.isSetAction_data()) {
        optionals.set(2);
      }
      if (struct.isSetMbr_handle()) {
        optionals.set(3);
      }
      if (struct.isSetGrp_handle()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetAction_type()) {
        oprot.writeI32(struct.action_type.getValue());
      }
      if (struct.isSetAction_name()) {
        oprot.writeString(struct.action_name);
      }
      if (struct.isSetAction_data()) {
        {
          oprot.writeI32(struct.action_data.size());
          for (ByteBuffer _iter14 : struct.action_data)
          {
            oprot.writeBinary(_iter14);
          }
        }
      }
      if (struct.isSetMbr_handle()) {
        oprot.writeI32(struct.mbr_handle);
      }
      if (struct.isSetGrp_handle()) {
        oprot.writeI32(struct.grp_handle);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, BmActionEntry struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.action_type = org.onosproject.bmv2.thriftapi.BmActionEntryType.findByValue(iprot.readI32());
        struct.setAction_typeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.action_name = iprot.readString();
        struct.setAction_nameIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TList _list15 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.action_data = new ArrayList<ByteBuffer>(_list15.size);
          ByteBuffer _elem16;
          for (int _i17 = 0; _i17 < _list15.size; ++_i17)
          {
            _elem16 = iprot.readBinary();
            struct.action_data.add(_elem16);
          }
        }
        struct.setAction_dataIsSet(true);
      }
      if (incoming.get(3)) {
        struct.mbr_handle = iprot.readI32();
        struct.setMbr_handleIsSet(true);
      }
      if (incoming.get(4)) {
        struct.grp_handle = iprot.readI32();
        struct.setGrp_handleIsSet(true);
      }
    }
  }

}

