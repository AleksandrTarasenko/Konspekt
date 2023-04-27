package Multithreading;

public class ThreadRunnableLamda {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("privet");
            }
        }).start();

        new Thread(() -> System.out.println("Priv")).start();
    }
}
