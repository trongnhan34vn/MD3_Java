package BaiTap.Bai7;

import java.util.Comparator;
import java.util.Date;

public class Compare implements Comparator<Staff> {

    @Override
    public int compare(Staff o1, Staff o2) {
         int compare = o1.getBirthday().compareTo(o2.getBirthday());
         if (compare != 0) {
             return compare;
         }
         return compare;
    }
}
