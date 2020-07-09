package Tasks.Rush;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.SortedSet;
import java.util.TreeSet;

public class TheRichest {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
            HashMap<String, Double> table = new HashMap<>();
            while (reader.ready()) {
                String data = reader.readLine();
                String name = data.split(" ")[0];
                Double salary = Double.parseDouble(data.split(" ")[1]);
                if (table.containsKey(name)) {
                    table.put(name, table.get(name) + salary);
                } else {
                    table.put(name, salary);
                }
            }
            reader.close();

            SortedSet<String> sorted = new TreeSet<>(table.keySet());
            Double maxSalary = Collections.max(table.values());

            for (String rich : sorted) {
                if (table.get(rich).equals(maxSalary)) {
                    System.out.println(rich);
                }
            }

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
