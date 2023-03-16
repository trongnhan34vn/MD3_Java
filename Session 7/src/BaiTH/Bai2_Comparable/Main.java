package BaiTH.Bai2_Comparable;

import java.util.Arrays;

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
        System.out.println(square);

        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0]= new ComparableCircle(3.6);
        circles[1] = new ComparableCircle();
        circles[2] = new ComparableCircle("red", true, 3.5);

        System.out.println("Pre-sort: ");
        for (ComparableCircle comparableCircle: circles
             ) {
            System.out.println(comparableCircle);
        }

        Arrays.sort(circles);

        System.out.println("After-sort: ");
        for (ComparableCircle comparableCircle: circles
        ) {
            System.out.println(comparableCircle);
        }

    }
}
