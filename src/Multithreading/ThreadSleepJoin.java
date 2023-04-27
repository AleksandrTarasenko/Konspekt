package Multithreading;

public class ThreadSleepJoin extends Thread {
    public void run() {
        for (int i=1; i <= 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+" "+ i);
        }
    }
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new MyRunnabblel());
        ThreadSleepJoin thread2 = new ThreadSleepJoin();
        thread1.start();
        thread2.start();
//  \\join//
        thread1.join(); //join - заставляет метод main ждать пока закончится работа thread1 и всех других вызванных на этот метод
        thread2.join();
        System.out.println("konec!");
    }
}

class MyRunnabblel implements Runnable {
    public void run() {
        for (int i=1; i <= 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+" "+ i);
        }
    }
}
/*
на выходе
Thread-1 1
Thread-0 1
Thread-0 2
Thread-1 2
Thread-1 3
Thread-0 3
Thread-0 4
Thread-1 4
Thread-1 5
Thread-0 5
Thread-0 6
Thread-1 6
Thread-0 7
Thread-1 7
Thread-0 8
Thread-1 8
Thread-1 9
Thread-0 9
Thread-0 10
Thread-1 10
 */