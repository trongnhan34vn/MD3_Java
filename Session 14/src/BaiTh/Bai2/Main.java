package BaiTh.Bai2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int test[] = {2, 4, 10, -2, 5, 6, 9};
        bubbleSort(test);
        System.out.println(Arrays.toString(test));
    }

    public static void bubbleSort(int[] list) {
        boolean isSorted = false;
        for (int i = 1; i < list.length; i++) {
            for (int j = 0; j < list.length - i; j++) {
                if (list[j] > list[j + 1]) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                    isSorted = true;
                }
            }
        }
        if (!isSorted) {
            System.out.println("Mảng đã được sắp xếp!");
        }
    }
}
