package ru.skvrez.iterator;

public class LinkedListIterator<T> implements Iterator {

    private LinkedList<T>.Node<T> currentNode;

    public LinkedListIterator(LinkedList<T> list) {
        currentNode = list.getHead();
    }

    @Override
    public T getNext() {
        if (hasNext()) {
            currentNode = currentNode.getNextNode();
            return currentNode.getValue();
        }
        return null;
    }

    @Override
    public boolean hasNext() {
        if (currentNode != null) {
            return currentNode.getNextNode() != null;
        }
        return false;
    }
}
