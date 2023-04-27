package IO_files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class PathAndFilesEx3 {
    public static void main(String[] args) throws IOException {
        Files.delete(Paths.get("test10.txt"));
        //Создание файла с записью текста
        Path filepath = Paths.get("test10.txt");
        Files.createFile(filepath);
        String dialog = "-Privet\n-Privet\n-Kak dela?\n-Xorosho! Kak u tebya?"+
                "\n-Toje xorosho";
        Files.write(filepath, dialog.getBytes()); //текст можно записать через массив байтов (getBytes)

        //Чтение данных из текста
        List<String> list = Files.readAllLines(filepath);
        for (String s : list) {
            System.out.println(s);
        }
    }
}
