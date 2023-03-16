package Bai1_CanChi;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalDate localDate = LocalDate.now();
        int year = localDate.getYear();
        System.out.println(year);
        System.out.println("In ra can-chi");
        while (true) {
            System.out.println("Nhập vào tuổi của bạn: ");
            int age = sc.nextInt();
            if (age >= 0 && age <= year) {
                int birthYear = year - age;
                System.out.println("Kết quả: " + can(birthYear) + " " + chi(birthYear));
                return;
            } else {
                System.out.println("Nhập không chính xác");
            }
        }
    }

    public static String can(int birthYear) {
        String can = "";
        switch (birthYear % 10) {
            case 0:
                can = "CANH";
                break;
            case 1:
                can = "TÂN";
                break;
            case 2:
                can = "NHÂM";
                break;
            case 3:
                can = "QUÝ";
                break;
            case 4:
                can = "GIÁP";
                break;
            case 5:
                can = "ẤT";
                break;
            case 6:
                can = "BÍNH";
                break;
            case 7:
                can = "ĐINH";
                break;
            case 8:
                can = "MẬU";
                break;
            case 9:
                can = "KỶ";
                break;
        }
        return can;
    }

    public static String chi(int birthYear) {
        String chi = "";
        switch (birthYear % 12) {
            case 0:
                chi = "THÂN";
                break;
            case 1:
                chi = "DẬU";
                break;
            case 2:
                chi = "TUẤT";
                break;
            case 3:
                chi = "HỢI";
                break;
            case 4:
                chi = "TÝ";
                break;
            case 5:
                chi = "SỬU";
                break;
            case 6:
                chi = "DẦN";
                break;
            case 7:
                chi = "MẸO";
                break;
            case 8:
                chi = "THÌN";
                break;
            case 9:
                chi = "TỴ";
                break;
            case 10:
                chi = "NGỌ";
                break;
            case 11:
                chi = "MÙI";
                break;
        }
        return chi;
    }
}
