package BaiTH.Bai3_TimUCLN;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        getGreatestCommon();
    }
    public static void getGreatestCommon() {
        System.out.println("Tìm ước chung lớn nhất");
        System.out.println("Nhập vào 2 số");
        System.out.println("Nhập vào số thứ nhất: ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        System.out.println("Nhập vào số thứ hai: ");
        int b = input.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0) {
            System.out.println("Không có ước chung");
        }
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        System.out.println("Ước chung lớn nhất của 2 số " + "là " + a);
    }
}
