package BaiTH.Bai1_StaticMethod;

public class Student {
    private int rollNo;
    private String name;
    private static String college ="RMIT";

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    static void change() {
        college = "RIKKEI ACADEMY";
    }

    void display() {
        System.out.println(rollNo + " " + name + " " + college);
    }
}
