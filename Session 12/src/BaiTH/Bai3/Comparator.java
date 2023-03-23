package BaiTH.Bai3;

public class Comparator implements java.util.Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        int temp = o1.getAge() - o2.getAge();
        if (temp > 0) {
            return 1;
        } else if (temp == 0) {
            return 0;
        } else {
            return -1;
        }
    }
}
