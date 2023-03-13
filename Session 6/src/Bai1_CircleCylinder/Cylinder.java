package Bai1_CircleCylinder;

public class Cylinder extends Circle {
    public int height = 2;
    public Cylinder(int radius, String color, int height) {
        super(radius, color);
        this.height = height;
    }

    public Cylinder() {

    }

    public double getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getVolume() {
        return getArea() * this.height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                ". volume= " + getVolume() +
                ". inherate=" + super.toString() +
                '}';
    }
}
