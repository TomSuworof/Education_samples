package Tasks;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Solution2 {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner {
        private final Scanner fileScanner;

        PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException, ParseException {
            String input = fileScanner.nextLine();
            String[] input_split = input.split(" ");
            String first_name = input_split[0];
            String middle_name = input_split[1];
            String last_name = input_split[2];
            String birthday_str = input_split[3] + " " + input_split[4] + " " + input_split[5];
            SimpleDateFormat formatter = new SimpleDateFormat("dd MM yyyy");
            Date birthday = formatter.parse(birthday_str);
            return new Person(first_name, middle_name, last_name, birthday);
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}

interface PersonScanner {

    Person read() throws IOException, ParseException;

    void close() throws IOException;
}

class Person {
    final private String firstName;
    final private String middleName;
    final private String lastName;
    final private Date birthDate;

    public Person(String firstName, String middleName, String lastName, Date birthDate) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s", lastName, firstName, middleName, birthDate.toString());
    }
}