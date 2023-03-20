package BaiTH.ArrayList;

import java.util.Arrays;

public class MyArrayList<E> {
    private int size = 0;
    private final int CAPACITY = 10;
    private Object elements[];

    public MyArrayList() {
        elements = new Object[CAPACITY];
    }

    private void ensureCapacity() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(E e) {
//        full size -> tăng độ dài mảng
        if (size == elements.length) {
            ensureCapacity();
        }
        elements[size++] = e;
    }

    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException();
        }
        return (E) elements[i];
    }

    public void add(int i, E e) {
        if (size == elements.length) {
            ensureCapacity();
        }
        for (int j = size - 1; j >= i; j--) {
            System.out.println(size);
            elements[j + 1] = elements[j];
        }
        elements[i] = e;
    }

    void clear() {
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
    }

    public Object[] remove(int i) {
        for (int j = i; j < elements.length-1; j++) {
            elements[i] = elements[j + 1];
        }
        return elements;
    }

    public int indexOf(E e) {
        for (int i = 0; i < elements.length; i++) {
            if (e == elements[i]) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "elements=" + Arrays.toString(elements) +
                '}';
    }
}