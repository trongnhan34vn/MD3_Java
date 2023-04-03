package BaiTap.Bai1;

import java.io.*;

public class Chuabai {
    static final String TARGET = "src/BaiTap/Bai1/target";
    static final String SOURCE = "src/BaiTap/Bai1/source";
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader(SOURCE);
            FileWriter fileWriter = new FileWriter(TARGET);
            BufferedReader br = new BufferedReader(fileReader);
            BufferedWriter bw = new BufferedWriter(fileWriter);
            String line;
            while ((line = br.readLine())!= null) {
                bw.write(line);
                bw.newLine();
            }
            br.close();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
