package guitarplus.view;

import static guitarplus.config.Config.scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("------------------ GUITAR PLUS ------------------");
        System.out.println("1. Danh sách sản phẩm");
        System.out.println("2, Thêm vào giỏ hàng");
        System.out.println("3. Thông tin tài khoản");
        System.out.println("4. Liên hệ");
        System.out.println("5. Tài khoản");
        System.out.println("------------------ GUITAR PLUS ------------------");
        System.out.println("Nhập vào lựa chọn của bạn: ");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                new Account().accountMenu();
                break;
        }
    }

}