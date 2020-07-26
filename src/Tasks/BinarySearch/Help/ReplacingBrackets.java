package Tasks.BinarySearch.Help;

import java.io.*;

public class ReplacingBrackets {
    public static void main(String[] args) {
        String allText = "";

        try (BufferedReader reader = new BufferedReader(new FileReader("D:\\Programs\\IntelliJIDEA\\Education\\src\\Tasks\\BinarySearch\\Help\\text.txt"))) {
            while(reader.ready()) {
                allText += reader.readLine();
            }
            allText = allText.replaceAll("\\[", "{");
            allText = allText.replaceAll("]", "}");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\Programs\\IntelliJIDEA\\Education\\src\\Tasks\\BinarySearch\\Help\\text.txt", false))) {
            writer.write(allText);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
