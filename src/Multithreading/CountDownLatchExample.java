package Multithreading;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchExample {
    //CountDownLatch – это синхронизатор, позволяющий любому количеству потоков ждать пока не завершится
    //определённое количество операций.
    static CountDownLatch countDownLatch = new CountDownLatch(3);
    private static void marketStaffIsOnPlace() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("Market staff came to work");
        countDownLatch.countDown(); // countDown() - уменьшает счетчик countDownLatch на 1
        System.out.println("countDownLatch = " + countDownLatch.getCount()); //getCount - позволяет получить значение счетчика
    }

    private static void everythingIsReady() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("everything sis ready, so lets open market");
        countDownLatch.countDown(); // countDown() - уменьшает счетчик countDownLatch на 1
        System.out.println("countDownLatch = " + countDownLatch.getCount()); //getCount - позволяет получить значение счетчика
    }

    private static void openMarket() throws InterruptedException {
        Thread.sleep(4000);
        System.out.println("Market is opened");
        countDownLatch.countDown(); // countDown() - уменьшает счетчик countDownLatch на 1
        System.out.println("countDownLatch = " + countDownLatch.getCount()); //getCount - позволяет получить значение счетчика
    }
    public static void main(String[] args) throws InterruptedException {
        new Friend("Aleksandr", countDownLatch);
        new Friend("Oleg", countDownLatch);
        new Friend("Elena", countDownLatch);
        new Friend("Viktor", countDownLatch);
        new Friend("Marina", countDownLatch);
        marketStaffIsOnPlace();
        everythingIsReady();
        openMarket();
    }
}

class Friend extends Thread {
    String name;
    private CountDownLatch countDownLatch;

    public Friend(String name, CountDownLatch countDownLatch) {
        this.name = name;
        this.countDownLatch = countDownLatch;
        this.start();
    }

    public void run() {
        try {
            countDownLatch.await();
            System.out.println(name + " приступил(а) к закупке");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        // Если счетчик CountDownLatch > 0, поток будет заблокирован
        // до тех пор, пока счетчик не станет == 0
        //Если счетчик == 0, то поток работает без ограничений
    }
}