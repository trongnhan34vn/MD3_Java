package Bai1_Resizable;

public class Retangular extends Shape implements Resizable {
    @Override
    public double resize() {
        double newHeight = getHeight() * (1 + Math.random());
        double newWidth = getWidth() * (1 + Math.random());
        width = newWidth;
        height = newHeight;
        return 1 + Math.random();
    }

    private double width = 1.0;
    private double height = 1.0;
    public Retangular(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }
    public Retangular() {

    }

    public Retangular(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    @Override
    public String toString() {
        return "Retangular{" +
                "width=" + width +
                ", height=" + height +
                ", Area=" + getArea() +
                '}' + " " + super.toString();
    }
}
