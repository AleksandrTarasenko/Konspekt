package Multithreading;

public class SynchronizedObject {
    //Синхронизация по объекту
    //каждый блок связывается с монитором второстебенного объекта для синхронизации по объекту
    //static final Car car = new Car(); //не рекомендованно использлвать какойто второстепенный класс
    static final Object lock = new Object(); //необходимо использовать Object и присваивать имя lock

     void mobileCall()  {
        synchronized (lock){
        System.out.println("Mobile call starts");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Mobile call ends");
        }
     }
     void skypeCall()  {
        synchronized (lock) {

            System.out.println("Skype call starts");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Skype call ends");
        }
    }
     void whatsappCall()  {
         synchronized (lock) {

             System.out.println("Whatsapp call starts");
             try {
                 Thread.sleep(7000);
             } catch (InterruptedException e) {
                 throw new RuntimeException(e);
             }
             System.out.println("Whatsapp call ends");
         }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new RunnableImplMobiel());
        Thread thread2 = new Thread(new RunnableImplSkype());
        Thread thread3 = new Thread(new RunnableImplWhatsapp());
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class RunnableImplMobiel implements Runnable {
    public void run() {
        new SynchronizedObject().mobileCall();
    }
}
class RunnableImplSkype implements Runnable {
    public void run() {
        new SynchronizedObject().skypeCall();
    }
}
class RunnableImplWhatsapp implements Runnable {
    public void run() {
        new SynchronizedObject().whatsappCall();
    }
}

//class Car {
//
//}