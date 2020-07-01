package Multi_threading.Store;

public class Program {
    public static void main(String[] args) {
        Store wallmart = new Store();
        Manufacturer acer = new Manufacturer(wallmart);
        Shopper me = new Shopper(wallmart);
        new Thread(acer).start();
        new Thread(me).start();
    }
}

class Store {
    private int products = 0;
    public synchronized void get() {
        while (products < 1) {
            try {
                wait();
            }
            catch (InterruptedException interr) {
                System.err.println("Thread " + Thread.currentThread().getName() + " was interrupted");
            }
        }
        products--;
        System.out.println("Shopper bought a product");
        System.out.println("Remain: " + products);
        notify();
    }
    public synchronized void put() {
        while (products > 4) {
            try {
                wait();
            }
            catch (InterruptedException interr) {
                System.err.println("Thread " + Thread.currentThread().getName() + " was interrupted");
            }
        }
        products++;
        System.out.println("Manufacturer added a product");
        System.out.println("Remain: " + products);
        notify();
    }
}

class Manufacturer implements Runnable {
    Store store;
    Manufacturer (Store store) {
        this.store = store;
    }
    @Override
    public void run() {
        for(int i = 0; i < 6; i++) {
            store.put();
        }
    }
}

class Shopper implements Runnable {
    Store store;
    Shopper (Store store) {
        this.store = store;
    }
    @Override
    public void run() {
        for(int i = 0; i < 6; i++) {
            store.get();
        }
    }
}