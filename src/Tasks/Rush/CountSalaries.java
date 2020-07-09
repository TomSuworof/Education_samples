package Tasks.Rush;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class CountSalaries {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String fileName = args[0];
        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
        HashMap<String, Double> table = new HashMap<>();
        while(fileReader.ready()) {
            String data = fileReader.readLine();
            String name = data.split(" ")[0];
            Double salary = Double.parseDouble(data.split(" ")[1]);
            if (table.containsKey(name)) {
                table.put(name, table.get(name) + salary);
            } else {
                table.put(name, salary);
            }
        }
        fileReader.close();
        SortedSet<String> sorted = new TreeSet<>(table.keySet());
        for (String name : sorted) {
            System.out.println(name + " " + table.get(name));
        }
    }
}
