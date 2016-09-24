package com.company.methods;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class GetCollectionsTest {
    GetCollections getCollections;

    @Before
    public void setUpBeforeClass() {
        getCollections = new GetCollections();
    }

    @Test
    public void testPutToCollections() throws Exception {
        assertTrue(getCollections.putToCollections());
    }

    @Test
    public void testGetToCollections() throws Exception {
        getCollections.putToCollections();
        assertTrue(getCollections.getToCollections());
    }

}