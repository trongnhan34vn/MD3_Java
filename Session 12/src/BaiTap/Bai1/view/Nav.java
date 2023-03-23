package BaiTap.Bai1.view;

import static BaiTap.Bai1.config.Config.*;

public class Nav {
    public static void main(String[] args) {
        while (true) {
            System.out.println("***************STUDENT MANAGE*******************");
            System.out.println("1. Show List Students");
            System.out.println("2. Create Student");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Detail Student");
            System.out.println("6. Sort By Name");
            int chooseMenu = Integer.parseInt(scanner.nextLine());
            if (chooseMenu != 7) {
                ProductView productView = new ProductView();
                switch (chooseMenu) {
                    case 1:
                        productView.showProduct();
                        productView.showMenu();
                        break;
                    case 2:
                        productView.createProduct();
                        productView.showMenu();
                        break;
                    case 3:
                        productView.updateProduct();
                        productView.showMenu();
                        break;
                    case 4:
                        productView.deleteProduct();
                        productView.showMenu();
                        break;
                    case 5:
                        productView.searchProduct();
                        productView.showMenu();
                        break;
                    case 6:
                        productView.sort();
                        productView.showMenu();
                        break;
                }
            } else {
                return;
            }
        }
    }
}
