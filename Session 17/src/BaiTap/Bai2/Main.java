package BaiTap.Bai2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class Main {
    public static void main(String[] args) {
        String SOURCE = "src/BaiTap/Bai1/productFile.txt";
        String DEST = "src/BaiTap/Bai2/productFileCopy.txt";
        File source = new File(SOURCE);
        File dest = new File(DEST);
        try {
            copyFileUsingJava7Files(source,dest);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private static void copyFileUsingJava7Files(File source, File dest) throws IOException {
        Files.copy(source.toPath(),dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }
}
