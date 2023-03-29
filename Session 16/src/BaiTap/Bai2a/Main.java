package BaiTap.Bai2a;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            String line;
            String PATH_FILE = "/Users/mac/Desktop/MD3_Java/Session 16/src/BaiTap/Bai1/CSV";
            br = new BufferedReader(new FileReader(PATH_FILE));
            while ((line = br.readLine()) != null) {
                printCountry(parseCsvLine(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void printCountry(List<String> country) {
        System.out.println("------------------------------------");
        System.out.println("Country Id: " + country.get(0));
        System.out.println("Country Code: " + country.get(1));
        System.out.println("Country Name: " + country.get(2));
        System.out.println("------------------------------------");
    }

    public static List<String> parseCsvLine(String csvLine) {
        List<String> result = new ArrayList<>();
        if (csvLine != null) {
            String[] splitData = csvLine.split(",");
            result.addAll(Arrays.asList(splitData));
        }
        return result;
    }
}
