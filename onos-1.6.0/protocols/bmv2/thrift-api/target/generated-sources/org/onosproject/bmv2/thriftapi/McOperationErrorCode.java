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

public enum McOperationErrorCode implements org.apache.thrift.TEnum {
  TABLE_FULL(1),
  INVALID_HANDLE(2),
  INVALID_MGID(3),
  INVALID_L1_HANDLE(4),
  INVALID_L2_HANLDE(5),
  ERROR(6);

  private final int value;

  private McOperationErrorCode(int value) {
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
  public static McOperationErrorCode findByValue(int value) { 
    switch (value) {
      case 1:
        return TABLE_FULL;
      case 2:
        return INVALID_HANDLE;
      case 3:
        return INVALID_MGID;
      case 4:
        return INVALID_L1_HANDLE;
      case 5:
        return INVALID_L2_HANLDE;
      case 6:
        return ERROR;
      default:
        return null;
    }
  }
}
