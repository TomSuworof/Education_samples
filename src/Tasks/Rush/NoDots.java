package Tasks.Rush;

import java.io.*;
import java.util.ArrayList;

public class NoDots {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file_1 = reader.readLine();
        String file_2 = reader.readLine();
        reader.close();
        BufferedReader file_input = new BufferedReader(new FileReader(file_1));
        BufferedWriter file_output = new BufferedWriter(new FileWriter(file_2));

        ArrayList<Integer> source = new ArrayList<>();

        while(file_input.ready()) {
            source.add(file_input.read());
        }

        for (Integer code : source) {
            file_output.write((char) code.intValue() == '.' ? '!' : (char) code.intValue());
        }

        file_input.close();
        file_output.close();
    }
}
