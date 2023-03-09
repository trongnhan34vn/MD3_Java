package BaiTap.Bai9_TimPhanTuLonThu2TrongMang;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        getMax2OfArray();
    }

    //    Tìm số lớn thứ 2 trong mảng
    public static void getMax2OfArray() {
        int[] arr = {12, 23, 10, 5, 76, 60, 68, 80, 54, 75};
        System.out.println("Mảng ban đầu: " + Arrays.toString(arr));
//        Tìm số lớn thứ 2
        System.out.println("Số lớn thứ 2 trong mảng: " + getMax2(arr));
    }

    public static int getMax2(int[] arr) {
        int max = arr[0];
        int max2;
        int[] newArr = new int[arr.length - 1];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                continue;
            }
            newArr[j] = arr[i];
            j++;
        }
        max2 = newArr[0];
        for (int i = 0; i < newArr.length; i++) {
            if (newArr[i] > max2) {
                max2 = newArr[i];
            }
        }
        System.out.println(Arrays.toString(newArr));
        return max2;
    }
}

