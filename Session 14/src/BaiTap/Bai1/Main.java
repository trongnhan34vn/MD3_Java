package BaiTap.Bai1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {-2, 5, 6, 3, 23, -10, 6};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertSort(int[] arr) {
//        Duyệt mảng từ phần tử thứ 2
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;
            // Di chuyển các phần tử của arr [0 ... i - 1], lớn hơn key
            // đến một vị trí trước vị trí hiện tại của chúng
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = temp;
        }
    }
}
