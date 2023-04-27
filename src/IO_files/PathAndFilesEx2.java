package IO_files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathAndFilesEx2 {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("test15.txt");
        Path directoryPath = Paths.get("C:\\Users\\HOTRIC-RIG2\\Desktop\\M");
        Path directoryBPath = Paths.get("C:\\Users\\HOTRIC-RIG2\\Desktop\\B");
        //копирование файла с тем же именем, если файл существует при перезаписи будет исключение,
        // для перезаписи использовать метод с доп параметром
        Files.copy(filePath, directoryPath.resolve(filePath));
        //копирование файла с новым именем
        Files.copy(filePath, directoryPath.resolve("test16.txt"));
        //Перезапись файла
        Files.copy(filePath, directoryPath.resolve(filePath), StandardCopyOption.REPLACE_EXISTING);
        //Копирование папки (без содержимого)
        Files.copy(directoryBPath, directoryPath.resolve("B"));
        System.out.println("Done");

        //Move (перемещение файла)
        Files.move(filePath, directoryPath.resolve("test15.txt"));
        //Переименовать (берем файл и переноси фаил с новым именем)
        Files.move(Paths.get("test10.txt"), Paths.get("test1.txt"));
        //удаление файла
        Files.delete(Paths.get("test5.txt"));
        Files.delete(directoryPath); //(нельзя удалить папку если она не пуста)
    }
}
