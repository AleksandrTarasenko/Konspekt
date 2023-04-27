package IO_files;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {
    public static void main(String[] args) throws IOException {
        //Структура создания потока чтения FileReader reader= new FileReader(“file1.txt”);
        FileReader reader = null; //объявлять переменную лучше за пределами блока try/catch что бы она была видна в final
        try {
            reader = new FileReader("text2.txt");
            int character;
            while ((character = reader.read()) != -1) { //Здесь -1 это значение полученное при отсутствии символов в файле
                //пока каждый полученный символ не равен (!=) -1 идет чтение файла
                System.out.print((char) character);
            }
            System.out.println();
            System.out.println("Done!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            reader.close();//Никогда не забывайте закрывать стримы после использования.
        }
    }
}
