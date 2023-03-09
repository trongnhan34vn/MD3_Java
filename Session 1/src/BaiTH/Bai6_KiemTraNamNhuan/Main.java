package BaiTH.Bai6_KiemTraNamNhuan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Kiểm tra năm nhuận");
        System.out.println("Nhập vào năm muốn kiểm tra");
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        boolean isLeapYear = false;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 != 0) {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }
        if (isLeapYear) {
            System.out.println("Năm " + year + " là năm nhuận");
        } else {
            System.out.println("Năm " + year + " KHÔNG PHẢI là năm nhuận");
        }
    }
}
