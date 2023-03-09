package BaiTH.Bai2_TimGiaTriTrongMang;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        getValueElementOfArr();
    }
    public static void getValueElementOfArr() {
        Scanner sc = new Scanner(System.in);
        String[] listStudents = {"Nhân", "Khoa Pug", "Anh Tấn", "Thắng", "Pikachu"};
        System.out.println("Hãy nhập vào tên bạn muốn tìm");
        String search = sc.nextLine();
        boolean isNonExist = true;

        while (isNonExist) {
            for (int i = 0; i < listStudents.length; i++) {
                if (search.equalsIgnoreCase(listStudents[i])) {
                    System.out.println("Vị trí của " + search + " trong lớp là " + (i + 1));
                    isNonExist = false;
                    break;
                }
            }
            if (isNonExist) {
                System.out.println("Nhập lại đi!");
                search = sc.nextLine();
            }
        }
    }
}
