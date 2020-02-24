package org.rtu.dudes;

import static org.junit.Assert.*;

import org.junit.Test;

public class StubAlgorithmTest2 {

  @Test
  public void stubEncode() {

    StubAlgorithm algorithm = new StubAlgorithm();
    String str = "i will die";
    byte[] byteExpected = algorithm.encode(str.getBytes());
    String expected = TestHelper.byteArrayToString(byteExpected);

    String actual = "00000001110100011010110100111100";
    assertEquals(expected, actual);
  }

  @Test
  public void stubDecode() {
    StubAlgorithm algorithm = new StubAlgorithm();

    String result = "1110100011010110100111100";
    byte[] byteArray = result.getBytes();
    String actual = new String(algorithm.decode(byteArray));
    String expected = "i will die";
    assertEquals(actual, expected);
  }
}
