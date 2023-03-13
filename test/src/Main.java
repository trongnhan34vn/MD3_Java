import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);
        int n1 = 0;
        while (n1 < 20) {
            if (n1 % 2 == 0) {
                System.out.print(n1 + "-");
            }
            n1++;
        }

        for (; n1 < 100; n1++) {
            if (n1 % 2 == 0) {
                System.out.println(n1 + ", ");
            }
        }
    }
}