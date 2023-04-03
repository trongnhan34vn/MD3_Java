package guitarplus.design;

import java.util.List;

public interface IController<T, E> {
    boolean create(T t);
    boolean update(T t);
    boolean delete(E id);
    List<T> findAll();
    List<T> readFromFile();
    boolean writeToFile(List<T> list);
    T inputData();
    void displayData();
}
