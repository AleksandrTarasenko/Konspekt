package Multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bankomat {
    public static void main(String[] args) throws InterruptedException {
        Lock lock = new ReentrantLock() { };
        new Employee("Aleksandr", lock);
        new Employee("Oleg", lock);
        new Employee("Elena", lock);
        Thread.sleep(5000);
        new Employee("Viktor", lock);
        new Employee("Marina", lock);
    }
}

class Employee extends Thread {
    String name;
    private Lock lock;
    public Employee(String name, Lock lock) {
        this.name = name;
        this.lock = lock;
        this.start();
    }
    public void run() {
        if (lock.tryLock()) //tryLock позволяет попытаться поставить lock, или выполняет другое условие в else
        try {
//            System.out.println(name + " Ждет");
//            lock.lock();
            System.out.println(name + " Пользуется банкоматом");
            Thread.sleep(2000);
            System.out.println(name + "Завершил(а) свои дела");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finally {
            lock.unlock();
        }
    else
    {
            System.out.println(name + " не хочет ждать в очереди");
        }
    }

}