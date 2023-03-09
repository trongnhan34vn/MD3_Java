package BaiTap.appCurrency;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        appCurrency();
    }
    public static void appCurrency() {
        float usd;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào USD: ");
        usd = scanner.nextFloat();
        float result = usd * 23000;
        System.out.println("VND: " + result);
    }
}
