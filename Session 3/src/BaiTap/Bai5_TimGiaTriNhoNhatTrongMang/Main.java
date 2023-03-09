package BaiTap.Bai5_TimGiaTriNhoNhatTrongMang;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        getMinArr();
    }

    public static void getMinArr() {
        System.out.println("Tìm giá trị nhỏ nhất trong mảng");
        Scanner sc = new Scanner(System.in);
        int size;
        int[] arr;
        do {
            System.out.println("Nhập vào kích thước mảng:");
            size = sc.nextInt();
            if (size > 30) {
                System.out.println("Kích thước mảng không quá 30 phần tử");
            }
        } while (size > 30);
//      Định dạng mảng và Nhập vào từng phần tử của mảng
        arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhập vào từng phần tử của mảng: ");
            arr[i] = sc.nextInt();
        }

//        Tìm giá trị nhỏ nhất
        System.out.println("Giá trị nhỏ nhất trong mảng: " + getMin(arr));
    }

    public static int getMin(int[] arr) {
        return Arrays.stream(arr).min().getAsInt();
    }
}
