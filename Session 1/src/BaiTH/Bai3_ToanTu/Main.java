package BaiTH.Bai3_ToanTu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chiều rộng");
        width = sc.nextFloat();
        System.out.println("Nhập chiều cao");
        height = sc.nextFloat();
        float area = width*height;
        System.out.println("Diện tích hình chữ nhật: " + area);
    }
}
