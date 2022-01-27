package ru.bgpu.lk.stack;

public class LkStack <T> {

    private T[] array;
    private int current;

    LkStack(int size) {
        current = 0;
        array = (T[])(new Object[size]);
    }

    public void push(T value) {
        array[current++] = value;
    }

    public T peek() {
        return array[current-1];
    }

    public T pull() {
        return array[--current];
    }

    public boolean isEmpty() {
        return current == 0;
    }

    public int size() {
        return current;
    }
}
