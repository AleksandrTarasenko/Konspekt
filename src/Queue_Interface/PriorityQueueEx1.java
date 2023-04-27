package Queue_Interface;

import java.util.PriorityQueue;

public class PriorityQueueEx1 {
    //Спец вид очереди в котором используется натуральная сортировка или описанная через Comparable или Comparator
    //Используется тот элемент в очереди у которого приоритет выше
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(4);
        priorityQueue.add(1);
        priorityQueue.add(7);
        priorityQueue.add(10);
        priorityQueue.add(8);
        System.out.println(priorityQueue);
        //при выводе в консоль priorityQueue хранит элементы как были занесены БЕЗ сортироки
        //Однако получение элементов будет по приоритету
        System.out.println("Вызван самый верхний элемент = " + priorityQueue.peek()); //peek самый верхний элемент
        //PriorityQueue сортирует элементы в след порядке 1 4 7 8 10
        //наивысший приоритет имеет наименьшее значение
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());

    }

}
