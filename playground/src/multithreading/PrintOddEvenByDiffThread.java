package multithreading;

class ThreadOddEven implements Runnable {
    static final Object lock = new Object();
    static int num = 0;
    int div;
    static final int maximum = 100;
    int remainder;

    ThreadOddEven(int remainder, int div) {
        this.remainder = remainder;
        this.div = div;
    }

    public void run() {
        synchronized (lock) {
            while (num <= maximum) {
                // change to  num <= maximum-div+1 to get only till maximum
                while (num % div != remainder) {
                    try {
                        lock.wait();
                    } catch (InterruptedException ignore) {
                    }
                }
                System.out.println(Thread.currentThread().getName() + " " + num);
                num++;
                lock.notifyAll();
            }
        }
    }
}


public class PrintOddEvenByDiffThread {
    public static void main(String[] args) {
        int num = 2;
        for (int i = 0; i < num; i++) {
            new Thread(new ThreadOddEven(i, num), "T"+i).start();
        }
    }
}
