/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.onosproject.bmv2.thriftapi;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum TableOperationErrorCode implements org.apache.thrift.TEnum {
  TABLE_FULL(1),
  INVALID_HANDLE(2),
  EXPIRED_HANDLE(3),
  COUNTERS_DISABLED(4),
  METERS_DISABLED(5),
  AGEING_DISABLED(6),
  INVALID_TABLE_NAME(7),
  INVALID_ACTION_NAME(8),
  WRONG_TABLE_TYPE(9),
  INVALID_MBR_HANDLE(10),
  MBR_STILL_USED(11),
  MBR_ALREADY_IN_GRP(12),
  MBR_NOT_IN_GRP(13),
  INVALID_GRP_HANDLE(14),
  GRP_STILL_USED(15),
  EMPTY_GRP(16),
  DUPLICATE_ENTRY(17),
  BAD_MATCH_KEY(18),
  INVALID_METER_OPERATION(19),
  DEFAULT_ACTION_IS_CONST(20),
  DEFAULT_ENTRY_IS_CONST(21),
  NO_DEFAULT_ENTRY(22),
  ERROR(23);

  private final int value;

  private TableOperationErrorCode(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static TableOperationErrorCode findByValue(int value) { 
    switch (value) {
      case 1:
        return TABLE_FULL;
      case 2:
        return INVALID_HANDLE;
      case 3:
        return EXPIRED_HANDLE;
      case 4:
        return COUNTERS_DISABLED;
      case 5:
        return METERS_DISABLED;
      case 6:
        return AGEING_DISABLED;
      case 7:
        return INVALID_TABLE_NAME;
      case 8:
        return INVALID_ACTION_NAME;
      case 9:
        return WRONG_TABLE_TYPE;
      case 10:
        return INVALID_MBR_HANDLE;
      case 11:
        return MBR_STILL_USED;
      case 12:
        return MBR_ALREADY_IN_GRP;
      case 13:
        return MBR_NOT_IN_GRP;
      case 14:
        return INVALID_GRP_HANDLE;
      case 15:
        return GRP_STILL_USED;
      case 16:
        return EMPTY_GRP;
      case 17:
        return DUPLICATE_ENTRY;
      case 18:
        return BAD_MATCH_KEY;
      case 19:
        return INVALID_METER_OPERATION;
      case 20:
        return DEFAULT_ACTION_IS_CONST;
      case 21:
        return DEFAULT_ENTRY_IS_CONST;
      case 22:
        return NO_DEFAULT_ENTRY;
      case 23:
        return ERROR;
      default:
        return null;
    }
  }
}
