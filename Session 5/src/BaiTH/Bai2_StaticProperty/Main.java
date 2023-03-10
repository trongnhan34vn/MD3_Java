package BaiTH.Bai2_StaticProperty;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("VinFast", "VF6");
        System.out.println(Car.numberOfCars);

        Car car2 = new Car("VinFast", "VF8");
        System.out.println(Car.numberOfCars);

    }
}
