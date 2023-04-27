package Multithreading;

public class DeadLockExample {
    //Deadlock – ситуация, когда 2 или более потоков залочены навсегда, ожидают друг друга и ничего не делают.
    //Livelock – ситуация, когда 2 или более потоков залочены навсегда, ожидают друг друга, проделывают какую-то
    //работу, но без какого-либо прогресса.
    //Lock starvation – ситуация, когда менее приоритетные потоки ждут долгое время или всё время для того,
    // чтобы могли запуститься
    public static final Object lock1 = new Object();
    public static final Object lock2 = new Object();

    public static void main(String[] args) {
        Thread10 thread10 = new Thread10();
        Thread20 thread20 = new Thread20();
        thread10.start();
        thread20.start();
    }
}

class Thread10 extends Thread {
    public void run() {
        System.out.println("Thread10: Попытка захватить монитор объекта lock1");
        synchronized (DeadLockExample.lock1) { //порядок объектов lock должен сохранятся в synchronized блоках
            System.out.println("Thread10: монитор объекта lock1 захвачен");
            System.out.println("Thread10: Попытка захватить монитор объекта lock2");
            synchronized (DeadLockExample.lock2) {
                System.out.println("Thread10: мониторы объектов lock1" + "и lock2 захвачены");
            }
        }
    }
}
class Thread20 extends Thread {
    public void run() {
        System.out.println("Thread20: Попытка захватить монитор объекта lock2");
        synchronized (DeadLockExample.lock1) {  //порядок объектов lock должен сохранятся в synchronized блоках
            System.out.println("Thread20: монитор объекта lock2 захвачен");
            System.out.println("Thread20: Попытка захватить монитор объекта lock1");
            synchronized (DeadLockExample.lock2) { //пр изменении порядка, возможна ситуация зависания программы
                System.out.println("Thread20: мониторы объектов lock1" + "и lock2 захвачены");
            }
        }
    }
}