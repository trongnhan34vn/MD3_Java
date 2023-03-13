package Bai4_ShapeTriangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào 3 cạnh tam giác");
        System.out.println("a: ");
        double a = sc.nextDouble();
        System.out.println("b: ");
        double b = sc.nextDouble();
        System.out.println("c: ");
        double c = sc.nextDouble();
        Triangle triangle = new Triangle("red",false, a,b,c);
        System.out.println("Tam giác của bạn là: " + triangle);
    }
}
