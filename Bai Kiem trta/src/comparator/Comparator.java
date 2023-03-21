package comparator;

import model.Students;

public class Comparator implements java.util.Comparator<Students> {
    @Override
    public int compare(Students s1, Students s2) {
        int temp = s1.getName().compareTo(s2.getName());
        if (temp != 0) {
            return temp;
        }
        return temp;
    }
}
