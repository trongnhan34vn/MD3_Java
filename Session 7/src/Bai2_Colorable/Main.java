package Bai2_Colorable;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(2);
        Shape retangle = new Retangular(3,4);
        Shape square = new Square(2);
        Shape[] shapes = {circle, retangle, square};

        System.out.println("Trước khi Color: ");
        System.out.println("Hiển thị diện tích: ");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }

        System.out.println("Sau khi Color: ");
        for (Shape shape: shapes) {
            if (shape instanceof Colorable) {
                ((Colorable) shape).howToColor();
            }
        }
    }
}
