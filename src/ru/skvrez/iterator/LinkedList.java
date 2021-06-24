package ru.skvrez.iterator;

public class LinkedList<T> {

    private final Node<T> head = new Node<T>(null);
    private int length;

    class Node<T> {
        private T value;
        private Node<T> nextNode;

        public Node(T value) {
            this.value = value;
        }

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }

        public Node<T> getNextNode() {
            return nextNode;
        }

        public void setNextNode(Node<T> nextNode) {
            this.nextNode = nextNode;
        }
    }

    public Node<T> getHead() {
        return head;
    }

    public int getLength() {
        return length;
    }

    public Iterator<T> getIterator() {
        return new LinkedListIterator<T>(this);
    }

    public void add(T value) {
        var currentNode = head;
        while (currentNode.nextNode != null) {
            currentNode = currentNode.getNextNode();
        }
        var newNode = new Node<T>(value);
        currentNode.setNextNode(newNode);
        length++;
    }
}
