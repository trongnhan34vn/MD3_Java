

public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> arrayList = new MyArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        System.out.println(arrayList);
        arrayList.add(4, 6);
        System.out.println(arrayList);
        System.out.println(arrayList.indexOf(7));
    }
}