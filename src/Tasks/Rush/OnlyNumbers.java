package Tasks.Rush;

import java.io.*;

public class OnlyNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileInput = new BufferedReader(new FileReader(reader.readLine()));
        BufferedWriter fileOutput = new BufferedWriter(new FileWriter(reader.readLine()));
        reader.close();

        StringBuilder text = new StringBuilder();
        while (fileInput.ready()) {
            text.append(fileInput.readLine());
        }
        String[] words = text.toString().split(" ");
        for (String word : words) {
//            try {
//                int number = Integer.parseInt(word);
//                fileOutput.write(number);
//                fileOutput.write(" ");
//            } catch (NumberFormatException nfe) {
//                nfe.printStackTrace();
//            }
//            if (word.matches("-?\\d+(\\.\\d+)?")) {
            if (word.matches("\\p{Digit}")) {
                fileOutput.write(word + " ");
            }

        }
        fileInput.close();
        fileOutput.close();
    }
}
