package BaiTap.Bai1;

public class Main {
    public static void main(String[] args) {
        NumberGenerator numberGenerator = new NumberGenerator();
        try {
            while (numberGenerator.getMyThread().isAlive()) {
                System.out.println("Main thread will be alive till the child thread is live!");
                Thread.sleep(1500);
            }
        } catch (InterruptedException e) {
            System.err.println("main thread is interrupted");
        }
        System.out.println("main thread run is over");
    }
}
