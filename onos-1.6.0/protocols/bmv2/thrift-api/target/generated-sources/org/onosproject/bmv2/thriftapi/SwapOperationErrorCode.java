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

public enum SwapOperationErrorCode implements org.apache.thrift.TEnum {
  CONFIG_SWAP_DISABLED(1),
  ONGOING_SWAP(2),
  NO_ONGOING_SWAP(3);

  private final int value;

  private SwapOperationErrorCode(int value) {
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
  public static SwapOperationErrorCode findByValue(int value) { 
    switch (value) {
      case 1:
        return CONFIG_SWAP_DISABLED;
      case 2:
        return ONGOING_SWAP;
      case 3:
        return NO_ONGOING_SWAP;
      default:
        return null;
    }
  }
}
