package ru.inno;

public class ArrayList<T> implements List<T> {
    private final static int DEFAULT_ARRAY_SIZE = 10;

    @Override
    public int size() {
        return count;
    }

    private T[] array;

    private int count;

    @Override
    public void add(T element) {
        if (isFull()) {
            resize();
        }
        array[count++] = element;
    }

    @Override
    public boolean contains(T element) {
        for (int i = 0; i <= count; i++) {
            if (array[i].equals(element)) {
                return true;
            }
        }
        return false;
    }

    public ArrayList() {
        this.array = (T[]) new Object[DEFAULT_ARRAY_SIZE];
        this.count = 0;
    }

    //---------------------------------------------------ДЗ

    @Override
    public void remove(T element) {
        if (count < 1) {
            return;
        }

        for (int i = 0; i < count; i++) {
            if (array[i].equals(element)) {
                remoteItem(i);
                return;
            }
        }

    }

    @Override
    public void removeAt(int index) {
        if (!checkIndex(index)) {
            return;
        }
        remoteItem(index);
    }

    private void remoteItem(int index) {
        for (int i = index; i < count - 1; i++) {
            array[i] = array[i + 1];
        }
        count--;
        return;

    }

    private boolean checkIndex(int index) {
        return index >= 0 && index < count;
    }

    //-----------------------------------------------------

    @Override
    public T get(int index) {
        if (index >= 0 && index < count) {
            return array[index];
        }
        return null;
    }

    private void resize() {
        int newLength = (int) (array.length * 1.5);
        T[] newElements = (T[]) new Object[newLength];
        for (int i = 0; i < count; i++) {
            newElements[i] = array[i];
        }
        this.array = newElements;
    }

    private boolean isFull() {
        return count == array.length;
    }


}
