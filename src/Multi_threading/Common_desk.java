package Multi_threading;

import java.util.concurrent.locks.ReentrantLock;

public class Common_desk {
    public static void main(String[] args) throws InterruptedException {
        CommonString str = new CommonString();
        for (int i = 0; i < 3; i++) {
            new SignThread("Thread " + i, str.str);
        }
        Thread.sleep(1000);
        System.out.println(str);
    }
}

class CommonString {
    volatile String str = "Here was";
}

class SignThread extends Thread {
    ReentrantLock locker;
    String str;

    SignThread (String name, String str){
        super(name);
        this.str = str;
        locker = new ReentrantLock();
    }
    @Override
    public void run() {
        locker.lock();
        str += currentThread().getName();
        locker.unlock();
    }
}