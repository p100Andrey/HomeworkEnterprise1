package com.company.methods;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ContainsCollectionsTest {

    @Test
    public void testContainsInCollectionsPositive() throws Exception {
        ContainsCollections containsCollections = new ContainsCollections();
        containsCollections.putToCollectionsContains();
        containsCollections.containsInCollections();
        assertEquals(10240, containsCollections.arrayList.size());
        assertEquals(10240, containsCollections.linkedList.size());
        assertEquals(10240, containsCollections.hashSet.size());
        assertEquals(10240, containsCollections.treeSet.size());
    }

    @Test
    public void testContainsInCollectionsZero() throws Exception {
        ContainsCollections containsCollections = new ContainsCollections();
        assertEquals(0, containsCollections.arrayList.size());
        assertEquals(0, containsCollections.linkedList.size());
        assertEquals(0, containsCollections.hashSet.size());
        assertEquals(0, containsCollections.treeSet.size());
    }

}