package Tasks.Samples;

enum Apple {
    GoldenDel(100),
    Winesap(300),
    Jonathan(10),
    Cortland(42);

    private int price;

    Apple(int price) {
        this.price = price;
    }

    int getPrice() {
        return price;
    }

    void setPrice(int price) {
        this.price = price;
    }
}

public class Enumerate {
    public static void main(String[] args) {
        for (Apple appleItem : Apple.values()) {
            System.out.print("In my bag I have " + appleItem);
            System.out.print(" and it costs " + appleItem.getPrice());
            System.out.println(" also it takes " + appleItem.ordinal() + " place in my bag");
        }
    }
}
