package BaiTap.Bai1;

import java.util.Arrays;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        reverseArrInterger();
        reverseChar();
        reverseString();
    }

    public static void reverseArrInterger() {
        System.out.println("Reverse Interger Array------------\n");
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Stack<Integer> stack = new Stack<>();
        System.out.println("arr ---> " + Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }
        System.out.println("stack ---> " + stack);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }
        System.out.println("reverse arr ---> " + Arrays.toString(arr) + "\n");
    }

    public static void reverseChar() {
        System.out.println("Reverse Char From String--------------");
        String string = "Nhân học dốt!";
        System.out.println("word ---> " + string);
        Stack<Character> wStack = new Stack<>();
        for (int i = 0; i < string.length(); i++) {
            wStack.push(string.charAt(i));
        }
        System.out.println("stack ---> " + wStack);
        Character[] newArr = new Character[string.length()];
        for (int i = 0; i < string.length(); i++) {
            newArr[i] = wStack.pop();
        }
        String result = "";
        for (int i = 0; i < newArr.length; i++) {
            result += newArr[i];
        }
        System.out.println("reverse string ---> " + result + "\n");
    }

    public static void reverseString() {
        System.out.println("Reverse String------------------");
        String string = "Nhân học dốt!";
        System.out.println("string ---> " + string);
        String[] stringArr = string.split(" ");
        Stack<String> wStack = new Stack<>();
        for (int i = 0; i < stringArr.length; i++) {
            wStack.push(stringArr[i]);
        }
        for (int i = 0; i < stringArr.length; i++) {
            stringArr[i] = wStack.pop();
        }
        String result = "";
        for (int i = 0; i < stringArr.length; i++) {
            result += " " + stringArr[i];
        }
        System.out.println("reverse string ---> " + result);
    }
}
