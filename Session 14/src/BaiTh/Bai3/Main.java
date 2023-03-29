package BaiTh.Bai3;

import java.util.Arrays;

public class Main {
    public static double[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
    public static void main(String[] args) {
        selectionSort(list);
        System.out.println(Arrays.toString(list));
    }
    public static void selectionSort(double[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            /* Find the minimum in the list[i..list.length-1] */
            double currentMin = list[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            /* Swap list[i] with list[currentMinIndex] if necessary */
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }
}
