package BaiTH.Bai1_AnimalInterface;

import BaiTH.Bai1_AnimalInterface.animals.Animal;
import BaiTH.Bai1_AnimalInterface.animals.Chicken;
import BaiTH.Bai1_AnimalInterface.animals.Tiger;
import BaiTH.Bai1_AnimalInterface.edible.IEdible;
import BaiTH.Bai1_AnimalInterface.fruit.Apple;
import BaiTH.Bai1_AnimalInterface.fruit.Fruit;
import BaiTH.Bai1_AnimalInterface.fruit.Orange;

public class Main {
    public static void main(String[] args) {
//        Khởi tạo mảng 2 phần tử có mối liên hệ vs Animal, từ class Animal
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());
            if (animal instanceof Chicken) { //Toán tử instanceof được sử dụng để kiểm tra 1 đối tượng có phải là thể hiện của 1 kiểu dữ liệu cụ thể ko?
                // so sánh thể hiện với kiểu dữ liệu
                // đối tượng animal có liên quan đến Chicken
                IEdible edible = (Chicken) animal;
                System.out.println(edible.howToEat());
            }
        }

//        Khởi tạo mảng 2 phần tử Orange và Apple từ Animal
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Apple();
        fruits[1] = new Orange();
        for (Fruit fruit: fruits
             ) {
            System.out.println(fruit.howToEat());
        }
    }
}
