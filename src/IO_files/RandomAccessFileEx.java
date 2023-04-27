package IO_files;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileEx {
    public static void main(String[] args) {
        //RandomAccessFile - позволяет записывать и читать текст из/в файл
      try (RandomAccessFile file
              =new RandomAccessFile( "test10.txt", "rw")) {
          //в параметрах r - чтение, w - Запись, rw - чтение + запись

          int a = file.read(); //read читает побайтно(по букве)
          System.out.println((char) a);
         String s1 = file.readLine(); //readLine читает построчно
          System.out.println(s1);

          file.seek(101); //  seek перемещает курсор(pointer) на определенное количество байтов
          String s2 = file.readLine();
          System.out.println(s2);


          long position = file.getFilePointer(); //получить байт нахождения курсора
          System.out.println(position);

//          file.writeBytes("Privet"); //записывает данные поверх прежних
          file.seek(file.length()-1); // конец текста
          file.writeBytes("\n\t\t\t\t end text");




      } catch (FileNotFoundException e) {
          throw new RuntimeException(e);
      } catch (IOException e) {
          throw new RuntimeException(e);
      }
    }
}
