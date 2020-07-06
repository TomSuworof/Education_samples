package Tasks.Rush;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ByteReader {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream fileReader = new FileInputStream(bufferedReader.readLine())) {
            HashMap<Integer, Integer> freq = new HashMap<>();
            while (fileReader.available() > 0) {
                int count = fileReader.read();
                if (freq.containsKey(count)) {
                    freq.put(count, freq.get(count) + 1);
                } else {
                    freq.put(count, 1);
                }
            }
            Integer max_freq = Collections.max(freq.values());
            Integer max_freq_val;
            for (Map.Entry<Integer, Integer> pair : freq.entrySet()) {
                Integer curr_val = pair.getKey();
                Integer curr_freq = pair.getValue();
                if (curr_freq.equals(max_freq)) {
                    max_freq_val = curr_val;
                    System.out.print(max_freq_val + " ");
                }
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
