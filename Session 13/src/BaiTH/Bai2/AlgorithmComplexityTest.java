package BaiTH.Bai2;

import java.util.*;

public class AlgorithmComplexityTest {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
        String strInput = "abaababcbbbc";
        findMaxCount(strInput);
    }

    public static void findMaxCount(String string) {
        TreeMap<Integer, Character> mapTest = new TreeMap<>();
        int temp;
        boolean isLoop = false;
        for (int i = 0; i < string.length(); i++) {
            temp = count(string, string.charAt(i));
            for (int j = i - 1; j >= 0; j--) {
                if (string.charAt(j) == string.charAt(i)) {
                    isLoop = true;
                    break;
                } else {
                    isLoop = false;
                }
            }
            if (isLoop) {
                continue;
            }
            System.out.println(string.charAt(i) + "-" + temp);
            mapTest.put(temp, string.charAt(i));
        }
        System.out.println("Result: Chữ " + mapTest.lastEntry().getValue() + " xuất hiện " + mapTest.lastEntry().getKey() + " lần" );
    }

    public static int count(String string, char c) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (c == string.charAt(i)) {
                count++;
            }
        }
        return count;
    }
}
