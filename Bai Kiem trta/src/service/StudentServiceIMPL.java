package service;

import model.Students;

import java.util.ArrayList;
import java.util.List;

public class StudentServiceIMPL implements IStudentService{
    public static List<Students> listStudents = new ArrayList<>();
    static {
        listStudents.add(new Students(1, "Nhân", 24));
        listStudents.add(new Students(2, "Khoa",20));
        listStudents.add(new Students(3, "Nam lừa", 22));
    }
    @Override
    public List<Students> findAll() {
        return listStudents;
    }

    @Override
    public void save(Students students) {
        listStudents.add(students);
    }

    @Override
    public Students findById(int id) {
        for (int i = 0; i < listStudents.size(); i++) {
            if (listStudents.get(i).getId() == id) {
                return listStudents.get(i);
            }
        }
        return null;
    }

    @Override
    public void deleteById(int id) {
        for (int i = 0; i < listStudents.size(); i++) {
            if (listStudents.get(i).getId() == id) {
                listStudents.remove(id);
            }
        }
    }
}
