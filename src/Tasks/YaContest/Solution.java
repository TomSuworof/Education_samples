package Tasks.YaContest;

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("D:\\Programs\\IntelliJIDEA\\Education\\src\\Tasks\\YaContest\\input.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\Programs\\IntelliJIDEA\\Education\\src\\Tasks\\YaContest\\output.txt"))) {
            String numbers = reader.readLine();
            int a = Integer.parseInt(numbers.split(" ")[0]);
            int b = Integer.parseInt(numbers.split(" ")[1]);
            writer.write(String.valueOf(a + b));
        } catch (IOException io) {
            io.printStackTrace();
        }
    }
}