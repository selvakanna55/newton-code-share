package multithreading;

// print 010203040506...0990100
// 0-> thread1
// odd -> thread2
// even -> thread3
class Thread012 implements Runnable {
    static final Object lock = new Object();
    static boolean printZero = true;
    static int num = 1;
    static final int maxi = 100;
    int curr;
    static final int div = 2;

    Thread012(int curr) {
        this.curr = curr;
    }

    @Override
    public void run() {
        if (curr == -1) zero();
        else oddEven();
    }

    void zero() {
        synchronized (lock) {
            while (num <= maxi) {
                while (!printZero) {
                    try {
                        lock.wait();
                    } catch (InterruptedException ignored) {
                    }
                }
                System.out.println(Thread.currentThread().getName() + 0 + "-");
                printZero = !printZero;
                lock.notifyAll();
            }
        }
    }

    void oddEven() {
        synchronized (lock) {
            while (num <= maxi) {
                while (printZero || num % div != curr) {
                    try {
                        lock.wait();
                    } catch (InterruptedException ignored) {
                    }
                }
                System.out.println(Thread.currentThread().getName() + num + "-");
//                System.out.print(num + " ");
                num++;
                printZero = true;
                lock.notifyAll();
            }
        }
    }
}


public class Print010203Inter {
    public static void main(String[] args) {
        new Thread(new Thread012(-1), "T0 ").start();
        new Thread(new Thread012(1), "T1 ").start();
        new Thread(new Thread012(0), "T2 ").start();
    }
}
