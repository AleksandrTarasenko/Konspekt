package Multithreading;

public class ThreadSort extends Thread {
    //Можно данный класс наследовать Thread
    // переопределить метод run
    // в main запустить поток, а так же создать другой цикл без переопределения метода run
    //данный вид будет работать с двумя потоками ThreadSort и main
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        ThreadSort thread1 = new ThreadSort();
        thread1.start();

        for (int i = 1000; i >0 ; i--) {
                System.out.println(i);
            }

    }
}
