package BaiTap.Bai3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String string = "abcabcdgabxy";
        LinkedList<Character> list = new LinkedList<>();
        LinkedList<Character> max = new LinkedList<>();

        for (int i = 0; i < string.length(); i++) {
            if(list.size() > 1 && string.charAt(i) <= list.getLast() && list.contains(string.charAt(i))) {
                list.clear();
            }
            list.add(string.charAt(i));
            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
            for (Character ch: max) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
