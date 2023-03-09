package BaiTH.Bai5_TimGiaTriNhoNhatTrongMang;

public class Main {
    public static void main(String[] args) {
        minArr();
    }
    //  Tìm giá trị nhỏ nhất trong mảng

    public static void minArr() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Giá trị nhỏ nhất trong mảng là: " + getMin(arr));
    }

    public static int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
