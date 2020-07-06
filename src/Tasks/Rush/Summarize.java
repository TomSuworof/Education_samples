package Tasks.Rush;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Summarize {
    public static void main(String[] args) throws IOException {
        Integer sum = 0;
        while(true) {
            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                String str = reader.readLine();
                if (str.equals("сумма") || str.equals("sum") || str.equals("exit")) break;
                Integer temp = Integer.parseInt(str);
                sum += temp;
            }
            catch (NumberFormatException wrongNumber) {
                System.out.println("Wrong number. Try again");
            }
        }
        System.out.println(sum);
    }
}
