package Bai1_Resizable;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(2);
        Shape retangle = new Retangular(3,4);
        Shape square = new Square(4);
        Shape[] shapes = {circle, retangle, square};
        System.out.println("Trước khi resize: ");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }

        System.out.println("Sau khi resize: ");
        for (Shape shape : shapes) {
            if (shape instanceof Resizable) {
                ((Resizable) shape).resize();
                System.out.println(shape);
            }
        }
    }
}
