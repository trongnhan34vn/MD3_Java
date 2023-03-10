package Bai3_Fan;

import BaiTap.Bai3_Fan.Fan;

public class Main {
    public static void main(String[] args) {
//        Fan 1
        Fan fan1 = new Fan();
        fan1.setOn(true);
        fan1.setSpeed(3);
        fan1.setColor("yellow");
        fan1.setRadius(10);
        System.out.println("Trạng thái fan1: " + fan1.toString());
//        Fan 2
        Fan fan2 = new Fan();
        fan2.setOn(false);
        fan2.setSpeed(1);
        fan2.setColor("blue");
        fan2.setRadius(5);
        System.out.println("Trạng thái fan2: " + fan2.toString());
    }
}
