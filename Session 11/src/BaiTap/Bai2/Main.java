package BaiTap.Bai2;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        String string = "Mỗi từ lấy ra từ chuỗi chuyển toàn bộ thành chữ hoa hoặc chữ thường Coi mỗi từ được lấy ra từ chuỗi là 1 key";
        string = string.toLowerCase();
        String[] stringArr = string.split(" ");
        System.out.println(Arrays.toString(stringArr));
        Map<String, Integer> wCount = new TreeMap<>();
        for (String word: stringArr) {
            if(!wCount.containsKey(word)) {
                wCount.put(word, 1);
            } else {
                int count = wCount.get(word);
                wCount.put(word, count + 1);
            }
        }

        System.out.println(wCount);
    }
}
