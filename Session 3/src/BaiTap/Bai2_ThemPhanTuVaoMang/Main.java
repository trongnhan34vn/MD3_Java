package BaiTap.Bai2_ThemPhanTuVaoMang;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    appCreateElement();
    }
    public static void appCreateElement() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Mảng ban đầu: " + Arrays.toString(arr));
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào vị trí muốn thêm: ");
        int indexCreate = sc.nextInt();
        System.out.println("Nhập vào giá trị muốn thêm: ");
        int valueCreate = sc.nextInt();
        while (true) {
            if (indexCreate < 0 || indexCreate > arr.length) {
                System.out.println("Nhập lại đi!");
                System.out.println("Nhập vào vị trí muốn thêm: ");
                indexCreate = sc.nextInt();
                System.out.println("Nhập vào giá trị muốn thêm: ");
                valueCreate = sc.nextInt();
            } else {
                System.out.println("Mảng mới là: " + Arrays.toString(createElement(indexCreate, valueCreate, arr)));
                return;
            }
        }
    }

    public static int[] createElement(int indexCreate, int valueCreate, int[] arr) {
        int[] newArr = new int[arr.length + 1];
        int j = 0;
        for (int i = 0; i < newArr.length; i++) {
            if (indexCreate == i) {
                //vị trí muốn thêm trong mảng
                newArr[i] = valueCreate;
            } else {
                //Các vị trí còn lại
                // Giả sử thêm vào index = 3; các vị trí trước i=3 sẽ giống mảng ban đầu
                // Khi i=3 thì j=3 => nhưng khi i=3 rơi vào if => else ko chạy
                // Vòng tiếp theo i=4 và j=3
                newArr[i] = arr[j];
                j++;
            }
        }
        return newArr;
    }
}
