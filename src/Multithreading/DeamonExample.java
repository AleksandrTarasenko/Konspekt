package Multithreading;

public class DeamonExample {
    public static void main(String[] args) {
        System.out.println("Main thread starts");
        UserTherd userTherd = new UserTherd();
        userTherd.setName("user_thread");
        DeamonTherd deamonTherd = new DeamonTherd();
        deamonTherd.setName("deamon_thread");
        deamonTherd.setDaemon(true); //Ставиться до старта потока, иначе выброситься исключение
        userTherd.start();
        deamonTherd.start();
        System.out.println("Main thread starts");
    }
}

class UserTherd extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() +
                "is daemon " + isDaemon());
        for (char i = 'A'; i <= 'J'; i++) {
            try {
                sleep(300);
                System.out.println(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class DeamonTherd extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() +
                "is daemon " + isDaemon());
        for (int i = 0; i <= 1000; i++) {
            try {
                sleep(100);
                System.out.println(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}