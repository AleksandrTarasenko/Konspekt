package Multithreading;

public class DataRaseEX {
    public static void main(String[] args) {
        MyRunnableImpll runnable = new MyRunnableImpll();
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

class Counter {
   volatile static int count = 0;
}

class MyRunnableImpll implements Runnable {
    public void increment() {
        Counter.count++;
        System.out.print(Counter.count + " ");
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            increment();
        }
    }
}