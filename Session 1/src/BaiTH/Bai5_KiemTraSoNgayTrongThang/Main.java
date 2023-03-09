package BaiTH.Bai5_KiemTraSoNgayTrongThang;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Tính số ngày trong tháng");
        System.out.println("Nhập vào tháng bạn muốn kiểm tra: ");
        Scanner input = new Scanner(System.in); // tạo đối tượng scanner lấy dữ từ hệ thống
        int month = input.nextInt(); // nhận giá trị từ scanner input
        if (month > 0) {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("Tháng " + month + " có 31 ngày");
                    break;
                case 2:
                    System.out.println("Tháng 2 có 28/29 ngày");
                    break;
                default:
                    System.out.println("Tháng " + month + " có 30 ngày");
            }
        } else {
            System.out.println("Không có tháng âm / 0");
        }
    }
}
