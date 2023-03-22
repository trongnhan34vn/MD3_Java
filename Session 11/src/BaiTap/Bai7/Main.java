package BaiTap.Bai7;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Staff> staffList = new ArrayList<>();
        staffList.add(new Staff("Hùng", true, new Date(1999, 2, 12)));
        staffList.add(new Staff("Khoa", true, new Date(2000, 5, 24)));
        staffList.add(new Staff("Nam", true, new Date(1997, 10, 20)));

        staffList.add(new Staff("Nũ1", false, new Date(2000, 7, 12)));
        staffList.add(new Staff("Nũ2", false, new Date(1999, 5, 30)));
        staffList.add(new Staff("Nũ3", false, new Date(2001, 4, 12)));

        Compare compare = new Compare();
        Collections.sort(staffList, compare);

        Queue<Staff> queueNam = new LinkedList<>();
        Queue<Staff> queueNu = new LinkedList<>();

        for (Staff staff: staffList) {
            if (staff.isGender()) {
                queueNam.add(staff);
            } else {
                queueNu.add(staff);
            }
        }

        List<Staff> output = new ArrayList<>();
        while (!queueNu.isEmpty()) {
            output.add(queueNu.poll());
        }

        while (!queueNam.isEmpty()) {
            output.add(queueNam.poll());
        }
        System.out.println(output);
    }
}
