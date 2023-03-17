package navbar;

import model.Student;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Navbar {
    public static void main(String[] args) {
        Student[] studentArr = new Student[3];
        studentArr[0] = new Student(1, "Nguyễn Văn A", 20);
        studentArr[1] = new Student(2, "Nguyễn Thị B", 27);
        studentArr[2] = new Student(3, "Nguyễn Thị C", 25);
        int input = 0;
        while (input != 6) {
            Scanner sc = new Scanner(System.in);
            System.out.println("***************STUDENT MANAGE***************************");
            System.out.println("1. Show List Student.");
            System.out.println("2. Create Student");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Sort Student By Age ASC (Tăng Dần).");
            System.out.println("6. Exit");
            input = sc.nextInt();
            switch (input) {
                case 1:
                    System.out.println("List Students: " + Arrays.toString(studentArr));

                    break;
                case 2:
                    System.out.println("Nhập vào thông tin sinh viên: ");
                    System.out.println("Nhập vào id sinh viên: ");
                    int studentId = sc.nextInt();
                    System.out.println("Nhập vào tên sinh viên: ");
                    String studentName = sc.next();
                    System.out.println("Nhập vào tuổi sinh viên: ");
                    int studentAge = sc.nextInt();
                    Student newStudent = new Student(studentId, studentName, studentAge);
                    System.out.println("Học sinh vừa thêm mới: " + newStudent);
                    studentArr = newStudentArr(newStudent, studentArr);
                    break;
                case 3:
                    System.out.println(Arrays.toString(studentArr));
                    System.out.println("Lựa chọn id student muốn sửa: ");
                    int updateId = sc.nextInt();
                    studentArr = updateStudent(updateId, studentArr);
                    break;
                case 4:
                    System.out.println(Arrays.toString(studentArr));
                    System.out.println("Lựa chọn id student muốn xoá: ");
                    int deleteId = sc.nextInt();
                    studentArr = deleteStudent(deleteId, studentArr);
                    break;
                case 5:
                    studentArr = sortArrStudent(studentArr);
                    break;
                case 6:
                    System.exit(0);
                default:
                    break;
            }
        }
    }

    public static Student[] newStudentArr(Student newStudent, Student[] studentArr) {
        Student[] newArr = new Student[studentArr.length + 1];
        int j = 0;
        newArr[newArr.length - 1] = newStudent;
        for (int i = 0; i < studentArr.length; i++) {
            newArr[j] = studentArr[i];
            j++;
        }
        return newArr;
    }

    public static Student[] deleteStudent(int delId, Student[] studentArr) {
        Student[] newArr = new Student[studentArr.length - 1];
        int j = 0;
        for (int i = 0; i < studentArr.length; i++) {
            if (studentArr[i].getStudentId() == delId) {
                continue;
            }
            newArr[j] = studentArr[i];
            j++;
        }
        return newArr;
    }

    public static Student[] updateStudent(int updateId, Student[] arr) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getStudentId() == updateId) {
                System.out.println("Nhập vào tên mới: ");
                String name = sc.nextLine();
                arr[i].setStudentName(name);
                System.out.println("Nhập vào tuổi mới");
                int age = Integer.parseInt(sc.nextLine());
                arr[i].setAge(age);
            }
        }
        System.out.println("Update successfully");
        return arr;
    }

    public static Student[] sortArrStudent(Student[] arr) {
        Student temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].getAge() > arr[j].getAge()) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println("Đã sắp xếp thành công!");
        return arr;
    }
}
