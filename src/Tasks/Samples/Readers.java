package Tasks.Samples;

import java.io.*;
import java.util.Arrays;

import static java.lang.System.*;

public class Readers {
    public static void main(String[] args) {
        int a;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            out.println("Print something: ");
            a = Integer.parseInt(reader.readLine());
            out.println("You entered " + a);
        } catch (IOException io) {
            err.println("There is nothing");
        } catch (NumberFormatException nfe) {
            err.println("Too big number for int");
        } // try-catch-with-resources


        try (ObjectOutputStream objectWriter = new ObjectOutputStream(new FileOutputStream("forAnimal.dat"))) {
            Animal cat = new Animal("Murzik");
            objectWriter.writeObject(cat);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        try (ObjectInputStream objectReader = new ObjectInputStream(new FileInputStream("forAnimal.dat"))) {
            Animal anotherCat = (Animal) objectReader.readObject();
            anotherCat.meow();
        } catch (IOException | ClassNotFoundException ioe) {
            ioe.printStackTrace();
        }

        Console console = console();
        if (console != null) {
            out.println("Enter login: ");
            String login = console.readLine();
            out.println("Enter password: ");
            char[] password = console.readPassword();
            if (login.equals("VerySecretGuy") && (Arrays.equals(password, "VerySecretPassword".toCharArray()))) {
                out.println("Accessed");
            } else {
                err.println("Access denied");
            }
        } else {
            err.println("Console not found");
        }
    }
}

class Animal implements Serializable {
    private static final long serialVersionUID = 1L;

    private final String name;

    Animal(String name) {
        this.name = name;
    }

    void meow() {
        out.println("Meow, I am " + name);
    }
}
