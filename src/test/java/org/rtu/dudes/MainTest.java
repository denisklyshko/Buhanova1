package org.rtu.dudes;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void works() {
        Main instance = new Main();
        assertEquals(instance.works(), "works");
    }
}