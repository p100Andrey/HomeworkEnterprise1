package com.company.main;

import org.junit.Test;

import static junit.framework.Assert.fail;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class CountAlgorithmTest {

    @Test
    public void testTimeCount() throws Exception {
        CountAlgorithm countAlgorithm = new CountAlgorithm();
        countAlgorithm.timeCount(0);
        assertTrue(true);
    }

    @Test
    public void testWriteTime() throws Exception {
        CountAlgorithm countAlgorithm = new CountAlgorithm();
        countAlgorithm.writeTime();
        assertTrue(true);
    }

}