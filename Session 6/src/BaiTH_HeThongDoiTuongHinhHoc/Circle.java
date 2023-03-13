package BaiTH_HeThongDoiTuongHinhHoc;

public class Circle extends Shape {

    private final double PI = Math.PI;
    public double radius = 1.0;

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }
    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return this.radius * PI;
    }

    public double getPerimeter() {
        return this.radius * 2 * PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "PI=" + PI +
                ", radius=" + radius +
                '}' + super.toString() ;
    }
}
