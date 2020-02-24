package org.rtu.dudes;

public class TestHelper {
  public static String byteArrayToString(byte[] bytes) {
    StringBuffer stringBuffer = new StringBuffer();
    for (byte bt : bytes) {
      String s1 = String.format("%8s", Integer.toBinaryString(bt & 0xFF)).replace(' ', '0');
      stringBuffer.append(s1);
    }
    return stringBuffer.toString();
  }
}
