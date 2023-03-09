package BaiTap.Bai1_XoaPhanTuKhoiMang;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        delElementTaDao();
        delElement();
    }

    public static void delElementTaDao() {
        System.out.println("Xoá phần tử khỏi mảng");
        int[] arr = {4, 7, 67, 55, 10, 8, 98};
        System.out.println("Mảng ban đầu " + arr);
        Scanner sc = new Scanner(System.in);
        int delNum = sc.nextInt();
        int[] newArr = new int[arr.length - 1];
        for (int i = 0, k = 0; i < arr.length; i++) {
            if (arr[i] == delNum) {
                continue;
            }
            newArr[k++] = arr[i];
        }
        System.out.println(Arrays.toString(newArr));
    }

    public static void delElement() {
        System.out.println("Xoá phần tử khỏi mảng");
        int[] arr = {4, 7, 67, 55, 10, 8, 98};
        System.out.println("Mảng ban đầu " + Arrays.toString(arr));
        System.out.println("Nhập vào số cần xoá");
        Scanner sc = new Scanner(System.in);
        int delNum = sc.nextInt();
//       Xoá phần tử
        System.out.println("Mảng mới sau khi xoá" + Arrays.toString(getDelArr(arr, delNum)));
    }

    public static int[] getDelArr(int[] arr, int delNum) {
        int[] newArr = new int[arr.length - 1];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (delNum == arr[i]) {
                continue;
            }
            newArr[j] = arr[i];
            j++;
        }
        return newArr;
    }
}
