package controller;

import model.Students;
import service.IStudentService;
import service.StudentServiceIMPL;

import java.util.List;
public class StudentController {
    IStudentService studentService = new StudentServiceIMPL();
    public List<Students> showListStudents() {
        return studentService.findAll();
    }

    public void createStudent(Students student) {
        studentService.save(student);
    }
}
