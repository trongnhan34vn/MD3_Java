package BaiTH.Bai1;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class AlgorithmComplexityTest {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
        String strInput = "aaabbbbbc";
        findMaxCount(strInput);
    }

    public static void findMaxCount(String string) {
        boolean isLoop = false;
        for (int i = 0; i < string.length(); i++) {
            for (int j = string.length() - 1; j > 0; j--) {
                System.out.println(string.charAt(i) +"----" +string.charAt(j));
                if (string.charAt(j) == string.charAt(i)) {
                    isLoop = true;
                    break;
                } else {
                    isLoop = false;
                }
            }
            if (!isLoop) {
                System.out.println(string.charAt(i));
            }

        }
    }

    public static int count(char c, String string) {
        int count = 0;
        for (int i = 0; i < string.length() - 1; i++) {
            if (c == string.charAt(i)) {
                count ++;
            }
        }
        return count;
    }
}
