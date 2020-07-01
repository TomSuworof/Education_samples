package Tasks;

abstract class Human {
    private String name;
    private double age;
    private String address;
    final private double bornTime;
    final private boolean gender;
    private static int population;

    Human(String name, String address, boolean gender) {
        this.name = name;
        this.address = address;
        this.bornTime = System.currentTimeMillis();
        this.gender = gender;
    }

    void _ () {
        System.out.println("Easter egg is coming");
    }

    private void correctAge() {
        this.age = System.currentTimeMillis() - bornTime;
    }
    public String getGender() {
        return gender? "man" : "woman";
    }

    public void changeName(String newName) {
        if (age > 18) {
            this.name = newName;
        }
        else {
            System.out.println("You are too small");
        }
    }
    public void changeAddress(String newAddress) {
        this.address = newAddress;
    }
    public void printAllData() {
        correctAge();
        System.out.println(name + "(" + getGender() + "), " + age + " mills old, lives in " + address);
    }
    public static int getPopulation() {
        return population;
    }
}

class Man extends Human {
    Man (String name, String address) {
        super(name, address, true);
    }
}

class Woman extends Human {
    Woman (String name, String address) {
        super(name, address, false);
    }
}


public class ManAndWoman {
    public static void main(String[] args) {
        Human bydlo = new Man("Vasya", "Syberia");
        Human gopnik = new Man("Valeriy", "Moscow");

        Human mamasha = new Woman("Svetlana", "EKB");
        Human gopnikGirl = new Woman("Inna", "Moscow");

        bydlo.printAllData();
        gopnik.printAllData();

        mamasha.printAllData();
        gopnikGirl.printAllData();

        mamasha._();

        System.out.println(gopnik.equals(gopnikGirl));
        System.out.println(Human.getPopulation());
    }
}