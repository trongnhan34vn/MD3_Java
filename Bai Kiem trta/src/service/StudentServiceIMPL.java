package service;

import comparator.Comparator;
import model.Students;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
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
       boolean isExist = false;
        for (Students student: listStudents) {
            if (students.getId() == student.getId()) {
                isExist = true;
                break;
            } else {
                isExist = false;
            }
        }
        if (isExist) {
            for (Students student: listStudents) {
                if (students.getId() == student.getId()) {
                    student.setName(students.getName());
                    student.setAge(students.getAge());
                }
            }
        } else {
            listStudents.add(students);
        }
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
                listStudents.remove(listStudents.get(i));
            }
        }
    }

    public void detailById(int id) {
        for (int i = 0; i < listStudents.size(); i++) {
            if (listStudents.get(i).getId() == id) {
                System.out.println("Id: " + listStudents.get(i).getId() + "\n" +
                        "Name: " + listStudents.get(i).getName() + "\n" +"" +
                        "Age: " + listStudents.get(i).getAge());
            }
        }
    }

    public List<Students> sortByName() {
        List<Students> sortList = new ArrayList<Students>(listStudents);
        Comparator comparator = new Comparator();
        Collections.sort(sortList, comparator);
        return sortList;
    }
}
