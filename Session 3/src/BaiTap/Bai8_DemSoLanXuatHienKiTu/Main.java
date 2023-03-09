package BaiTap.Bai8_DemSoLanXuatHienKiTu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        getCharactFromString();
    }
    public static void getCharactFromString() {
        String string = "Anh Lâm dở hơi!";
        System.out.println("Chuỗi tìm kiếm: " + string);
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào kí tự muốn tìm kiếm: ");
        String searchCharacter = sc.nextLine();
        System.out.println("Số lần xuất hiện của kí tự " + "'" + searchCharacter + "'" + " trong " + "'" + string + "'" + " là: " + getTimesOccur(searchCharacter, string));
    }

    public static int getTimesOccur(String searchCharater, String string) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (searchCharater.equalsIgnoreCase(String.valueOf(string.charAt(i)))) {
                count++;
            }
        }
        return count;
    }
}
