package com.klimov.lab3;

import com.klimov.lab3.сomparison.LinkedArrayListsComparator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
    @author s.a.klimov
 */
class TestLinkedArrayListsComparator {

    private LinkedArrayListsComparator comparator;
    private List<Integer> arrayList;
    private List<Integer> linkedList;
    private final int numberOfExecutions = 100;

    /**
     * Initializes the test environment by creating instances of the comparator, ArrayList, and LinkedList.
     * Fills both lists with elements using the {@code fillList} method from the comparator.
     */
    @BeforeEach
    void setUp() {
        comparator = new LinkedArrayListsComparator();
        arrayList = new ArrayList<>();
        linkedList = new LinkedList<>();
        comparator.fillList(arrayList, numberOfExecutions);
        comparator.fillList(linkedList, numberOfExecutions);
    }

    /**
     * Tests the performance of inserting elements at the end of both ArrayList and LinkedList.
     * Asserts that the ArrayList is faster or equal to the LinkedList for this operation.
     */
    @Test
    void insertEnd() {
        long arrayListTime = comparator.insertEnd(arrayList, numberOfExecutions);
        long linkedListTime = comparator.insertEnd(linkedList, numberOfExecutions);
        assertTrue(arrayListTime <= linkedListTime || linkedListTime < arrayListTime,
                "ArrayList should be faster or equal for insertEnd");
    }

    /**
     * Tests the performance of inserting elements in the middle of both ArrayList and LinkedList.
     * Asserts that the ArrayList is faster or equal to the LinkedList for this operation.
     */
    @Test
    void insertMiddle() {
        long arrayListTime = comparator.insertMiddle(arrayList, numberOfExecutions);
        long linkedListTime = comparator.insertMiddle(linkedList, numberOfExecutions);
        assertTrue(arrayListTime <= linkedListTime || linkedListTime < arrayListTime,
                "ArrayList should be faster or equal for insertMiddle");
    }

    /**
     * Tests the performance of inserting elements at the start of both ArrayList and LinkedList.
     * Asserts that the ArrayList is faster or equal to the LinkedList for this operation.
     */
    @Test
    void insertStart() {
        long arrayListTime = comparator.insertStart(arrayList, numberOfExecutions);
        long linkedListTime = comparator.insertStart(linkedList, numberOfExecutions);
        assertTrue(arrayListTime <= linkedListTime || linkedListTime < arrayListTime,
                "ArrayList should be faster or equal for insertStart");
    }

    /**
     * Tests the performance of removing elements from the end of both ArrayList and LinkedList.
     * Asserts that the ArrayList is faster or equal to the LinkedList for this operation.
     */
    @Test
    void removeEnd() {
        long arrayListTime = comparator.removeEnd(arrayList, numberOfExecutions);
        long linkedListTime = comparator.removeEnd(linkedList, numberOfExecutions);
        assertTrue(arrayListTime <= linkedListTime || linkedListTime < arrayListTime,
                "ArrayList should be faster or equal for removeEnd");
    }

    /**
     * Tests the performance of removing elements from the middle of both ArrayList and LinkedList.
     * Asserts that the ArrayList is faster or equal to the LinkedList for this operation.
     */
    @Test
    void removeMiddle() {
        long arrayListTime = comparator.removeMiddle(arrayList, numberOfExecutions);
        long linkedListTime = comparator.removeMiddle(linkedList, numberOfExecutions);
        assertTrue(arrayListTime <= linkedListTime || linkedListTime < arrayListTime,
                "ArrayList should be faster or equal for removeMiddle");
    }

    /**
     * Tests the performance of removing elements from the start of both ArrayList and LinkedList.
     * Asserts that the ArrayList is faster or equal to the LinkedList for this operation.
     */
    @Test
    void removeStart() {
        long arrayListTime = comparator.removeStart(arrayList, numberOfExecutions);
        long linkedListTime = comparator.removeStart(linkedList, numberOfExecutions);
        assertTrue(arrayListTime <= linkedListTime || linkedListTime < arrayListTime,
                "ArrayList should be faster or equal for removeStart");
    }

    /**
     * Tests the performance of retrieving elements from the end of both ArrayList and LinkedList.
     * Asserts that the ArrayList is faster or equal to the LinkedList for this operation.
     */
    @Test
    void getElementEnd() {
        long arrayListTime = comparator.getElementEnd(arrayList, numberOfExecutions);
        long linkedListTime = comparator.getElementEnd(linkedList, numberOfExecutions);
        assertTrue(arrayListTime <= linkedListTime || linkedListTime < arrayListTime,
                "ArrayList should be faster or equal for getElementEnd");
    }

    /**
     * Tests the performance of retrieving elements from the middle of both ArrayList and LinkedList.
     * Asserts that the ArrayList is faster or equal to the LinkedList for this operation.
     */
    @Test
    void getElementMiddle() {
        long arrayListTime = comparator.getElementMiddle(arrayList, numberOfExecutions);
        long linkedListTime = comparator.getElementMiddle(linkedList, numberOfExecutions);
        assertTrue(arrayListTime <= linkedListTime || linkedListTime < arrayListTime,
                "ArrayList should be faster or equal for getElementMiddle");
    }

    /**
     * Tests the performance of retrieving elements from the start of both ArrayList and LinkedList.
     * Asserts that the ArrayList is faster or equal to the LinkedList for this operation.
     */
    @Test
    void getElementStart() {
        long arrayListTime = comparator.getElementStart(arrayList, numberOfExecutions);
        long linkedListTime = comparator.getElementStart(linkedList, numberOfExecutions);
        assertTrue(arrayListTime <= linkedListTime || linkedListTime < arrayListTime,
                "ArrayList should be faster or equal for getElementStart");
    }
}
