package com.epam.bobrova_anna.lesson4;

import java.util.Arrays;

public class DynamicArray<T> {

    private Object[] arr;
    private int indexOfLastEmptyElem = 0;

    public DynamicArray(int initialSize) {
        this.arr = new Object[initialSize];
    }

    public DynamicArray() {
        this.arr = new Object[10];
    }

    public int size() {
        return indexOfLastEmptyElem;
    }

    @SuppressWarnings("unchecked")
    public T get(int index) {
        return (T) arr[index];
    }

    public void add(T e) {
        if (size() == arr.length) {
            Object[] tempArr = Arrays.copyOf(arr, size());
            this.arr = Arrays.copyOf(tempArr, size() + 1);
        }
        arr[indexOfLastEmptyElem] = e;
        indexOfLastEmptyElem++;
    }

    public void remove(int index) {
        Object[] tempArr = Arrays.copyOf(arr, size());

        if (index == 0) {
            this.arr = Arrays.copyOfRange(tempArr, 1, size());

        } else {
            if (index == size() - 1) {
                this.arr = Arrays.copyOfRange(tempArr, 0, index);
            } else {
                Object[] first = Arrays.copyOfRange(tempArr, 0, index);
                Object[] second = Arrays.copyOfRange(tempArr, index + 1, size());
                this.arr = Arrays.copyOf(first, first.length + second.length);
                System.arraycopy(second, 0, this.arr, first.length, second.length);
            }
        }
        indexOfLastEmptyElem--;
    }

    @Override
    public String toString() {
        return Arrays.toString(arr);
    }

}