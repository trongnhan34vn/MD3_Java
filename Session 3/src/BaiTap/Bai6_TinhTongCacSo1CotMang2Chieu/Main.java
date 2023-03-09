package BaiTap.Bai6_TinhTongCacSo1CotMang2Chieu;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        getSumColArr();
    }

    //    Tính tổng các số ở một cột xác định
    public static void getSumColArr() {
//        Khai báo mảng 2 chiều
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[2][5];
        int input;
//        Nhập vào từng phần tử của mảng
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Nhập vào các phần tử của mảng: ");
                input = sc.nextInt();
                arr[i][j] = input;
            }
        }
        System.out.println("Mảng sau khi đã nhập: " + Arrays.deepToString(arr));
//        Tính tổng cột
        System.out.println("Nhập vào index cột muốn tính tổng: ");
        int indexCol = sc.nextInt();
        System.out.println("Tổng: " + getSum(arr, indexCol));
    }

    public static int getSum(int[][] arr, int indexCol) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (indexCol == j) {
                    sum += arr[i][indexCol];
                }
            }
        }
        return sum;
    }
}
