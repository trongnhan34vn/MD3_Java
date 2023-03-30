package BaiTH.Bai1;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter source file: ");
        String sourcePath = scanner.next();
        System.out.println("Enter the destination: ");
        String destPath = scanner.next();
        File sourceFile = new File(sourcePath);
        File destFile = new File(destPath);
        try {
//            copyFileUsingJava7Files(sourceFile,destFile);
            copyFileUsingStream(sourceFile,destFile);
            System.out.println("copy complete!");
        } catch (IOException e) {
            System.out.printf("Can't copy that file");
            System.out.printf(e.getMessage());
        }
    }
    private static void copyFileUsingJava7Files(File source, File dest) throws IOException {
        Files.copy(source.toPath(),dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }

    private static void copyFileUsingStream(File source, File dest) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer,0,length);
            }
        } finally {
            is.close();
            os.close();
        }
    }
}