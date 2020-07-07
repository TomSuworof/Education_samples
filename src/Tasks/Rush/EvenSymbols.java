package Tasks.Rush;

import java.io.*;
import java.util.ArrayList;

public class EvenSymbols {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file_1 = reader.readLine();
        String file_2 = reader.readLine();
        reader.close();
        FileReader file_input = new FileReader(file_1);
        FileWriter file_output = new FileWriter(file_2);

        ArrayList<Integer> source = new ArrayList<>();

        while(file_input.ready()) {
            source.add(file_input.read());
        }

        for (int i = 0; i < source.size(); i++) {
            if (i % 2 == 1) {
                file_output.write(Character.toChars(source.get(i)));
            }
        }

        file_input.close();
        file_output.close();
    }
}
