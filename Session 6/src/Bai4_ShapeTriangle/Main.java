package Bai4_ShapeTriangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Nhập vào 3 cạnh tam giác");
            System.out.println("a: ");
            double a = sc.nextDouble();
            System.out.println("b: ");
            double b = sc.nextDouble();
            System.out.println("c: ");
            double c = sc.nextDouble();
            if(a+b > c && a+c > b && c+b > a) {
                Triangle triangle = new Triangle("red",false, a,b,c);
                System.out.println("Tam giác của bạn là: " + triangle);
                return;
            } else {
                System.out.println("Nhập lại! Tổng 2 cạnh tam giác phải lớn hơn cạnh còn lại");
            }
        }
    }
}
