package Multi_threading.Race2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.Phaser;

public class Race2 {
    public static void main(String[] args) {
        Phaser Silverstone = new Phaser(1);

        /*
        new RacerThread("Hamilton", Silverstone).start();
        new RacerThread("Verstapen", Silverstone).start();
        new RacerThread("Kvyat", Silverstone).start();
        */

        RacerThread Hamilton  = new RacerThread("Hamilton",  Silverstone);
        RacerThread Verstapen = new RacerThread("Verstapen", Silverstone);
        RacerThread Kvyat     = new RacerThread("Kvyat",     Silverstone);

        ArrayList<RacerThread> racers = new ArrayList<>(Arrays.asList(Hamilton, Verstapen, Kvyat));

        for(RacerThread racer: racers) {
            racer.t.start();
        } // for each RacerThread racer from racers - start

/*
        System.out.println("waiting all");
        System.out.println("Phase: " + Silverstone.getPhase());
        System.out.println("all finished");
        */

        Silverstone.arriveAndAwaitAdvance();

        System.out.println("\n" + "Finish" + "\n");

        for(RacerThread racer: racers) {
            System.out.println(racer.name.substring(0,3).toUpperCase() + ": " + racer.time + " millis");
        }
    }
}

class RacerThread implements Runnable {
    final private Phaser track;
    public double time;
    final String name;
    Thread t;

    RacerThread (String name, Phaser track) {
        this.name = name;
        t = new Thread(this, name);
        this.track = track;
        track.register();
    }

    @Override
    public void run () {
        time = System.currentTimeMillis();
        try {
            System.out.println(Thread.currentThread().getName() + ": go go go");
            Thread.sleep(500);
        }
        catch (InterruptedException inter) {
            System.err.println(Thread.currentThread().getName() + " left the track");
        }
        /*
        System.out.println("Phase: " + track.getPhase());
        System.out.println(currentThread().getName() + " finished");
        System.out.println(currentThread().getName() + " is waiting");
        */
        time = System.currentTimeMillis() - time;
        track.arriveAndAwaitAdvance();
        track.arriveAndDeregister();
    }
}
