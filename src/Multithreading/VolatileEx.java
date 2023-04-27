package Multithreading;

public class VolatileEx extends Thread{
    volatile boolean b = true;
    //Используется для пометки переменной, как хранящейся только в основной памяти "main memory"
    //Что позволяет использовать её разными потоками
//    Для синхронизации значения переменной между потоками ключевое слово volatile используется тогда,
//    когда только один поток может изменять значение этой переменной,а остальные потоки могут его только читать.


    @Override
    public void run() {
        long counter = 0;
        while (b) {
            counter++;
        }
        System.out.println("Loop is finised. counter = " + counter);
    }

    public static void main(String[] args) throws InterruptedException {
        VolatileEx thread = new VolatileEx();
        thread.start();
        Thread.sleep(3000);
        System.out.println("After 3 seconda it is time to wake up!");
        thread.b = false;
        thread.join();
        System.out.println("End of programm");

    }
}
