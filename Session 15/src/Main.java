import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean bError = true;
        do {
            try {
                input();
                bError = false;
            }
            catch (Exception e) {
                System.out.println("Error!");
            }
        } while (bError);
    }

    public static void input() {
        System.out.println("Điền gì đó!");
        int string = Integer.parseInt((new Scanner(System.in).nextLine()));
        System.out.println("1"  + string);
    }
}