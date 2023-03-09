package BaiTH.Bai6_DemSoLuongSinhVienDoTruot;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        getPass();
    }

    //  Xếp loại đỗ trượt
    public static void getPass() {
        System.out.println("Phân loại học sinh đỗ / trượt");
        Scanner sc = new Scanner(System.in);
        int size;
        int[] scoresArr;
        do {
            System.out.println("Nhập vào độ dài danh sách");
            size = sc.nextInt();
            if (size > 30) {
                System.out.println("Nhập ít hơn 30 điểm");
            } else {
                System.out.println("OK!");
            }
        } while (size > 30);

        // định dạng mảng và nhập vào từng phần tử trong mảng
        scoresArr = new int[size];

        while (true) {
            for (int i = 0; i < scoresArr.length; i++) {
                int input = sc.nextInt();
                if (input <= 10) {
                    scoresArr[i] = input;
                } else {
                    System.out.println("Nhập lại đi! Chú ý Thang điểm 10!");
                    break;
                }
            }

            if (scoresArr[scoresArr.length - 1] != 0) {
                System.out.println(Arrays.toString(scoresArr));
                System.out.println("Số sinh viên đỗ: " + getResult(scoresArr));
                return;
            }
        }
    }

    public static int getResult(int[] arr) {
        String[] score = new String[arr.length];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 5) {
                score[i] = "Đỗ";
                count++;
            } else {
                score[i] = "Trượt";
            }
        }
        return count;
    }
}
