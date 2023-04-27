package Multithreading;

public class ThreadEx {
    public static void main(String[] args) {
        MyThread1 myThread1 = new MyThread1();
        MyThread2 myThread2 = new MyThread2();
        myThread1.start(); // запускаем методом start
        myThread2.start();
        // Данные потоки не синхронизированны
    }
}

//Варианты создания
// 1. Наследуя класс Thread и переопределяя метод run, в теле run записываем код, и запускаем в main методом myThread1.start();

class MyThread1 extends Thread { //Thread - поток.
    public void run() { //используем метод run
        for (int i = 1; i <= 1000; i++) {
            System.out.println(i);
        }
    }
}
class MyThread2 extends Thread {
    public void run() {
        for (int i = 1000; i >0 ; i--) {
            System.out.println(i);
        }
    }
}