package IO_files;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TryWithResources {
    public static void main(String[] args) throws IOException {
        String rubai = "Какой-то текст я написал\n" +
                "Что бы понять всю джаву\n" +
                "Четыре строчки написал\n" +
                "и джаву понял я опять\n";
        String s = "privet";
// TryWithResources - автоматическое закрытие ресурсов
        try (FileWriter writer = new FileWriter("text2.txt", true);
             FileReader reader = new FileReader("text2.txt")) {
            // для автоматического закрытия потока, необходимо после try в круглых скобках написать создание FileWriter/FileReader
            //Java машина понимает это как создание finally {writer.close();} и закроет поток автоматически
            //если несколько потоков записи или чтения, то записываются через точку с запятой ;

            writer.write(rubai);
            System.out.println("Done!");
            //или добавляем throws IOException или блок catch

            //Ресурс, который используется в Try with resources должен имплементировать интерфейс AutoCloseable

        }
    }
    /*
    по джава раш
        try (Класс имя = new Класс())
    {
        Код, который работает с переменной имя  втом числе с переопределяемым close()
    }

    переопределение close
    public static class Car implements AutoCloseable { //здесь имплементим AutoCloseable
    static void drive() {
        System.out.println("Машина поехала.");
    }

    @Override
    public void close() throws Core.Exception {
        System.out.println("Машина закрывается...");
    }
}
    */
}
