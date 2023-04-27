package Queue_Interface;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListEx {
    //Queue (КЮ) - очередь. Коллекция Хранит последовательность
    //FIFO - первый зашел - первый вышел
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Aleksandr");
        queue.add("Oleg");
        queue.add("Ivan");
        queue.add("Mariya");
        queue.add("Zaur");
        //Если очередь ограничена, то после добавления в неё элемента через add выбросится исключение о переполнении очереди
        System.out.println(queue);
        queue.offer("Nikolay");
        //Если очередь ограничена, то после добавления в неё элемента через offer исключение НЕ выбросится и элемент не буде добавлен
        System.out.println(queue.remove());
        // Удалиться Aleksandr(первый в очереди)
        //при достижении окончания списка remove бросит исключение
        System.out.println(queue.poll());
        // Удалиться Aleksandr(первый в очереди)
        //при достижении окончания списка poll НЕ бросит исключение, а вернет null
        System.out.println(queue.element());
        //при достижении окончания списка element бросит исключение
        System.out.println(queue.peek());  //при достижении окончания списка poll НЕ бросит исключение, а вернет null
        queue.remove("Ivan"); //удаление из середины списка (для удаления из середины, лучше испоьзовать другие листы)
    }
}
