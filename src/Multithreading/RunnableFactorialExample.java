package Multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class RunnableFactorialExample {
    static int factorialResult = 0;

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Factorial factorial = new Factorial(5);
        executorService.execute(factorial);
        executorService.shutdown();
        executorService.awaitTermination(10, TimeUnit.SECONDS);
        //Здесь поток main должен поспать, иначе работа class Factorial не будет исполнена
        System.out.println(factorialResult);
    }
}

class Factorial implements Runnable {
    int f;

    public Factorial(int f) {
        this.f = f;
    }
    @Override
    public void run() {
        if (f < 0) {
            System.out.println("вы ввели не верное число");
        return;
        }
        int rezult = 1;
        for (int i = 1; i <= f; i++) {
            rezult *= i;
        }
        RunnableFactorialExample.factorialResult = rezult;
    }
}