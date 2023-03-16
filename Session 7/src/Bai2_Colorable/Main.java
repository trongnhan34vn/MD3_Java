package Bai2_Colorable;

public class Main {
    public static void main(String[] args) {
        System.out.println("---SHAPE----");
        Shape shape = new Shape();
        System.out.println(shape);
        shape = new Shape("green", true);
        System.out.println(shape);

        System.out.println("---CIRCLE----");
        Circle circle = new Circle("red", true, 2.0);
        System.out.println(circle);

        System.out.println("----RECTANGLE----");
        Retangular retangular = new Retangular(3.0, 4.0, "black", false);
        System.out.println(retangular);

        System.out.println("-----SQUARE-----");
        Square square = new Square(2.0,"brown",true);
//        System.out.println(square);

        square.howToColor();

        System.out.println(square);
    }
}
