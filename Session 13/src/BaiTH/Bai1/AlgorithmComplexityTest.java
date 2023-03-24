package BaiTH.Bai1;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AlgorithmComplexityTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String strInput = scanner.nextLine();
        findMaxCount(strInput);
        Map<Integer,String> map = new LinkedHashMap<>();
        System.out.println(map);
    }

    public static void findMaxCount(String string) {
        int count = 0;
        char temp;
        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j < string.length() - 1; j++) {
                if (string.charAt(j) == string.charAt(i)) {
                    count ++;

                }
            }
        }
    }
}
