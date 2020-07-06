package Tasks.Samples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.System.*;

public class Readers {
    public static void main(String[] args) {
        int a;

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            a = Integer.parseInt(reader.readLine());
            out.println("You entered " + a);
        } catch (IOException io) {
            err.println("There is nothing");
        } catch (NumberFormatException nfe) {
            err.println("Too big number for int");
        } // try-catch-with-resources

//        int b = 'A';
//        System.out.write(b);


    }
}
