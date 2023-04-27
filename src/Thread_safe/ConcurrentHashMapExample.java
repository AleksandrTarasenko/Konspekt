package Thread_safe;

import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample{
    public static void main(String[] args) throws InterruptedException {
        //В ConcurrentHashMap любое количество потоков может читать элементы не блокируя его.
        //В ConcurrentHashMap, благодаря его сегментированию, при изменении какого-либо элемента блокируется
        //только bucket, в котором он находится.
        //В ConcurrentHashMap ни key, ни value не могут быть null.

                ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
        map.put(1, "Aleksandr");
        map.put(2, "Oleg");
        map.put(3, "Sergey");
        map.put(4, "Ivan");
        map.put(5, "Igor");
        map.put(5, "Igor");

        System.out.println(map);

        Runnable runnable1 = () ->{
            //у HashMap нет метода iterator, по этому вызываем все ключи keySet, а у них iterator
            Iterator<Integer> iterator = map.keySet().iterator();
            while (iterator.hasNext()) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                Integer i = iterator.next();
                System.out.println(i + ":" + map.get(i));
            }

        };
        Runnable runnable2 =  () ->{
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            map.put(6, "Elena");
        };
        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(map);
    }
}
