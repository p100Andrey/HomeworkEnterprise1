package com.company.methods;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ListIteratorAddCollectionsTest {
    ListIteratorAddCollections listIteratorAddCollections;

    @Before
    public void testBefore() {
        listIteratorAddCollections = new ListIteratorAddCollections();
    }

    @Test
    public void testListIteratorAddToLists() throws Exception {
        listIteratorAddCollections.putToCollectionsListIteratorAdd();
        listIteratorAddCollections.listIteratorAddToLists();
        assertEquals(112640, listIteratorAddCollections.arrayList.size());
        assertEquals(112640, listIteratorAddCollections.linkedList.size());
    }

    @Test
    public void testPutToCollectionsListIteratorAdd() throws Exception {
        listIteratorAddCollections.putToCollectionsListIteratorAdd();
        assertEquals(10240, listIteratorAddCollections.arrayList.size());
        assertEquals(10240, listIteratorAddCollections.linkedList.size());
    }

    @Test
    public void testPutToCollectionsListIteratorZero() throws Exception {
        assertEquals(0, listIteratorAddCollections.arrayList.size());
        assertEquals(0, listIteratorAddCollections.linkedList.size());
    }
}