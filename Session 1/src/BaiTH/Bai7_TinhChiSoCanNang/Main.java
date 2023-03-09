package BaiTH.Bai7_TinhChiSoCanNang;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Kiểm tra chỉ số cân nặng");
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào cân nặng của bạn(kg): ");
        float weight = input.nextFloat();
        System.out.println("Nhập vào chiều cao của bạn(m): ");
        float height = input.nextFloat();
        float bmi = weight / (height * height);
        System.out.println("Chỉ số BMI của bạn: " + bmi);
        if (bmi < 18.5) {
            System.out.println("Bạn gầy quá");
        }
        if (bmi >= 18.5 && bmi < 25.0) {
            System.out.println("Bạn cũng bình thường");
        }
        if (bmi >= 25.0 && bmi < 30.0) {
            System.out.println("Bạn quá cân rồi");
        }
        if (bmi >= 30.0) {
            System.out.println("Bạn béo vãi ò!");
        }
    }
}
