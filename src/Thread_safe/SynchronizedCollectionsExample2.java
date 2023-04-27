package Thread_safe;

import java.util.*;

public class SynchronizedCollectionsExample2 {
    public static void main(String[] args) throws InterruptedException {
        AbstractList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            arrayList.add(i);
        }
        List<Integer> synchList = Collections.synchronizedList(arrayList);

        Runnable runnable1 = () ->{
            synchronized (synchList) { //что бы избежать выброс исключения ConcurrentModificationException
                //необходимо обернуть код с iterator в synchronized с передачей ему в параметры synchronizedList

            Iterator<Integer> iterator = synchList.iterator();
            while (iterator.hasNext())
                System.out.println(iterator.next());
            }
        };
        Runnable runnable2 = () ->
                synchList.remove(10);
        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(synchList);
    }


}
