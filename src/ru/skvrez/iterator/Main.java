package ru.skvrez.iterator;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            linkedList.add(Integer.toString(i));
        }
        Iterator<String> iterator = linkedList.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.getNext());
        }
        System.out.println(linkedList.getLength());
    }
}
