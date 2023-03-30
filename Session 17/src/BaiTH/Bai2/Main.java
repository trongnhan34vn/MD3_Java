package BaiTH.Bai2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
//        students.add(new Student(1, "Trịnh Đức Toàn", "Hà Nội"));
//        students.add(new Student(2, "Lê Việt Dũng", "Phú Thọ"));
//        students.add(new Student(3, "Phùng Trung Dũng", "Đà Nẵng"));
//        students.add(new Student(4, "Nguyễn Khánh Tùng", "Hà Nội"));
//        students.add(new Student(5, "Nguyễn Đồng Chính", "Hải Dương"));
//        writeToFile("students.txt", students);
        students = readFile("students.txt");
        for (Student student:students) {
            System.out.println(student);
        }
    }
    private static void writeToFile(String path, List<Student> students) {
        File file = new File(path);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(students);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static List<Student> readFile(String path) {
        File file = new File(path);
        if (!file.exists()) {
            return new ArrayList<>();
        }
        List<Student> students = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            students = (List<Student>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return students;
    }
}
