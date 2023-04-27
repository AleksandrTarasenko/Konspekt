package Multithreading;

import java.util.concurrent.Semaphore;

public class SemaphoreExample {
    public static void main(String[] args) {
        //Semaphore - ограничивает количество входящих потоков в пул
        Semaphore callBox = new Semaphore(2);
        new Person("Aleksandr",callBox);
        new Person("Oleg",callBox);
        new Person("Elena",callBox);
        new Person("Viktor",callBox);
        new Person("Marina",callBox);
    }
}

class Person extends Thread {
    String name;
    private Semaphore callBox;

    public Person(String name, Semaphore callBox) {
        this.name = name;
        this.callBox = callBox;
        this.start();
    }

    public void run() {

        try {
        System.out.println(name + " ждет...");
    //acquire - попытка получения разрешения от Semaphore
            //заблокирует поток пока ресурс не будет доступен для нас
            callBox.acquire();
            System.out.println(name + " пользуется телефомом");
            sleep(2000);
            System.out.println(name + " завершил(а) звонок");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finally {
            callBox.release();
            //release - освобождает разрешение Semaphore и счетчик увеличивается на 1
        }
    }
}