package BaiTap.Bai2_Student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("Kết quả ban đầu: ");
        student.display();
        System.out.println("Kết quả sau khi test: ");
        student.setName("Khoa Pug");
        student.setClasses("JV11");
        student.display();
    }
}
