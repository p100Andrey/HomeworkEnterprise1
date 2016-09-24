package com.company.methods;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ContainsCollectionsTest {

    ContainsCollections containsCollections;

    @Before
    public void testBefore() {
        containsCollections = new ContainsCollections();
    }

    @Test
    public void testPutToCollectionsContains() throws Exception {
        assertTrue(containsCollections.putToCollectionsContains());
    }

    @Test
    public void testContainsInCollections() throws Exception {
        assertTrue(containsCollections.containsInCollections());
    }

}