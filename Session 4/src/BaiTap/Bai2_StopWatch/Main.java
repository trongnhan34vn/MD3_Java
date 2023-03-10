package BaiTap.Bai2_StopWatch;

import BaiTap.Bai2_StopWatch.StopWatch;

public class Main {
    public static void main(String[] args) {
        StopWatch sw = new StopWatch();
        int mount = 100000;
        sw.start();
        System.out.println("Thời gian bắt đầu: " + sw.getStartTime());
        sw.stop();
        System.out.println("Thời gian kết thúc: " + sw.getEndTime());
        System.out.println("Thời gian đã trôi qua: " + sw.getElapsedTime());
    }
}
