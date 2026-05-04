package com.xworkz.interfaces;
/*
builtin interfaces :
Comparable
Comparator
Runnable
Callable
Serializable
Cloneable
RandomAccess
Iterable
Collection
List
Set
Queue
Deque
Map
Iterator
ListIterator
Enumeration
Spliterator
Predicate
Function
 */

public interface Student {
    int MAX_MARKS = 100;
    int PASS_MARKS = 40;

    void study();
    void takeExam();
    void checkResult();
}
