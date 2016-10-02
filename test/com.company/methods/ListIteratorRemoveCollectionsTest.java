package com.company.methods;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ListIteratorRemoveCollectionsTest {
    ListIteratorRemoveCollections listIteratorRemoveCollections;

    @Before
    public void testBefore() {
        listIteratorRemoveCollections = new ListIteratorRemoveCollections();
    }

    @Test
    public void testListIteratorRemoveToList() throws Exception {
        listIteratorRemoveCollections.putToCollectionsListIteratorRemove();
        listIteratorRemoveCollections.listIteratorRemoveToList();
        assertEquals(10240, listIteratorRemoveCollections.arrayList.size());
        assertEquals(10240, listIteratorRemoveCollections.linkedList.size());
    }

    @Test
    public void testPutToCollectionsListIteratorRemove() throws Exception {
        listIteratorRemoveCollections.putToCollectionsListIteratorRemove();
        assertEquals(10240, listIteratorRemoveCollections.arrayList.size());
        assertEquals(10240, listIteratorRemoveCollections.linkedList.size());
    }

    @Test
    public void ttestPutToCollectionsListIteratorZero() throws Exception {
        assertEquals(0, listIteratorRemoveCollections.arrayList.size());
        assertEquals(0, listIteratorRemoveCollections.linkedList.size());
    }
}