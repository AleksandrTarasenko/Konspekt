package Multithreading;

import java.util.TreeMap;
import java.util.concurrent.*;

public class ThreadPoolExample {
    //Thread Pool - это множество потоков, каждый из которых могут выполнять задачи приходящие в них
    //Executor - исполнитель (Интерфейс)
    //ExecutorService - Выполняет сервисы (Интерфейс)
    public static void main(String[] args) throws InterruptedException {
        //ExecutorService executorService = new ThreadPoolExecutor() //так можно, но так не делают(ThreadPool практически никогда не создают)
        ExecutorService executorService = Executors.newFixedThreadPool(5); // Будет создано 5 потоков
        //Потоки создаются через Executors и его методы
        //Factory методы (фабрика по производству пулов)
        //метод newFixedThreadPool() - создается пул с количеством потоков указанных в параметрах
        // метод newSingleThreadExecutor() - создается пул с 1 потоком
        for (int i = 0; i < 10; i++) {
            executorService.execute(new RunnableImp100());
            // execute - выполнитель, передаёт наше задание (task) в thread pool,где оно выполняется одним из потоков
        }
        executorService.shutdown(); //задач больше не будет
        executorService.awaitTermination(5, TimeUnit.SECONDS); //вызывается всегда после shutdown
        //в параметрах указывается число и размерность числа (SECONDS) - 5 секунд в примере
        // awaitTermination - работает как Join, т.е. поток ждет окончания работы Пула (ExecutorService) или время указанное в параметрах
        System.out.println("Main ends");
    }
}

class RunnableImp100 implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}