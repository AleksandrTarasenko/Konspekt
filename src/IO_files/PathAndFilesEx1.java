package IO_files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;
import java.util.Objects;

public class PathAndFilesEx1 {
    public static void main(String[] args) throws IOException {
        //Создание файла и директории
        Path filePath = Paths.get("test15.txt");
        Path directoryPath = Paths.get("C:\\Users\\HOTRIC-RIG2\\Desktop\\X");

        //Методы
        //имя файла/директории
        System.out.println("filePath.getFileName " + filePath.getFileName());
        System.out.println("directoryPath.getFileName " + directoryPath.getFileName());
        System.out.println("-------------------------------");
        //Путь к файлу/директории (у относительного нет)
        System.out.println("filePath.getParent " + filePath.getParent());
        System.out.println("directoryPath.getParent " + directoryPath.getParent());
        System.out.println("-------------------------------");
        //Рут - корневая папка
        System.out.println("filePath.getRoot " + filePath.getRoot());
        System.out.println("directoryPath.getRoot " + directoryPath.getRoot());
        System.out.println("-------------------------------");
        //Явл ли путь абсолютным?
        System.out.println("filePath.isAbsolute " + filePath.isAbsolute());
        System.out.println("directoryPath.isAbsolute " + directoryPath.isAbsolute());
        System.out.println("-------------------------------");
        //Какой абсолютный путь (полный)
        System.out.println("filePath.toAbsolutePath " + filePath.toAbsolutePath());
        System.out.println("directoryPath.toAbsolutePath " + directoryPath.toAbsolutePath());
        System.out.println("-------------------------------");
        //resolve - Объединяет два пути в один (не о файлах, т.к они не созданы)
        //в данном примере объединяем путь папки с файлом
        System.out.println("directoryPath.resolve(filePath) " + directoryPath.resolve(filePath));
        System.out.println("-------------------------------");
        //relativize - относительный путь
        //в данном примере показывает относительный путь адреса папки с файлом к другой директории с этим же направлением
        Path anotherPath = Paths.get("C:\\Users\\HOTRIC-RIG2\\Desktop\\X\\N\\Z\\test20.txt");
        System.out.println("directoryPath.relativize(anotherPath) " + directoryPath.relativize(anotherPath));
        System.out.println("-------------------------------");

        //exists - Существует ли данный файл/директория
        if (!Files.exists(filePath)) { //
            //createFile - создание файла
            Files.createFile(filePath);
        }
        if (!Files.exists(directoryPath)) {
            //createDirectory - создание директории
            Files.createDirectory(directoryPath);
        }
        //isReadable - имеются ли права на чтение
        System.out.println("Files.isReadable(filePath) " + Files.isReadable(filePath));
        System.out.println("-------------------------------");
        //isWritable - Имеются ли права на запись
        System.out.println("Files.isWritable(filePath) " + Files.isWritable(filePath));
        System.out.println("-------------------------------");
        //isExecutable - Имеются ли права на запуск файла
        System.out.println("Files.isExecutable(filePath) " + Files.isExecutable(filePath));
        System.out.println("-------------------------------");

        Path filePath2 = Paths.get("C:\\Users\\HOTRIC-RIG2\\IdeaProjects\\Konspekt\\test15.txt");
        //Пути совпадают?
        System.out.println("Files.isSameFile(filePath, filePath2) " + Files.isSameFile(filePath, filePath2));
        System.out.println("-------------------------------");
        //Размер файла
        System.out.println("Files.size(filePath) " + Files.size(filePath));
        System.out.println("-------------------------------");
        //получить информацию об атрибуте (Создание файла)
        System.out.println("Files.getAttribute(filePath, \"creationTime\") " + Files.getAttribute(filePath, "creationTime"));
        System.out.println("-------------------------------");
        //(Размер файла)
        System.out.println("Files.getAttribute(filePath, \"size\") " + Files.getAttribute(filePath, "size"));
        System.out.println("-------------------------------");
        //получить все атрибуты
        Map<String, Object> attributes = Files.readAttributes(filePath, "*");
        for (Map.Entry<String, Object> entry : attributes.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
