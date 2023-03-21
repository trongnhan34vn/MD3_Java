package BaiTap.Bai5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String string = "Able was I ere I saw Elba";
        string = string.toLowerCase();
        Stack<Character> sStack = new Stack<>();
        Queue<Character> sQueue = new LinkedList<>();
        for (int i = 0; i < string.length(); i++) {
            sStack.push(string.charAt(i));
            sQueue.add(string.charAt(i));
        }
        System.out.println("stack ----> "+ sStack);
        System.out.println("queue ----> " + sQueue);
        boolean isPalindrome = false;
        for (int i = 0; i < string.length(); i++) {
            if (sQueue.poll() == sStack.pop()) {
                isPalindrome = true;
            } else {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("Chuỗi "+ "'" + string+ "'" + " là chuỗi Palindrome");
        } else {
            System.out.println("Chuỗi "+ "'" + string+ "'" + " KHÔNG là chuỗi Palindrome");
        }
    }
}
