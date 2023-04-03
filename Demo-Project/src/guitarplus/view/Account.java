package guitarplus.view;

import guitarplus.entity.User;
import guitarplus.impl.UsersImpl;

import java.util.ArrayList;
import java.util.List;

import static guitarplus.config.Config.scanner;

public class Account {
    UsersImpl usersImpl = new UsersImpl();
    List<User> listUsers = new ArrayList<>();

    public void accountMenu() {
        System.out.println("---------------- Account ---------------");
        System.out.println("1. Sign in");
        System.out.println("2. Register");
        System.out.println("3. Exit");
        System.out.println("---------------- Account ---------------");
        System.out.println("Nhập vào lựa chọn của bạn: ");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
//                Login
                login();
                break;
            case 2:
//                Đăng kí
                register();
                break;
        }
    }

    public void register() {
        System.out.println("---------------- Register -----------------");
        User newUser = usersImpl.inputData();
        boolean regisSucess = usersImpl.create(newUser);
        if (regisSucess) {
            System.out.println("Đăng kí thành công");
        } else {
            System.out.println("Đăng kí thất bại");
        }
    }

    public void login() {
        while (true) {
            System.out.println("--------------------- Login ---------------------");
            System.out.println("Nhập username: ");
            String userName = scanner.nextLine();
            System.out.println("Nhập mật khẩu: ");
            String password = scanner.nextLine();
            User checkLogin = usersImpl.checkLogin(userName, password);
            if (checkLogin != null) {
                System.out.println("Đăng nhập thành công");
                if (checkLogin.isPermission()) {
//                Tài khoản admin
                    break;
                } else {
//                Tài khoản user
                    break;
                }
            } else {
                System.err.println("Đăng nhập thất bại");
                System.out.println("1. Đăng nhập lại");
                System.out.println("2. Đăng kí");
                System.out.println("3. Thoát");
                System.out.println("Nhập lựa chọn: ");
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 2:
                        register();
                        break;
                    case 3:
                        break;
                }
            }
        }
    }
}
