package BaiTap.Bai2_HienThiCacLoaiHinh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    menu();
    }
    public static void menu() {
        int choice = -1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Vẽ các loại hình");
        System.out.println("");
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Draw Retangular");
            System.out.println("2. Draw square triangle");
            System.out.println("3. Draw isosceles triangle");
            System.out.println("0. Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    drawRetangular();
                    break;
                case 2:
                    drawTriangle();
                    break;
                case 3:
                    drawIsoscelesTriangle();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("No choice!");
            }
        }
    }


    //   vẽ các loại hình
    public static void drawRetangular() {
        System.out.println("Vẽ hình chữ nhật");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public static void drawTriangle() {
        System.out.println("Vẽ hình tam giác");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println("*");
        }

        for (int i = 5; i > 0; --i) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void drawIsoscelesTriangle() {

    }
}
