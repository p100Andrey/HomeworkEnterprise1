package com.company.methods;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveCollectionsTest {

    @Test
    public void testRemoveToCollectionsPositive() throws Exception {
        RemoveCollections removeCollections = new RemoveCollections();
        removeCollections.putToCollectionsRemove();
        removeCollections.removeToCollections();
        assertEquals(10240, removeCollections.arrayList.size());
        assertEquals(10240, removeCollections.linkedList.size());
        assertEquals(10240, removeCollections.hashSet.size());
        assertEquals(10240, removeCollections.treeSet.size());
    }

    @Test
    public void testRemoveToCollectionsZero() throws Exception {
        RemoveCollections removeCollections = new RemoveCollections();
        assertEquals(0, removeCollections.arrayList.size());
        assertEquals(0, removeCollections.linkedList.size());
        assertEquals(0, removeCollections.hashSet.size());
        assertEquals(0, removeCollections.treeSet.size());
    }
}