package ru.inno;

public interface List<T> extends Collections<T> {
    void removeAt(int index);
    T get(int index);
}
