package org.rtu.dudes;

import java.math.BigInteger;

public class StubAlgorithm implements Algorithm{
    Algorithm alg;
    public byte[] encode(byte[] byteArray) {
        String result = "1110100011010110100111100";
        byte[] byteArrayRez = new BigInteger(result, 2).toByteArray();
        return byteArrayRez;
    }

    public byte[] decode(byte[] byteArray){
        String decodedStr = "i will die";
        return decodedStr.getBytes();
    }

}
