package BaiTH.Bai2_TinhLai;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        calcuateInterest();
    }
    public static void calcuateInterest() {
        System.out.println("Chương trình tính lãi cho vay của ngân hàng");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số tiền gửi");
        int mount = sc.nextInt();
        System.out.println("Nhập thời gian gửi");
        int time = sc.nextInt();
        System.out.println("Nhập vào lãi (%/năm)");
        float interest = sc.nextFloat();
        float result = 0f;
        for (int i = 0; i < time; i++) {
            result += mount * interest / 12 * time;
        }
        System.out.println("Số tiền lãi " + result + " đồng");
    }
}
