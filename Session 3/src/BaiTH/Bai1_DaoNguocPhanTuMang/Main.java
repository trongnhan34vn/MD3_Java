package BaiTH.Bai1_DaoNguocPhanTuMang;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        reverseElementArr();
    }
    public static void reverseElementArr() {
        System.out.println("Đề bài: Đảo ngược phần tử mảng");
        Scanner sc = new Scanner(System.in);
        int size;
        int arr[];
        // vòng lặp kiểm tra độ dài mảng
        do {
            System.out.println("Enter the size: ");
            size = sc.nextInt();
            if (size > 20) {
                System.out.println("Please re-enter size");
            }
        } while (size > 20); // nếu người dùng nhập số lớn hơn 20, thì điều kiện đúng => tiếp tục vòng lặp
        arr = new int[size];
        int index = 0;
        // sử dụng vòng lặp nhập vào từng phần tử của mảng
        while (index < arr.length) {
            System.out.println("Enter element " + (index + 1));
            arr[index] = sc.nextInt();
            index++;
            System.out.println(Arrays.toString(arr));
        }

        // đổi chỗ các phần tử của mảng
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[size - 1 - i];
            arr[size - 1 - i] = temp;
        }

        System.out.println("Reverse Array: " + Arrays.toString(arr));
    }
}
