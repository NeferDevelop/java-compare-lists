package com.klimov.lab3.сomparison;

import java.util.List;

/**
 * @author s.a.klimov
 */
public interface ListСomparison {
    /**
     * Inserts elements at the end of the list and measures the time taken.
     *
     * @param list               The list to perform the operation on.
     * @param numberOfExecutions The number of times the operation should be executed.
     * @return The total time taken for the operation in nanoseconds.
     */
    long insertEnd(List<Integer> list, int numberOfExecutions);

    /**
     * Inserts elements in the middle of the list and measures the time taken.
     *
     * @param list               The list to perform the operation on.
     * @param numberOfExecutions The number of times the operation should be executed.
     * @return The total time taken for the operation in nanoseconds.
     */
    long insertMiddle(List<Integer> list, int numberOfExecutions);

    /**
     * Inserts elements at the beginning of the list and measures the time taken.
     *
     * @param list               The list to perform the operation on.
     * @param numberOfExecutions The number of times the operation should be executed.
     * @return The total time taken for the operation in nanoseconds.
     */
    long insertStart(List<Integer> list, int numberOfExecutions);

    /**
     * Removes elements from the end of the list and measures the time taken.
     *
     * @param list               The list to perform the operation on.
     * @param numberOfExecutions The number of times the operation should be executed.
     * @return The total time taken for the operation in nanoseconds.
     */
    long removeEnd(List<Integer> list, int numberOfExecutions);

    /**
     * Removes elements from the middle of the list and measures the time taken.
     *
     * @param list               The list to perform the operation on.
     * @param numberOfExecutions The number of times the operation should be executed.
     * @return The total time taken for the operation in nanoseconds.
     */
    long removeMiddle(List<Integer> list, int numberOfExecutions);

    /**
     * Removes elements from the beginning of the list and measures the time taken.
     *
     * @param list               The list to perform the operation on.
     * @param numberOfExecutions The number of times the operation should be executed.
     * @return The total time taken for the operation in nanoseconds.
     */
    long removeStart(List<Integer> list, int numberOfExecutions);

    /**
     * Retrieves elements from the end of the list and measures the time taken.
     *
     * @param list               The list to perform the operation on.
     * @param numberOfExecutions The number of times the operation should be executed.
     * @return The total time taken for the operation in nanoseconds.
     */
    long getElementEnd(List<Integer> list, int numberOfExecutions);

    /**
     * Retrieves elements from the middle of the list and measures the time taken.
     *
     * @param list               The list to perform the operation on.
     * @param numberOfExecutions The number of times the operation should be executed.
     * @return The total time taken for the operation in nanoseconds.
     */
    long getElementMiddle(List<Integer> list, int numberOfExecutions);

    /**
     * Retrieves elements from the beginning of the list and measures the time taken.
     *
     * @param list               The list to perform the operation on.
     * @param numberOfExecutions The number of times the operation should be executed.
     * @return The total time taken for the operation in nanoseconds.
     */
    long getElementStart(List<Integer> list, int numberOfExecutions);
}
