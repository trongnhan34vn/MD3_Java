package BaiTap.Bai3_GopMang;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        mergeArrays();
    }
    public static void mergeArrays() {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(merge(arr1, arr2)));
    }

    public static int[] merge(int[] arr1, int[] arr2) {
        int[] newArr = new int[arr1.length + arr2.length];
        int firstLength = arr1.length;
        int secondLength = arr2.length;
        System.arraycopy(arr1, 0, newArr, 0, firstLength);
        System.arraycopy(arr2, 0, newArr, firstLength, secondLength);
        return newArr;
    }
}
