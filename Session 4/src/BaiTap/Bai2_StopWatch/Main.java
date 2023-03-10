package BaiTap.Bai2_StopWatch;

import BaiTap.Bai2_StopWatch.StopWatch;

public class Main {
    public static void main(String[] args) {
        StopWatch sw = new StopWatch();
        int [] arr = new int[100000];
        sw.start();
        System.out.println("Thời gian bắt đầu: " + sw.getStartTime());
        selectionSort(arr);
        sw.stop();
        System.out.println("Thời gian kết thúc: " + sw.getEndTime());
        System.out.println("Thời gian đã trôi qua: " + sw.getElapsedTime());
    }
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // Duyệt qua từng phần tử của mảng
        for (int i = 0; i < n - 1; i++) {

            // Tìm phần tử nhỏ nhất trong mảng chưa được sắp xếp
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            // Hoán đổi phần tử nhỏ nhất và phần tử đầu tiên
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
}
