package Multithreading;

import java.util.concurrent.*;

public class CallFactorial {
    static int factorialRezalt;

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor(); //Создаем один поток
        Factorial2 factorial2 = new  Factorial2(5);
        Future<Integer> future = executorService.submit(factorial2);
        //у интерфейса Callable нет возможности использовать метод execute
        // необходимо использовать метод submit, он возвращает результат задачи (Task)
        // Результат задачи храниться в объекте типа Future, по этому результат нужно присвоить к новому объекту Future
        //получить результат Future можно с помощью метода get
        try {
            System.out.println(future.isDone()); // isDone проверяет, закончилась ли задача (в этой строке false)
            System.out.println("Хотим получить результат");
            factorialRezalt = future.get(); // метод get блокирует поток, до тех пор, пока не будет отработана задача
            System.out.println("Получили результат");
            System.out.println(future.isDone()); //(в этой строке true)
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            System.out.println(e.getCause()); // выводит причину почему выброшено исключение(в данном случае из метода call)
        }
        finally {
            executorService.shutdown();
        }
        System.out.println(factorialRezalt);
    }
}

class Factorial2 implements Callable<Integer> {
    int f;

    public Factorial2(int f) {
        this.f = f;
    }
    @Override
    public Integer call() throws Exception {
        if (f <= 0) {
            throw new Exception("Вы ввели неверное число");
        }
        int rezult = 1;
        for (int i = 1; i <= f; i++) {
            rezult *= i;
            Thread.sleep(1000);
        }
        return rezult;
    }
}