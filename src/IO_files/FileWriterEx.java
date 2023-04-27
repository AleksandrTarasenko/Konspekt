package IO_files;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
    public static void main(String[] args) throws IOException {
        //Структура создания потока записи в файл FileWriter writer = new FileWriter(“file1.txt”);
        String rubai = "Какой-то текст я написал\n" +
                "Что бы понять всю джаву\n" +
                "Четыре строчки написал\n" +
                "и джаву понял я опять\n";
        String s = "privet";
        FileWriter writer = null; // объявлять переменную лучше за пределами блока try/catch что бы она была видна в finally
        try {
            //writer = new FileWriter("C:\\Users\\HOTRIC-RIG2\\Desktop\\Text1.txt");//абсолютный путь
            writer = new FileWriter("text2.txt", true); //относительный путь
            //вторым параметром указывается true если необходимо сохранять предыдущую запись с файл
//            for (int i=0; i<rubai.length() ;i++ ) { //первый способ, каждый char через цикл
//                writer.write(rubai.charAt(i)); //здесь charAt проходит автоматический кастинг до int
//            }
            writer.write(rubai);
          //  writer.write(s);
            System.out.println("Done!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            writer.close(); //Никогда не забывайте закрывать стримы после использования.
        }
    }
}
