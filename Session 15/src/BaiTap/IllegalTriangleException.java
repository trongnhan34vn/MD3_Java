package BaiTap;

import java.util.Scanner;

public class IllegalTriangleException extends Exception {
    public IllegalTriangleException(String errorMessage) {
        super(errorMessage);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào 3 cạnh tam giác: ");
        System.out.println("Nhập vào a: ");
        int a = scanner.nextInt();
        System.out.println("Nhập vào b: ");
        int b = scanner.nextInt();
        System.out.println("Nhập vào c: ");
        int c = scanner.nextInt();
        try {
            if (a < 0 || b < 0 || c < 0) {
                throw new IllegalTriangleException("Cạnh tam giác không âm!");
            } else {
                if (a+b<c||a+c<b||b+c<a) {
                    throw new IllegalTriangleException("Không là tam giác!");
                }
            }
        } catch (IllegalTriangleException e) {
            System.err.println("Xảy ra ngoại lệ: " + e.getMessage());
        }

    }
}
