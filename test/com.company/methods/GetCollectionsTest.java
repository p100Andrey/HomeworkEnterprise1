package com.company.methods;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class GetCollectionsTest {

    @Test
    public void testGetToCollectionsPositive() throws Exception {
        GetCollections getCollections = new GetCollections();
        getCollections.putToCollections();
        getCollections.getToCollections();
        assertEquals(10240, getCollections.arrayList.size());
        assertEquals(10240, getCollections.linkedList.size());
    }

    @Test
    public void testGetToCollectionsZero() throws Exception {
        GetCollections getCollections = new GetCollections();
        assertEquals(0, getCollections.arrayList.size());
        assertEquals(0, getCollections.linkedList.size());
    }

}