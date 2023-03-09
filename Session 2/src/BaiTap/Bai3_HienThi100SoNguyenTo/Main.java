package BaiTap.Bai3_HienThi100SoNguyenTo;

public class Main {
    public static void main(String[] args) {
    getPrimeLess();
    }
    public static void getPrimeLess() {
        System.out.println("Hiển thị số nguyên tố nhỏ hơn 100");
        int N = 2;
        boolean isPrime = false;
        while (N < 100) {
            if (N==2) {
                isPrime = true;
            }
            for (int i = 2; i < N; i++) {
                if (N % i != 0) {
                    isPrime = true;
                } else {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(N + "-");
            }
            N++;
        }
    }
}
