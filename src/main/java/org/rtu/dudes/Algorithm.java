package org.rtu.dudes;

public interface Algorithm {
  public byte[] encode(byte[] byteArray);

  public byte[] decode(byte[] byteArray);
}
