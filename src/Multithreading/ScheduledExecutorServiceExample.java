package Multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorServiceExample {
    //ScheduledExecutorService - используется тогда, когда хотим установить расписание на запуск потоков из пула.
    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService scheduledExecutorService =
                Executors.newScheduledThreadPool(1);
//        for (int i = 0; i < 10; i++) {
//             scheduledExecutorService.execute(new RunnableImp200());
//        }
        //schedule - Выполнит наше входящие задание (new RunnableImp200()) через время указанное в параметрах
      scheduledExecutorService.schedule(new RunnableImp200(),
           3, TimeUnit.SECONDS);
        scheduledExecutorService.shutdown();

        //scheduleAtFixedRate - Планирует задачу для переодического выполнения (Время между началами задач)
        scheduledExecutorService.scheduleAtFixedRate(new RunnableImp200(), 3, 1, TimeUnit.SECONDS);
        // второй параметр, это время от начала задачи, до начала следующей задачи
        //Так же потоку main нужно спать весь период работы потока RunnableImp200,
        // иначе отработает метод shutdown и задача выполниться только 1 раз
        Thread.sleep(20000);
        scheduledExecutorService.shutdown();

        //scheduleWithFixedDelay - Планирует задачу для переодического выполнения (Время между началом и концом задач)
        // второй параметр, это время от окончания первой задачи, до начала следующей задачи
        scheduledExecutorService.scheduleWithFixedDelay(new RunnableImp200(), 3, 1, TimeUnit.SECONDS);

        //newCachedThreadPool - кэшированный тред пул (ThreadPool)
        // будут создаваться потоки по надобности
        //Когда тред свободны они переиспользются
        //Если свободных тредов нет, newCachedThreadPool создаст новый тред
        //Если тред не используется более 60 сек, он удаляется
        ExecutorService executorService = Executors.newCachedThreadPool();
    }


}

class RunnableImp200 implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " begins work");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName() + " ends work");
    }
}