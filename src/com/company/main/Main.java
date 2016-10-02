package com.company.main;

import com.company.methods.*;

import java.io.File;

public class Main {
    static File file = new File("AddCollections.csv");

    public static void main(String[] args) {
        CsvWriter csvWriter = new CsvWriter();
        csvWriter.cleanCsvFile(file);

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
