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
    public void testPutToCollectionsListIteratorAdd() throws Exception {
        assertTrue(listIteratorAddCollections.putToCollectionsListIteratorAdd());
    }

    @Test
    public void testListIteratorAddToLists() throws Exception {
        listIteratorAddCollections.putToCollectionsListIteratorAdd();
        assertTrue(listIteratorAddCollections.listIteratorAddToLists());
    }
}