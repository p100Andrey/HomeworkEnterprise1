package com.company.methods;

import org.junit.Test;

import static org.junit.Assert.*;

public class AddCollectionsTest {
    @Test
    public void testAddToCollectionsPositive() throws Exception {
        AddCollections addCollections = new AddCollections();
        addCollections.addToCollections();
        assertEquals(10240, addCollections.arrayList.size());
        assertEquals(10240, addCollections.linkedList.size());
        assertEquals(10240, addCollections.hashSet.size());
        assertEquals(10240, addCollections.treeSet.size());
    }

    @Test (expected = NullPointerException.class)
    public void testAddToCollectionsNull() throws Exception {
        AddCollections addCollections = new AddCollections();
        assertEquals(null, addCollections.arrayList.size());
        assertEquals(null, addCollections.linkedList.size());
        assertEquals(null, addCollections.hashSet.size());
        assertEquals(null, addCollections.treeSet.size());
    }

}