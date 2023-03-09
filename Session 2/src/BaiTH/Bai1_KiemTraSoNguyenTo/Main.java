package BaiTH.Bai1_KiemTraSoNguyenTo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        checkPrimeNum();
    }
    public static void checkPrimeNum() {
        System.out.println("Kiểm tra số nguyên tố");
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào một số bất kì lớn hơn 0");
        int number = input.nextInt();
        boolean isPrime = false;
        int count = 2;
        while (true) {
            if (number > 2) {
                while (count < number) {
                    if (number % count == 0) {
                        isPrime = false;
                        break;
                    } else {
                        isPrime = true;
                    }
                    count++;
                }
                if (isPrime) {
                    System.out.println("Số " + number + " là số nguyên tố!");
                } else {
                    System.out.println("Số " + number + " KHÔNG là số nguyên tố!");
                }
                return;
            } else {
                System.out.println("Nhập số dương lớn hơn 2 bạn ơi!");
            }
        }
    }
}
