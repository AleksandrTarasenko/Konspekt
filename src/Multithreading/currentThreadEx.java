package Multithreading;

public class currentThreadEx implements Runnable {
    public void run() {
//        \\currentThread// показывает текущий поток
        System.out.println("Methods run. Thead name = " +
                Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new currentThreadEx());
        //thread.run(); // run() использовать нельзя,т.к. он обрабатывается только main, и не вызыыват новый поток
        thread.start();
        System.out.println("Methods main. Thread name = " +
                Thread.currentThread().getName());
    }
}
