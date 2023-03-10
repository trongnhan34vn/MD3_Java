package BaiTH;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Nhập vào chiều rộng: ");
            double width = sc.nextDouble();
            System.out.println("Nhập vào chiều cao: ");
            double height = sc.nextDouble();
            if (width < height) {
                Retangle retangle = new Retangle(width, height);
                System.out.println("Diện tích hình chữ nhật " + retangle.getArea());
                System.out.println("Chu vi hình chữ nhật " + retangle.getPerimeter());
                return;
            } else {
                System.out.println("Chiều rộng phải nhỏ hơn chiều dài!");
            }
        }
    }
}
