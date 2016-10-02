package com.company.methods;

import org.junit.Test;

import static org.junit.Assert.*;

public class PopulateCollectionsTest {

    @Test (expected = NullPointerException.class)
    public void testRandomAddCollectionsPositive() throws Exception {
        PopulateCollections populateCollections = new PopulateCollections();
        populateCollections.randomAddCollections();
        assertEquals(null, populateCollections.arrayList.size());
        assertEquals(null, populateCollections.linkedList.size());
        assertEquals(null, populateCollections.hashSet.size());
        assertEquals(null, populateCollections.treeSet.size());
    }

}