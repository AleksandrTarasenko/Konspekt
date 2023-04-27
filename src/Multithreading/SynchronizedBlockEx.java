package Multithreading;

public class SynchronizedBlockEx {
    public static void main(String[] args) {
        MyRunnableImpll2 runnable = new MyRunnableImpll2();
        //Когда 2 и более потоков меняют и выводят на экран значение (даже volatile)
        //вывод значения буден непредсказуем 1 3 4 5 2 7 8 6 9, т.к потоки работают с разной скоростью
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class Counter2 {
    volatile static int count = 0;
}

class MyRunnableImpll2 implements Runnable {
    private void doWork2() {
        System.out.println("!!!");
    }
    private   void doWork1() {
        doWork2();
        synchronized (this) { //Synchronized Block, блок кода синхронизации. this (Этот) говорит что именно этого кода
            Counter2.count++;
             System.out.println(Counter2.count);
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            doWork1();
        }
    }
}
