package Thread_safe;

import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueueExample2 {
    public static void main(String[] args) {
        //ArrayBlockingQueue – потокобезопасная очередь с ограниченным размером (capacity restricted).

        //Обычно один или несколько потоков добавляют элементы в конец очереди,
        // а другой или другие потоки забирают элементы из начала очереди.
        ArrayBlockingQueue<Integer> arrayBlockingQueue = new  ArrayBlockingQueue<>(4);

        //Producer
        new Thread(()->{
            int i = 0;
            while (true) {
                try {
                    arrayBlockingQueue.put(++i);
                    System.out.println("Producer dobavil: " + i + " " + arrayBlockingQueue);
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();

        //Consumer
        new Thread(()->{
            while (true) {
                try {
                    Integer j = arrayBlockingQueue.take();
                    System.out.println("Consumer zabral: " + j+ " " + arrayBlockingQueue);
                    Thread.sleep(9000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();
    }
}
