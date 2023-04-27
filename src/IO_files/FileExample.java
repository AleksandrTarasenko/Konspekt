package IO_files;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class FileExample {
    public static void main(String[] args) throws IOException {
        File file = new File("text2.txt");
        File folder = new File("C:\\Users\\HOTRIC-RIG2\\Desktop\\A");
        System.out.println("file.getAbsolutePath() " + file.getAbsolutePath()); //Абсолютный путь
        System.out.println("folder.getAbsolutePath() " + folder.getAbsolutePath()); //Абсолютный путь
        File file2 = new File("C:\\Users\\HOTRIC-RIG2\\Desktop\\A\\text20.txt");
        File folder2 = new File("C:\\Users\\HOTRIC-RIG2\\Desktop\\B");
        System.out.println("--------------------------------------------");
        //isAbsolute
        System.out.println("file.getAbsolutePath() " + file.isAbsolute()); //Абсолютный путь?
        System.out.println("folder.getAbsolutePath() " + folder.isAbsolute()); //Абсолютный путь?
        System.out.println("--------------------------------------------");
        //isDirectory
        System.out.println("file.getAbsolutePath() " + file.isDirectory()); //явл ли это директорией?
        System.out.println("folder.getAbsolutePath() " + folder.isDirectory()); //явл ли это директорией?
        System.out.println("--------------------------------------------");
        //exists
        System.out.println("file.exists() " + file.exists()); // файл существует?
        System.out.println("folder.exists() " + folder.exists()); // файл существует?
        System.out.println("file2.exists() " + file2.exists()); // файл существует?
        System.out.println("folder2.exists() " + folder2.exists()); // файл существует?
        System.out.println("--------------------------------------------");

        System.out.println("file2.exists() " + file2.createNewFile()); // Создать новый файл
        System.out.println("folder2.exists() " + folder2.mkdir()); // Создать новую папку
        System.out.println("file.exists() " + file.createNewFile());
        System.out.println("--------------------------------------------");

        //length
        System.out.println("file2.length() " + file2.length()); // размер файла
        System.out.println("folder.length() " + folder.length()); // размер папки этим способом не узнать, необходимо создавать метод
        System.out.println("--------------------------------------------");


        System.out.println("folder.delete() " + folder.delete()); // удаление папки(нельзя удалить если не пуста)
        System.out.println("folder2.delete() " + folder2.delete()); // удаление папки
        System.out.println("file2.delete() " + file2.delete()); // удаление файла
        System.out.println("--------------------------------------------");

        File [] files = folder.listFiles(); //Возвращает массив типов File
        System.out.println(Arrays.toString(files));
        System.out.println("--------------------------------------------");

        System.out.println("file2.isHidden() " + file2.isHidden()); // скрыта ли папка
        System.out.println("file2.isHidden() " + file2.canRead()); // есть ли доступ на чтение
        System.out.println("file2.isHidden() " + file2.canWrite());// есть ли доступ на запись
        System.out.println("file2.isHidden() " + file2.canExecute()); // можем ли мы запустить этот файл
        System.out.println("--------------------------------------------");
    }
}
