package Multithreading;

public class RunnableEx {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyThread3());
        Thread thread2 = new Thread(new MyThread4());
        thread1.start();
        thread2.start();
        // Данные потоки не синхронизированны
    }
}

//Варианты создания
// 2. Имплементируя интерферс Runnable и переопределяя метод run, в теле run записываем код, и запускаем в main методом myThread1.start();

class MyThread3 implements Runnable { //Thread - поток.
    public void run() { //используем метод run
        for (int i = 1; i <= 1000; i++) {
            System.out.println(i);
        }
    }
}
class MyThread4 implements Runnable {
    public void run() {
        for (int i = 1000; i >0 ; i--) {
            System.out.println(i);
        }
    }
}
