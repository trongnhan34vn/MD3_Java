package BaiTH.Bai4_ChuyenDoiNhietDo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        exChangeTemp();
    }
    public static void exChangeTemp() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ứng dụng chuyển từ độ C sang độ F");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("0. Exit");
        int input = sc.nextInt();
        switch (input) {
            case 1:
                System.out.println("Nhập vào độ F");
                int fahren = sc.nextInt();
                double resultC = fToC(fahren);
                System.out.println(resultC);
                break;
            case 2:
                System.out.println("Nhập vào độ C");
                int cel = sc.nextInt();
                double resultF = cToF(cel);
                System.out.println(resultF);
                break;
            case 0:
                break;
        }
    }
    //    Chuyển từ độ F sang độ C
    public static double fToC(double fahren) {
        double result = (fahren - 32) * (5.0 / 9);
        return result;
    }

    //    Chuyển từ C sang F
    public static double cToF(double cel) {
        double result = cel * (9.0 / 5) + 32;
        return result;
    }
}
