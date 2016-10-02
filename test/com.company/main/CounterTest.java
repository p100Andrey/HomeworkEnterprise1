package com.company.main;

import org.junit.Test;

import static junit.framework.Assert.fail;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class CounterTest {

    @Test
    public void testTimeCount() throws Exception {
        Counter counter = new Counter();
        counter.timeCount(0);
        assertTrue(true);
    }

    @Test
    public void testWriteTime() throws Exception {
        Counter counter = new Counter();
        counter.writeTime();
        assertTrue(true);
    }

}