package Multi_threading.Philosopher;

import java.util.concurrent.Semaphore;

public class Program {
    public static void main(String[] args) {
        Semaphore cafe = new Semaphore(2);
        for(int i = 1; i <= 5; i++) {
            new Philosopher(cafe, i).start();
        }
    }
}

class Philosopher extends Thread {
    private Semaphore sem;
    private int id;
    private int num = 0;
    Philosopher (Semaphore sem, int id) {
        this.sem = sem;
        this.id = id;
    }

    @Override
    public void run () {
        try {
            while (num <= 3) {
                sem.acquire();
                System.out.println("Philo " + id + " started eating");
                Thread.sleep(1000);
                num++;
                System.out.println("Philo " + id + " stopped eating and went to walk");
                sem.release();
                Thread.sleep(2000);
            }
        }
        catch (InterruptedException inter) {
            System.out.println("Thread of philo " + id + "was interrupted");
        }
    }
}