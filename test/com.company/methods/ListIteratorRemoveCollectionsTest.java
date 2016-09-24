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
    public void testPutToCollectionsListIteratorRemove() throws Exception {
        assertTrue(listIteratorRemoveCollections.putToCollectionsListIteratorRemove());
    }

    @Test
    public void testListIteratorRemoveToList() throws Exception {
        listIteratorRemoveCollections.putToCollectionsListIteratorRemove();
        assertTrue(listIteratorRemoveCollections.listIteratorRemoveToList());
    }
}