package BaiTap.Bai2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = new Integer[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(20);
        }
        ;
        Collections.sort(Arrays.asList(arr), new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });

        System.out.println(Arrays.toString(arr));

        System.out.println(binarySearch(arr,0,arr.length -1, 10));
    }

    public static int binarySearch(Integer[] arr, Integer left, Integer right, Integer value) {
        int mid = (left + right) / 2;
        if(right >= left) {
            if (arr[mid].equals(value)) {
                return mid;
            } else if (arr[mid] < value) {
                return binarySearch(arr, mid + 1, right, value);
            } else {
                return binarySearch(arr, left, mid - 1, value);
            }
        }
        return -1;
    }
}
