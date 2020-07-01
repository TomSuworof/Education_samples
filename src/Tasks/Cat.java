package Tasks;

public class Cat {

    private String name;
    private int weight;
    private int age;
    private String color;
    private String address;

    public void initialize (String name) {
        this.name = name;
        this.weight = 3;
        this.age = 2;
        this.color = "Grey";
        this.address = null;
    }

    public void initialize (String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "Grey";
        this.address = null;
    }

    public void initialize (String name, int age) {
        this.name = name;
        this.weight = 3;
        this.age = age;
        this.color = "Grey";
        this.address = null;
    }

    public void initialize (int weight, String color) {
        this.name = null;
        this.weight = weight;
        this.age = 2;
        this.color = color;
        this.address = null;
    }

    public void initialize (int weight, String color, String address) {
        this.name = null;
        this.weight = weight;
        this.age = 2;
        this.color = color;
        this.address = address;
    }

    public void printAllData() {
        System.out.println(
                "Name: " + name + '\n' +
                "Weight: " + weight + '\n' +
                "Age: " + age + '\n' +
                "Color: " + color + '\n' +
                "Address: " + address + '\n'
        );
    }

    public static void main(String[] args) {
        Cat myCat = new Cat();
        myCat.initialize("Vasya");
        myCat.printAllData();
    }
}
