package BaiTap.Bai1_Circle;

public class Main {
    public static void main(String[] args) {
        System.out.println("Không truyền bán kính");
        Circle circle = new Circle();
        System.out.println("Bán kính hình tròn: " + circle.getRadius());
        System.out.println("Diện tích hình tròn: " + circle.getArea());
        System.out.println("Truyền bán kính");
        Circle circle1 = new Circle(3.0);
        System.out.println("Bán kính hình tròn: " + circle1.getRadius());
        System.out.println("Diện tích hình tròn: " + circle1.getArea());
    }
}
