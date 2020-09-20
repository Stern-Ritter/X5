package ru.x5.hw6.Task2;

public interface MyList<E> {
    int size();
    void add(E item);
    void remove(int index);
    void remove(E item);
    E get (int index);
    void clear();
}
