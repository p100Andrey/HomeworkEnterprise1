package com.company.methods;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveCollectionsTest {

    RemoveCollections removeCollections;

    @Before
    public void testBefore() {
        removeCollections = new RemoveCollections();
    }

    @Test
    public void testPutToCollectionsRemove() throws Exception {
        assertTrue(removeCollections.putToCollectionsRemove());
    }

    @Test
    public void testRemoveToCollections() throws Exception {
        assertTrue(removeCollections.removeToCollections());
    }

}