package BaiTH.Bai2_Comparable;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {
    @Override
    public int compareTo(ComparableCircle o) {
        if (getRadius() > o.getRadius()) {
            return 1;
        } else if (getRadius() < o.getRadius()) {
            return -1;
        } else return 1;
    }

    public ComparableCircle(String color, boolean filled, double radius) {
        super(color, filled, radius);
    }

    public ComparableCircle() {
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

}
