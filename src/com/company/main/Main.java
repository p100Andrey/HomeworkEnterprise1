package com.company.main;

import com.company.methods.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main {
    static File file = new File("AddCollections.csv");

    public static void main(String[] args) {
        CsvClass csvClass = new CsvClass();
        csvClass.cleanCsvFile(file);

        AddCollections addCollections = new AddCollections();
        addCollections.addToCollections();
        breakPrint();

        GetCollections getCollections = new GetCollections();
        getCollections.putToCollections();
        getCollections.getToCollections();
        breakPrint();

        RemoveCollections removeCollections = new RemoveCollections();
        removeCollections.putToCollectionsRemove();
        removeCollections.removeToCollections();
        breakPrint();

        ContainsCollections containsCollections = new ContainsCollections();
        containsCollections.putToCollectionsContains();
        containsCollections.containsInCollections();
        breakPrint();

        PopulateCollections populateCollections = new PopulateCollections();
        populateCollections.randomAddCollections();
        breakPrint();

        ListIteratorAddCollections listIteratorAddCollections = new ListIteratorAddCollections();
        listIteratorAddCollections.putToCollectionsListIteratorAdd();
        listIteratorAddCollections.listIteratorAddToLists();
        breakPrint();


        ListIteratorRemoveCollections listIteratorRemoveCollections = new ListIteratorRemoveCollections();
        listIteratorRemoveCollections.putToCollectionsListIteratorRemove();
        listIteratorRemoveCollections.listIteratorRemoveToList();
        breakPrint();
    }

    private static void breakPrint() {
        System.out.println("__________________________________");
    }
}
