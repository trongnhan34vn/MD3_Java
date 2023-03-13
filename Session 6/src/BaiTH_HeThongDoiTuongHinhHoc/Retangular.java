package BaiTH_HeThongDoiTuongHinhHoc;

public class Retangular extends Shape {
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
                '}' + super.toString();
    }
}
