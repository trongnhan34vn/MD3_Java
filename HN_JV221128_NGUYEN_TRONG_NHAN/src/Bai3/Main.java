package Bai3;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Nhập vào 1 mảng gồm 50 phần tử");
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(9) + 1;
        }
        System.out.println("Mảng: " + Arrays.toString(arr));

//        Tìm min:
        System.out.println("Số nhỏ nhất của mảng: " + getMin(arr));
//        Tìm max
        System.out.println("Số lớn nhất của mảng: " + getMax(arr));
//        Sắp xếp mảng tăng dần
        Arrays.sort(arr);
        System.out.println("Mảng sau khi sắp xếp: " + Arrays.toString(arr));
//        Đếm số lần xuất hiện của các số nguyên tố trong mảng
        System.out.println("Số lần xuất hiện của các số nguyên tố trong mảng: " + countPrime(arr));
        System.out.println(checkPrimeNum(1));
//        for (int i = 0; i < 100; i++) {
//            System.out.print(i +"-");
//            System.out.println(checkPrimeNum(i));
//        }
    }

    //    Kiểm tra số nguyên tố
    public static boolean checkPrimeNum(int num) {
        if (num < 2) {
            return false;
        } else if (num > 2) {
            if (num % 2 == 0) {
                return false;
            }
            for (int i = 3; i < num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    //    Đếm số lần xuất hiện:
    public static int countPrime(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (checkPrimeNum(arr[i])) {
                System.out.println(arr[i]);
                count++;
            }
        }
        return count;
    }

    //    Tìm min
    public static int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    //    Tìm max
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
