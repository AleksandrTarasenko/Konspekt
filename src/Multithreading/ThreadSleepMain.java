package Multithreading;

public class ThreadSleepMain {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 5; i > 0; i--) {
            System.out.println(i);
//    \\sleep// Заставляет поток спать количество времени в милисекундах
            Thread.sleep(1000);
        }
        System.out.println("Поехали");
    }
}
