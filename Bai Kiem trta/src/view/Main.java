package view;

import config.Config;

public class Main {
    public Main() {
        System.out.println("***************STUDENT MANAGE*******************");
        System.out.println("1. Show List Students");
        System.out.println("2. Create Student");
        System.out.println("3. Update Student");
        System.out.println("4. Delete Student");
        System.out.println("5. Detail Student");
        System.out.println("6. Sort By Name");
        int chooseMenu = Config.scanner().nextInt();
        switch (chooseMenu) {
            case 1:
                new StudentView().showListStudents();
                break;
            case 2:
                new StudentView().createNewStudent();
                break;
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        new Main();
    }
}