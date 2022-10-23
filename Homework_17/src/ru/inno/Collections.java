package ru.inno;

public interface Collections<T>  {

    void add(T element);
    void remove(T element);
    boolean contains(T element);
    int size();

}
