package Multithreading;

public class InterruptionEx {
    //interrupt - прерывание
    //
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main starts");
        InterruptedThread thread = new InterruptedThread();
        thread.start();
        Thread.sleep(2000);
        //в старых версиях Java использовался thread.stop(); (прерывал не все процессы)
        thread.interrupt(); // interrupt не прерывает поток, он хочет прервать и посылает сигнал, что он хочет прервать поток

        thread.join();
        System.out.println("Main ends");
    }
}

class InterruptedThread extends  Thread{
    double sqrtSum =0;
    public void run() {
        for (int i = 1; i <= 1000000000; i++) {
            if (isInterrupted()){ // пытаются ли прервать поток?
                System.out.println("Potok hotyat prervat");
                System.out.println("Мы убедились, что состояние" + " всех объектов нормальное" +
                        " и решили завершить работу потоков");
                System.out.println(sqrtSum);
                return;
            }
                sqrtSum += Math.sqrt(i);
            try {
                sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Поток  хотят прервать во время сна" +
                        " Давайте прервем поток");
                System.out.println(sqrtSum);
                return;
            }
        }
        System.out.println(sqrtSum);
    }
}