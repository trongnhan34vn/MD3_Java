package trienKhaiList;

import java.util.Arrays;

public class MyList {
    private int size = 0;
    private final int DEFAULT_CAPICITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPICITY];
    }

    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements,newSize);
    }

    public void add() {
        if (elements.length == size) {
            ensureCapa();
        }
        elements[size++] = e;
    }
}
