package Multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerExample {
    // static int counter = 0;
    //AtomicInteger - позволяет синхронизировать действия внутри себя на чтение изменение и запись
    //AtomicInteger – это класс, который предоставляет возможность работать с целочисленным значением int,
    //используя атомарные операции
    static AtomicInteger counter = new AtomicInteger(0);//Значение по умолчанию 0

    public static void increment() {
        //counter++;
        counter.incrementAndGet(); // Метод incrementAndGet увеличь старое значение и передай его в ответ.
        // другой вид метода getAndIncrement - получи старое значение, передай его, и увеличь его после этого на 1
        counter.addAndGet(5); // добавь число в параметре и увеличь/уменьши на полученное знач в параметре
        //counter.getAndAdd(-5); //получи старое значение, передай его, и увеличь/уменьши его после на число в параметре
        //counter.decrementAndGet - уменьши на единицу и получи
        //counter.getAndDecrement - получи старое значение, передай его, и уменьши его после этого на 1


    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new MyRunnableImp18());
        Thread thread2 = new Thread(new MyRunnableImp18());
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        System.out.println(counter);
    }
}

class MyRunnableImp18 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            AtomicIntegerExample.increment();
        }
    }
}