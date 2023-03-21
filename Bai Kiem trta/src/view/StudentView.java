package view;

import config.Config;
import controller.StudentController;
import model.Students;

import java.util.List;

public class StudentView {
    StudentController studentController = new StudentController();
    List<Students> listStudents = studentController.showListStudents();

    public void showListStudents() {
        System.out.println("---ID---Name---Age---");
        for (Students student : listStudents) {
            System.out.println("   " + student.getId() + "   " + student.getName() + "   " + student.getAge());
        }
    }

    public void createNewStudent() {
        int id;
        System.out.println("Nhập vào tên sinh viên mới: ");
        String name = Config.scanner().nextLine();
        System.out.println("Nhập vào tuổi sinh viên mới: ");
        int age = Config.scanner().nextInt();
        if (listStudents.size() == 0) {
            id = 1;
        } else {
            id = listStudents.get(listStudents.size() - 1).getId() + 1;
        }
        Students newStudent = new Students(id, name, age);
        studentController.createStudent(newStudent);
        resetMenu();
    }

    public void updateStudent() {
        while (true) {
            System.out.println("Nhập vào Id muốn sửa: ");
            int idUpdate = Config.scanner().nextInt();
            if (findById(idUpdate)) {
                System.out.println("Nhập vào tên muốn sửa: ");
                String name = Config.scanner().nextLine();
                System.out.println("Nhập vào tuổi muốn sửa: ");
                int age = Config.scanner().nextInt();
                Students updateStudent = new Students(idUpdate, name, age);
                studentController.updateStudent(updateStudent);
                resetMenu();
                return;
            } else {
                System.out.println("Id không tồn tại! Nhập lại đi!");
            }
        }
    }

    public void deleteStudent() {
        System.out.println("Nhập vào id muốn xoá: ");
        int idDel = Config.scanner().nextInt();
        if (findById(idDel)) {
            studentController.deleteStudent(idDel);
            resetMenu();
        } else {
            System.out.println("ID không tồn tại! Nhập lại đi!");
        }
    }

    public void detailStudent() {
        System.out.println("Nhập vào id để xem chi tiết sinh viên: ");
        int idDetail = Config.scanner().nextInt();
        if (findById(idDetail)) {
            studentController.detailStudent(idDetail);
            resetMenu();
        } else {
            System.out.println("ID không tồn tại! Nhập lại đi!");
        }
    }
    public boolean findById(int id) {
        for (Students st : listStudents){
            if (st.getId() == id) {
                return true;
            }
        }
        return false;
    }

    public void sort() {
        List<Students> listSort = studentController.sortStudents();
        System.out.println("Sắp xếp mảng mới: ");
        System.out.println("---ID---Name---Age---");
        for (Students student : listSort) {
            System.out.println("   " + student.getId() + "   " + student.getName() + "   " + student.getAge());
        }
        resetMenu();
    }
    public void resetMenu() {
        System.out.println("Enter the quit to comeback to menu!");
        String quit = Config.scanner().nextLine();
        while (true) {
            if (quit.equalsIgnoreCase("quit")) {
                new Main();
                return;
            } else {
                System.out.println("Enter the quit to comeback to menu!");
                quit = Config.scanner().nextLine();
            }
        }
    }
}
