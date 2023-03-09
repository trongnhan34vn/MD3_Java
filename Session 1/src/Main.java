import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    sayHello();
    }

    public static void sayHello() {
        System.out.println("Enter your name: ");
//        Tạo ô input
        Scanner scanner = new Scanner(System.in);
//        Tạo 1 biến tên name và gắn giá trị của ô input
        String name = scanner.nextLine();
        System.out.println("Hello " + name);
    }


}