package Tasks.Rush;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShortestLongest {
    public static void main(String[] args) throws IOException {
        List<String> strings = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            strings.add(reader.readLine());
        }
        System.out.println(strings);
        String shortest = Collections.min(strings) + " is shortest";
        int sIndex = strings.indexOf(shortest);
        String longest = Collections.max(strings) + " is longest";
        int lIndex = strings.indexOf(longest);
        System.out.println("First string is " + (sIndex < lIndex ? shortest : longest));
        reader.close();
    }
}
