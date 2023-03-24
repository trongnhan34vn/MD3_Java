package BaiTH.Bai1;

import java.util.Arrays;

public class BinarySearch {
    //    Khai báo mảng số nguyên tăng dần
    static int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};

    static int binarySearch(int[] list, int key) {
//        vị trí phần tử nhỏ nhất
        int low = 0;
//        vị trí phần tử lớn nhất
        int high = list.length - 1;
        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < list[mid]) {
                high = mid - 1;
            } else if (key == list[mid]) {
                return mid;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(list));
        int key = 69;
        System.out.println("Phần tử cần tìm kiếm: " + key);
        binarySearch(list, key);
        System.out.println("Result: " + binarySearch(list, key));
    }
}
