package ru.inno;

public class LinkedList<T> implements List<T> {

    private Node<T> first;
    private Node<T> last;
    private int count;

    private static class Node<E> {
        E value;
        Node<E> next;

        public Node(E value) {
            this.value = value;
        }
    }

    @Override
    public void add(T element) {
        Node<T> node = new Node<>(element);

        if (count == 0) {
            this.first = node;
        } else {
            this.last.next = node;
        }

        this.last = node;
        count++;
    }

    @Override
    public boolean contains(T element) {
        Node<T> current = this.first;
        while (current != null) {
            if (current.value.equals(element)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    @Override
    public int size() {
        return this.count;
    }

    //-------------------------------------------------------------ДЗ
    @Override
    public void remove(T element) {
        Node<T> current = this.first;
        for (int i = 0; i < count; i++) {
            if (current.value.equals(element)) {
                removeAt(i);
            }
        }

    }

    @Override
    public void removeAt(int index) {


        if (index == 0) {
            this.first = getNode(index + 1);
            count--;
            return;
        } else if (index == count) {
            this.last = getNode(index - 1);
            count--;
            return;
        } else {
            getNode(index - 1).next = getNode(index + 1);
            count--;
            return;
        }


    }

    public Node<T> getNode(int index) {

            Node<T> current = this.first;

            for (int i = 0; i < index; i++) {
                current = current.next;
            }

            return current;
    }
    //------------------------------------------------------------------------

    @Override
    public T get(int index) {
        Node<T> node = getNode(index);
        if (node != null) {
            return node.value;
        }
        return null;
    }
}
