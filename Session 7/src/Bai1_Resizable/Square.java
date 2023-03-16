package Bai1_Resizable;

public class Square extends Retangular implements Resizable {
    public Square(double side) {
        super(side, side);
    }
    public Square() {

    }

    public Square(double side, String color, boolean filled ) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }
    public void setSide(double side) {
        setWidth(side);
        setHeight(side);
    }

    @Override
    public double getArea() {
        return super.getArea();
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setHeight(double height) {
        setSide(height);
    }

    @Override
    public String toString() {
        return "Square{side: " + getSide() + " " + super.toString();
    }
}
