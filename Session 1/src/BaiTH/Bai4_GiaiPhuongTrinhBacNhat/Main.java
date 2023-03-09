package BaiTH.Bai4_GiaiPhuongTrinhBacNhat;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver ax + b = 0");
        System.out.println("Enter the constants");
//        Tạo ô input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter vari a");
        double a = input.nextDouble();
        System.out.println("Enter vari b");
        double b = input.nextDouble();
        double result;
        if (a != 0) {
            if (b == 0) {
                System.out.println("Phương trình có 1 nghiệm: " + 0);
            } else {
                result = -b / a;
                System.out.println("Phương trình có 1 nghiệm: " + result);
            }
        } else {
            if (b == 0) {
                System.out.println("Phương trình vô số nghiệm");
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        }
    }
}
