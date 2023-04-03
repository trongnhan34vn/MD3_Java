import java.io.CharArrayReader;
import java.util.Arrays;

public class Main {
    static class PrintNum implements Runnable {
        private int lastNum;

        public PrintNum(int lastNum) {
            this.lastNum = lastNum;
        }

        @Override
        public void run() {
            for (int i = 0; i < lastNum; i++) {
                System.out.println(" " + i);
            }
        }
    }

    static class PrintChar implements Runnable {
        private char charToPrint;
        private int times;

        public PrintChar(char charToPrint, int times) {
            this.charToPrint = charToPrint;
            this.times = times;
        }

        @Override
        public void run() {
            for (int i = 0; i < times; i++) {
                System.out.println(charToPrint);
            }
        }
    }
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
        Runnable r = new MyRunable();
        Thread thObj = new Thread(r);
        thObj.start();

        //Create task

        Runnable printA = new PrintChar('a', 100);
        Runnable printB = new PrintChar('b', 100);
        Runnable print100 = new PrintNum(100);

        //Create Thread

        Thread thread1 = new Thread(printA);
        Thread thread2 = new Thread(printB);
        Thread thread3 = new Thread(print100);

        //Start Thread

        thread1.start();
        thread2.start();
        thread3.start();
    }
}