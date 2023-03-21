package view;

import config.Config;
import controller.StudentController;
import model.Students;

import java.util.List;

public class StudentView {
    StudentController studentController = new StudentController();
    List<Students> listStudents =  studentController.showListStudents();

    public void showListStudents() {
        System.out.println("---ID---Name---Age---");
        for (Students student: listStudents) {
            System.out.println("   " + student.getId() + "   " + student.getName() + "   " + student.getAge());
        }
        System.out.println("Enter the quit to comeback to menu!");
        String quit = Config.scanner().nextLine();
        if (quit.equalsIgnoreCase("quit")) {
            new Main();
        }
    }

    public void createNewStudent() {
        int id;
        String name = Config.scanner().nextLine();
        int age = Config.scanner().nextInt();
        if (listStudents.size() == 0) {
            id = 1;
        } else {
            id = listStudents.get(listStudents.size() - 1).getId() + 1;
        }
        Students newStudent = new Students(id, name, age);
        studentController.createStudent(newStudent);
    }
}
