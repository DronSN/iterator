package ru.skvrez.iterator;

public interface Iterator<T> {
    T getNext();
    boolean hasNext();
}
