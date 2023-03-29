package BaiTH.Bai2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static class ReadAndWriteFile {
        public List<Integer> readFile(String filePath) {
            List<Integer> numbers = new ArrayList<>();
            try {
                File file = new File(filePath);
                if (!file.exists()) {
                    throw new FileNotFoundException();
                }

                BufferedReader br = new BufferedReader(new FileReader(file));
                String line = "";
                while ((line = br.readLine()) !=null ) {
                    numbers.add(Integer.parseInt(line));
                }
                br.close();
            }catch (Exception e) {
                e.printStackTrace();
            }
            return numbers;
        }

        public void writeFile(String filePath,int max) {
            try {
                FileWriter writer = new FileWriter(filePath, true);
                BufferedWriter bufferedWriter = new BufferedWriter(writer);
                bufferedWriter.write("Giá trị lớn nhất: " + max);
                bufferedWriter.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static int findMax(List<Integer> numbers) {
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > max) {
                max = numbers.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        String PATH_READ = "/Users/mac/Desktop/MD3_Java/Session 16/src/BaiTH/Bai2/READ";
        String PATH_WRITE = "/Users/mac/Desktop/MD3_Java/Session 16/src/BaiTH/Bai2/WRITE";
        List<Integer> numbers = readAndWriteFile.readFile(PATH_READ);
        int maxValue = findMax(numbers);
        readAndWriteFile.writeFile(PATH_WRITE, maxValue);
        System.out.println("Ghi file thành công!");
    }
}
