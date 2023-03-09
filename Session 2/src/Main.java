import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    }


    public static void isOdd() {

    }

    public static void testSwitchCase() {
        System.out.println("Bạn học dốt lắm đúng không?");
        Scanner input = new Scanner(System.in);
        String answer = input.nextLine();
        switch (answer) {
            case "yes":
                System.out.println("Đúng! bạn dốt lắm!");
                break;
            case "no":
                System.out.println("Không! bạn dốt thật mà!");
                break;
            default:
                System.out.println("Trả lời đi!");
        }
    }

    public static void testOperator() {
        System.out.println("Nhập vào 1 số: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        String trueResult = "Số bạn nhập là số dương";
        String falseResult = "Số bạn nhập là số âm";
        System.out.println((number > 0) ? trueResult : falseResult);
    }


    // Bài 1 Giải phương trình bậc nhất
    public static void solveFirstEquation() {

    }


    // Bài 2: Kiểm tra số ngày trong tháng
    public static void calDayOfMonth() {

    }

    // Bài 3: Kiểm tra năm nhuận

    public static void checkLeapYear() {

    }

    //    BÀI 4: TÍNH CHỈ SỐ CÂN NẶNG
    public static void checkBMI() {

    }
}

//    Bài 5: Đọc số
