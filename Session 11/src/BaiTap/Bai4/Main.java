package BaiTap.Bai4;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Number: ");
        int number = scanner.nextInt();
        convertDecimalToBinary(number, stack);
    }

    public static void convertDecimalToBinary(int number, Stack stack) {
        System.out.println("Decimal ----> " + number);
        String binary = "";
        if (number == 0) {
            binary = "0";
        } else {
            while (number != 0) {
                stack.push(number % 2);
                number = number / 2;
            }
        }
        while (!stack.isEmpty()) {
            binary += stack.pop();
        }
        System.out.println(stack);
        System.out.println("Binary ----> " +binary);
    }
}
