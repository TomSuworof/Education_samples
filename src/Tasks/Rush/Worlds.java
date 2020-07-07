package Tasks.Rush;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Worlds {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        FileReader fileReader = new FileReader(fileName);

        StringBuilder source = new StringBuilder();
        while (fileReader.ready()) {
            source.append((char) fileReader.read());
        }
        fileReader.close();

        source = new StringBuilder(source.toString().replaceAll("\\p{Punct}", " "));
        source = new StringBuilder(source.toString().replaceAll("\\n", " "));

        String[] source_split = source.toString().split(" ");
        int count = 0;
        for (String word : source_split) {
            if (word.equalsIgnoreCase("world")) {
                count++;
            }
        }

        System.out.println(count);
    }
}
