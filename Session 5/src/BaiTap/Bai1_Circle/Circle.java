package BaiTap.Bai1_Circle;

public class Circle {
    private double radius = 1.0;
    public final double PI = Math.PI;
    private String color = "red";

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {

    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return this.radius * this.PI;
    }
}
