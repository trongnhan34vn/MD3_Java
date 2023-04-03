package BaiTH.Bai2;

import java.util.Random;

import static BaiTH.Bai2.Main.*;

public class Car implements Runnable {

    private String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        int runDistance = 0;
        long startTime = System.currentTimeMillis();
        while (runDistance < DISTANCE) {
            try {
                int speed = (new Random()).nextInt(20);
                runDistance += speed;
                String log = "|";
                int percentTrave = (runDistance * 100) / DISTANCE;
                for (int i = 0; i < DISTANCE; i += STEP) {
                    if (percentTrave >= i + STEP) {
                        log += "=";
                    } else if (percentTrave >= i && percentTrave < i + STEP) {
                        log += "o";
                    } else {
                        log += "-";
                    }
                }
                log += "|";
                System.out.println("Car" + name + ": " + log + " " + Math.min(DISTANCE, runDistance) + "KM");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Car " + name + " broken...");
                break;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Car" + name + "Finish in " + (endTime - startTime) / 1000 + "s");
    }
}
