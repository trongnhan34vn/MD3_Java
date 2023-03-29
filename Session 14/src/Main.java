import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(10);
        }
        System.out.println(Arrays.toString(arr));


        insertionSort(arr);
//        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertionSort(int[] arr) {
        int pos, x;
        for (int i = 1; i < arr.length; i++) {
            System.out.println("i ------------>" + i);
            x = arr[i];
            pos = i;
            System.out.println("x --------> " + x);
            System.out.println("pos pre-while ---------> " + pos);
            System.out.println("1 -----> " + Arrays.toString(arr));
            while (pos > 0 && x < arr[pos - 1]) {
                System.out.println("arr[pos - 1] --------> "+ arr[pos - 1]);
                arr[pos] = arr[pos - 1];
                System.out.println("2 -----> " + Arrays.toString(arr));
                pos--;
                System.out.println("3 -----> " + Arrays.toString(arr));
                System.out.println("arr[pos] --------> " + arr[pos]);
                System.out.println("pos in-while ---------> " + pos);
            }
            arr[pos] = x;
            System.out.println("4 -----> " + Arrays.toString(arr));
            System.out.println("----------HẾT VÒNG------------");
        }
    }

//    public static void selectionSort(int[] arr) {
//        int minIndex, min;
//        for (int i = 0; i < arr.length - 1; i++) {
//            minIndex = i;
//            min = arr[i];
////            Tìm phần tử nhỏ nhất trong mảng
//            for (int j = i + 1; j < arr.length; j++) {
//                if (min > arr[j]) {
//                    min = arr[j];
//                    minIndex = j;
//                }
////                Đổi chỗ phần tử nhỏ nhất lên đầu
//            }
////            swap(arr[minIndex], arr[i]);
//            if (minIndex != i) {
//                arr[minIndex] = arr[i];
//                arr[i] = min;
//            }
//        }
//    }
}