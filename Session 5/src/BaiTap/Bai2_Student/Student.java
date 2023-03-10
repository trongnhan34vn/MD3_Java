package BaiTap.Bai2_Student;

public class Student {
    private String name = "John";
    private String classes = "C02";

    public Student() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public void display () {
        System.out.println("Thông tin sinh viên: 1. Tên: " + this.name + ". 2. Lớp: " + this.classes);
    }
}
