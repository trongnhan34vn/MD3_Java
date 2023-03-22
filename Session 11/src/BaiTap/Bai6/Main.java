package BaiTap.Bai6;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String string = "s * (s – a) * (s – b) * (s – c)";
        check(string);
        System.out.println(check(string));
    }

    public static boolean check(String string) {
        Stack<Character> bStack = new Stack<>();
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == '(') {
                bStack.push(string.charAt(i));
            }
            if (string.charAt(i) == ')') {
                if (bStack.size() == 0) {
                    return false;
                }
                char left = bStack.pop();
                if (left == string.charAt(i)) {
                    return false;
                }
            }
        }
        if (bStack.size() == 0) {
            return true;
        } else {
            return false;
        }
    }
}
