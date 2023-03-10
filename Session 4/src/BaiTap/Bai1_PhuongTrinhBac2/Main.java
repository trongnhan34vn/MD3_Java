package BaiTap.Bai1_PhuongTrinhBac2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Giải phương trình bậc 2: 0 = a * x^2 + bx + c");
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Nhập hệ số a: ");
            int a = sc.nextInt();
            System.out.println("Nhập hệ số b: ");
            int b = sc.nextInt();
            System.out.println("Nhập hệ số c: ");
            int c = sc.nextInt();
            QuadraticEquation equation = new QuadraticEquation(a, b, c);
            if (equation.getDelta() > 0) {
                System.out.println("Phương trình có 2 nghiệm: ");
                System.out.println("x1 = " + equation.getRoot1() + "; " + "x2 = " + equation.getRoot2());
                return;
            } else if (equation.getDelta() == 0) {
                System.out.println("Phương trình có 1 nghiệm: ");
                System.out.println("x1 = x2 = " + (-b / (2 * a)));
                return;
            } else if (equation.getDelta() < 0) {
                System.out.println("Phương trình vô nghiệm");
            }
        }
    }
}
