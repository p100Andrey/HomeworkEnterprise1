package com.company.methods;

import org.junit.Test;

import static org.junit.Assert.*;

public class PopulateCollectionsTest {
    @Test
    public void testRandomAddCollections() throws Exception {
        PopulateCollections populateCollections = new PopulateCollections();
        assertTrue(populateCollections.randomAddCollections());
    }

}