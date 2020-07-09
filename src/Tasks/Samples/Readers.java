package Tasks.Samples;

import java.io.*;
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
            Object something = objectReader.readObject();
            Animal anotherCat = (Animal) something;
            anotherCat.meow();
        } catch (IOException | ClassNotFoundException ioe) {
            ioe.printStackTrace();
        }
    }
}

class Animal implements Serializable {
    private final String name;

    Animal(String name) {
        this.name = name;
    }

    void meow() {
        out.println("Meow, I am " + name);
    }
}
