package Multithreading;

public class JoinGetStateEx {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Methods main begin");
        Thread thread = new Thread(new Worker());
        System.out.println(thread.getState()); //  getState состояние потока
        thread.start();
        System.out.println(thread.getState());
        thread.join(1500); // в методе join в параметрах может указать скаолько спит данный поток
        //В данном случае join отрабатывает или по времени в параметре или если второй поток закончит работу
        // выполнится то условие, которое наступит раньше
        System.out.println(thread.getState());
        System.out.println("Methods main ends");
    }
}

class Worker implements Runnable {
    @Override
    public void run() {
        System.out.println("Work begin");
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Work ends");
    }
}