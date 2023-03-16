import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student[] listStudents = new Student[100];
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("***************STUDENT MANAGE***************************\n" +
                    "1. Show List Student.\n" +
                    "2. Create Student\n" +
                    "3. Update Student\n" +
                    "4. Delete Student\n" +
                    "5. Sort Student By Age ASC (Tăng Dần).\n" +
                    "6. Exit");
            System.out.println("Bấm lựa chọn: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    showListStudents(listStudents);
                    break;
                case 2:
                    createNewStudent(listStudents, new Scanner(System.in));
                    break;
                case 3:
                    updateStudent(listStudents, new Scanner(System.in));
                    break;
                case 4:
                    deleteStudent(listStudents, new Scanner(System.in));
                    break;
                case 5:
                    sortListStudents(listStudents, new Scanner(System.in));
                    break;
                case 6:
                    System.exit(0);
                    break;
            }
        }
    }

    public static void showListStudents(Student[] listStudents) {
        boolean isNull = true;
        System.out.println("Danh sách sinh viên: ");
        for (int i = 0; i < listStudents.length; i++) {
            if (listStudents[i] != null) {
                isNull = false;
                System.out.println(listStudents[i].toString());
            }
        }
        if (isNull) {
            System.out.println("Không có sinh viên nào trong danh sách");
        }
    }

    public static void createNewStudent(Student[] listStudents, Scanner sc) {
        System.out.println("Nhập vào id student: ");
        int studentId = sc.nextInt();
        System.out.println("Nhập vào tên student: ");
        String studentName = sc.next();
        System.out.println("Nhập vào tuổi student: ");
        int studentAge = sc.nextInt();
        Student newStudent = new Student(studentId, studentName, studentAge);
        boolean isNull = false;
        for (int i = 0; i < listStudents.length; i++) {
            if (listStudents[i] == null) {
                isNull = true;
                listStudents[i] = newStudent;
                break;
            }
        }

        if (isNull) {
            System.out.println("Thêm mới thành công");
        }
        showListStudents(listStudents);
    }

    public static void updateStudent(Student[] listStudents, Scanner sc) {
        System.out.println("Chọn Id sinh viên muốn chỉnh sửa");
        showListStudents(listStudents);
        int idUpdate = sc.nextInt();
        for (int i = 0; i < listStudents.length; i++) {
            if (listStudents[i] != null) {
                if (listStudents[i].getStudentId() == idUpdate) {
                    System.out.println("Nhập tên mới: ");
                    String studenntName = sc.next();
                    listStudents[i].setStudentName(studenntName);
                    System.out.println("Nhập tuổi mới: ");
                    int studentAge = sc.nextInt();
                    listStudents[i].setAge(studentAge);
                    System.out.println("Update thành công");
                }
            }
        }
        showListStudents(listStudents);
    }

    public static void deleteStudent(Student[] list, Scanner sc) {
        System.out.println("Chọn Id sinh viên muốn xoá: ");
        showListStudents(list);
        int delId = sc.nextInt();
        for (int i = 0; i < list.length; i++) {
            if (list[i] != null) {
                if (delId == list[i].getStudentId()) {
                    list[i] = null;
                    System.out.println("Xoá thành công!");
                }
            }
        }
        showListStudents(list);
    }

    public static void sortListStudents(Student[] list, Scanner sc) {
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (list[i] != null && list[j] != null) {
                    Student temp = null;
                    if (list[i].getAge() > list[j].getAge()) {
                        temp = list[i];
                        list[i] = list[j];
                        list[j] = temp;

                    }
                }
            }
        }
        System.out.println("Mảng được sắp xếp thành công!");
        showListStudents(list);
    }
}