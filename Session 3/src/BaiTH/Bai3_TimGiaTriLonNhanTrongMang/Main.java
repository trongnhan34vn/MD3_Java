package BaiTH.Bai3_TimGiaTriLonNhanTrongMang;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    getGreatestValue();
    }
    public static void getGreatestValue() {
        System.out.println("Tìm giá trị lớn nhất trong mảng: ");
        Scanner sc = new Scanner(System.in);
        int size;
        int[] listAsset;
        do {
            System.out.println("Nhập vào số lượng các giá trị tài sản: ");
            size = sc.nextInt();
        } while (size > 20);
        listAsset = new int[size];

        //Nhập vào từng phần tử
        for (int i = 0; i < listAsset.length; i++) {
            System.out.println("Nhập vào các tài sản: ");
            listAsset[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(listAsset));

        // Tìm giá trị lớn nhất
        int max = listAsset[0];
        for (int i = 0; i < listAsset.length; i++) {
            if (listAsset[i] > max) {
                max = listAsset[i];
            }
        }
        System.out.println("Giá trị tài sản lớn nhất: " + max);
    }
}
