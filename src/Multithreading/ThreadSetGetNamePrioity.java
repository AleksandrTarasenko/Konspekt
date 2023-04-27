package Multithreading;

public class ThreadSetGetNamePrioity {
    public static void main(String[] args) {
        //Приоритет по умолчанию 5 у всех потоков
        //шкала приоритетов от 1 до 10 где 10 максимальный приоритет.
        // Нет гарантии что поток с наивысшим приоритетом запуститься раньше
        //Имя потока начинается с 0 (Thread-0) и увеличивается (Thread-1)
        //можно изменить имя потока
        MyThread5 myThread5 = new MyThread5();
        myThread5.setName("moy_potok"); // меняем имя потока
        myThread5.setPriority(9); // Изменяем приоритет
        myThread5.setPriority(Thread.MIN_PRIORITY); // Изменяем через константы
        myThread5.setPriority(Thread.MAX_PRIORITY); // Изменяем через константы
        myThread5.setPriority(Thread.NORM_PRIORITY); // Изменяем через константы

        System.out.println("Name of myThread5 = " + myThread5.getName() +
                " priority of myThread5 = " + myThread5.getPriority());

        MyThread5 myThread6 = new MyThread5();
        System.out.println("Name of myThread5 = " + myThread6.getName() +
                " priority of myThread5 = " + myThread6.getPriority());
    }

}

class MyThread5 extends Thread {
    public void run() {
        System.out.println("Privet");
    }
}