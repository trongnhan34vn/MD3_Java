package BaiTH.Bai3_HeThongDoiTuongHinhHoc;

import java.util.Arrays;
import java.util.Comparator;

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

        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3.5);
        circles[1] = new Circle();
        circles[2] = new Circle("red", false, 3.6);

        System.out.println("Pre-sorted:");
        for (Circle circle1 : circles) {
            System.out.println(circle1);
        }


        Comparator circleComparator = new ComparableCircle();
        Arrays.sort(circles, circleComparator);


        System.out.println("After-sorted:");
        for (Circle circle1 : circles) {
            System.out.println(circle1);
        }

    }
}
