package ru.x5.hw6.Task2;

public class MyLinkedList<E> implements MyList<E> {
    private Node first;
    private Node last;
    private int size;

    public MyLinkedList() {
        first = null;
    }

    private class Node {
        E value;
        Node next;
        Node previous;

        public Node(E value) {
            this.value = value;
        }
    }

    @Override
    public int size() {
        return size;
    }

    private boolean isEmpty() {
        return first == null;
    }

    private void checkElementIndex(int index){
        if (!(index >= 0 && index < size)) {
            throw new IllegalArgumentException("Incorrect index: " + index);
        }
    }

    private void checkListEmpty(){
        if (isEmpty()) {
            throw new RuntimeException("List is empty");
        }
    }

    @Override
    public void add(E item) {
        Node newNode = new Node(item);
        if (isEmpty()) {
            first = newNode;
        } else {
            newNode.previous = last;
            last.next = newNode;
        }
        last = newNode;
        size++;
    }

    @Override
    public void remove(int index) {
        checkElementIndex(index);

        if (index == 0) {
            removeFirst();
            return;
        }
        if (index == size - 1) {
            removeLast();
            return;
        }

        Node current = first;
        int i = 0;
        while (i != index) {
            current = current.next;
            i++;
        }
        current.previous.next = current.next;
        current.next.previous = current.previous;
        size--;
    }

    private void removeLast() {
        if (last.previous == null) {
            first = null;
        } else {
            last.previous.next = null;
        }
        last = last.previous;
        size--;
    }

    private void removeFirst() {
        first = first.next;
        if (isEmpty()) {
            last = null;
        } else {
            first.previous = null;
        }
        size--;
    }

    @Override
    public void remove(E item) {
        checkListEmpty();
        if (first.value.equals(item)) {
            removeFirst();
            return;
        }

        Node current = first;
        while (current!= null && !current.value.equals(item)) {
            current = current.next;
        }
        if (current == null) {
            return;
        }
        if(current == last){
            removeLast();
            return;
        }

        current.previous.next = current.next;
        current.next.previous = current.previous;
        size--;
    }

    @Override
    public E get(int index) {
        checkElementIndex(index);
        Node current = first;
        int i = 0;
        while (i != index) {
            current = current.next;
            i++;
        }
        return current.value;
    }

    @Override
    public void clear(){
        first = last = null;
        size = 0;
    }

    @Override
    public String toString() {
        Node current = first;
        StringBuilder sb = new StringBuilder("[");

        while (current != null) {
            sb.append(current.value).append(", ");
            current = current.next;
        }
        if (sb.length() > 2) {
            sb.setLength(sb.length() - 2);
        }
        sb.append("]");
        return sb.toString();
    }
}
