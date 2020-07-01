package Multi_threading;

public class Double_threading {
    public static void main(String[] args) {
        System.out.println("Here is multi-threading starting...");
        new JThread("Another thread").start();
        System.out.println("Here is the end if multi-threading");
    }
}

class JThread extends Thread {
    JThread(String name) {
        super(name);
    }

    public void run() {
        System.out.println("here is: " + currentThread().getName());
    }
}