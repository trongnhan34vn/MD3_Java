package Bai2_Pointer2D_3D;

public class Main {
    public static void main(String[] args) {
        Pointer2D pointer2D = new Pointer2D(2, 4);
        System.out.println(pointer2D);
        Pointer3D pointer3D = new Pointer3D(2, 4, 5);
        pointer3D.setXYZ(3,4,5);
        pointer2D.getXY();
        System.out.println(pointer2D);
        System.out.println(pointer3D);
    }
}
