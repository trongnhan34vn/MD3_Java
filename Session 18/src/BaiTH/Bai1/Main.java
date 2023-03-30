package BaiTH.Bai1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main thread running ....");

        RunnableDemo runnableDemo1 = new RunnableDemo("Thread-1-HR-database");
        runnableDemo1.start();

        RunnableDemo runnableDemo2 = new RunnableDemo("Thread-2-send-email");
        runnableDemo2.start();

        System.out.println("Main thread stopped!");
    }
}
