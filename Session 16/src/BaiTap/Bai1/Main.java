package BaiTap.Bai1;

import java.io.*;
import java.util.*;

public class Main {
    public static class ReadAndWriteFile {
       public Queue<String> readFile() {
           Queue<String> listStrings= new LinkedList<>();
           try {
               File file = new File("listCopy.txt");
               FileInputStream fis = new FileInputStream((file));
               ObjectInputStream ois = new ObjectInputStream(fis);
               listStrings = (Queue<String>) ois.readObject();
           } catch (Exception e) {
               System.err.println("File không tồn tại / lỗi nội dung");
           }
           return listStrings;
       }

       public void writeFile(Queue<String> list) throws IOException {
           File file = new File("list.txt");
           if (!file.exists()) {
               file.createNewFile();
           }
           FileOutputStream fos = new FileOutputStream(file);
           ObjectOutputStream oos = new ObjectOutputStream(fos);
           oos.writeObject(list);
       }
    }
    public static Scanner scanner = new Scanner(System.in);
    public static Queue<String> listStrings;

    public static void main(String[] args) throws IOException {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        listStrings = readAndWriteFile.readFile();

        while (true) {
            System.out.println("1. Nhập vào chuỗi lưu vào file.");
            System.out.println("2. Hiển thị danh sách các chuỗi.");
            System.out.println("3. Xoá chuỗi");
            System.out.println("4. Kết thúc chương trình!");
            System.out.println("Nhập vào lựa chọn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    createNewString(listStrings);
                    break;
                case 2:
                    displayList(listStrings);
                    break;
                case 3:
                    deleteString(listStrings);
                    break;
                case 4:
                    readAndWriteFile.writeFile(listStrings);
                    copyFile("list.txt", "listCopy.txt");
                    System.exit(0);
                    break;
            }
        }
    }
    public static void createNewString(Queue<String> listStrings) {
        System.out.println("Nhập vào chuỗi cần thêm: ");
        String newContent = scanner.nextLine();
        listStrings.add(newContent);
        System.out.println("Đã thêm thành công!");
    }

    public static void displayList(Queue<String> listStrings) {
        System.out.println("---------Danh sách chuỗi------------");
        for (String string: listStrings) {
            System.out.println(string);
        }
        System.out.println("--------------KÊT THÚC--------------");
    }

    public static void deleteString(Queue<String> listStrings) {
        System.out.println("Bạn vừa xoá thành công: " + listStrings.poll());
    }

    public static void copyFile(String sourceURL, String targetURL) throws IOException {
        File source = new File(sourceURL);
        File target = new File(targetURL);
        FileInputStream is = null;
        FileOutputStream os = null;

        if (!target.exists()) {
            target.createNewFile();
        }
        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(target);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        } finally {
            is.close();
            os.close();
        }
    }
}
