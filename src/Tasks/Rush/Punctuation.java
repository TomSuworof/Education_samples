package Tasks.Rush;

import java.io.*;
import java.util.ArrayList;

public class Punctuation {
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

//        String allow = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRTUVWXYZ";
        String src_str = String.valueOf(source).replaceAll("\\p{Punct}", "");

//        for (Integer code : source) {
//            char curr = (char) code.intValue();
////            if ((curr >= 48 && curr <= 57) || (curr >= 65 && curr <= 90) || (curr >= 97 && curr <= 122)) {
//            if (allow.contains(Character.toString(curr))) {
//                file_output.write(curr);
//            }
//        }
//
        file_output.write(src_str);

        file_input.close();
        file_output.close();
    }
}
