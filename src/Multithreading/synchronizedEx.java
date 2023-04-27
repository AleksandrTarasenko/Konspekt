package Multithreading;

public class synchronizedEx {
    volatile static int counter = 0;//synchronized нельзя поставить на переменную
    // synchronized ставит замок (Lock) на метод, и разрешает работать только одному потоку с данным методом
    //блокировка происходит за счет занятия монитора
    public static synchronized void increment() {
        counter++;
    }
    public static void main(String[] args) throws InterruptedException {
//        MyRunnableImpll runnable = new MyRunnableImpll();
//
        Thread thread1 = new Thread(new R());
        Thread thread2 = new Thread(new R());
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        System.out.println(counter);

    }
}

class R implements Runnable {


    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            synchronizedEx.increment();
        }
    }
}

