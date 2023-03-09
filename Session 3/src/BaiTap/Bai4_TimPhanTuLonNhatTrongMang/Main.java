package BaiTap.Bai4_TimPhanTuLonNhatTrongMang;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        getGreatestElement();
    }
    //    Tìm phần tử lớn nhất của mảng 2 chiều

    public static void getGreatestElement() {
        Scanner sc = new Scanner(System.in);
        int[][] arr;
        arr = new int[2][5];
        System.out.println("Mảng 2 chiều");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Nhập vào các phần tử của mảng");
                int input = sc.nextInt();
                arr[i][j] = input;
                System.out.println(Arrays.deepToString(arr));
            }
        }
        System.out.println("Mảng bạn vừa nhập:" + Arrays.deepToString(arr));
        System.out.println("Giá trị lớn nhất trong ma trận: " + getGreatest(arr));
    }

    public static int getGreatest(int[][] arr) {
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
}
