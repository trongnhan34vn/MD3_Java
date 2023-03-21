package service;

import model.Students;

import java.util.List;

public interface IStudentService {
    List<Students> findAll();
    void save(Students students);
    Students findById(int id);
    void deleteById(int id);

    void detailById(int id);
    List<Students> sortByName();
}
