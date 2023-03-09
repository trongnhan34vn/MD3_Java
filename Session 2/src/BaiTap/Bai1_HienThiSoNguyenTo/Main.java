package BaiTap.Bai1_HienThiSoNguyenTo;

public class Main {
    public static void main(String[] args) {
        getPrime();
    }
    public static void getPrime() {
        System.out.println("Hiển thị 20 số nguyên tố đầu tiên");
        int number = 20;
        int count = 0;
        int N = 2;
        boolean isPrime = false;
        while (count < number) {
            if (N < 2) {
                isPrime = false;
            }
            if (N == 2) {
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
                System.out.println(N);
                count++;
            }
            N++;
        }
    }
}
