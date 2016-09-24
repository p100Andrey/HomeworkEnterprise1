package com.company.methods;

import org.junit.Test;

import static org.junit.Assert.*;

public class AddCollectionsTest {
    @Test
    public void testAddToCollectionsFalse() throws Exception {
        AddCollections addCollections = new AddCollections();
        assertTrue(addCollections.addToCollections());
    }
}