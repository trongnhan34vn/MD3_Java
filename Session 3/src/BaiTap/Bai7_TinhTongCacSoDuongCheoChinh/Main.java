package BaiTap.Bai7_TinhTongCacSoDuongCheoChinh;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        getSumSquareMatrix();
    }

    //    Bài 7: Tính tổng đường chéo chính của ma trận 2 chiều
    public static void getSumSquareMatrix() {
        //        Khai báo mảng 2 chiều
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[2][2];
//      Nhập vào từng phần tử của mảng
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Nhập vào từng phần tử của mảng");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Mảng sau khi đã nhập: " + Arrays.deepToString(arr));
//        Tính tổng đường chéo chính
        System.out.println("Tổng đường chéo chính: " + getSumMainDiagonal(arr));
    }

    public static int getSumMainDiagonal(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    sum += arr[i][i];
                }
            }
        }
        return sum;
    }
}
