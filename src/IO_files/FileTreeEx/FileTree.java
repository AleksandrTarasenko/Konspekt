package IO_files.FileTreeEx;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class FileTree {
    //Метод Files.walkFileTree(Path start, FileVisitor visitor) используется для обхода дерева файлов

    //Логика обхода дерева файлов заключается в классе, имплементирующем интерфейс FileVisitor

    //preVisitDirectory - срабатывает перед обращением к элементам папки;
    //visitFile - срабатывает при обращении к фалу;
    //postVisitDirectory - срабатывает после обращения ко всем элементам папки;
    //visitFileFailed - срабатывает когда файл по каким-то причинам недоступен

    // SimpleFileVisitor - позволяет использовать только 1 метод из вышеперечисленных
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:\\Users\\HOTRIC-RIG2\\Desktop\\X");
        Files.walkFileTree(path, new MyFileVisitor());
    }
}

class MyFileVisitor implements FileVisitor<Path> {

    @Override //Directory
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        System.out.println("Enter to Directory " + dir);
        return FileVisitResult.CONTINUE;

        // FileVisitResult
        //Значения enum FileVisitResult:
        // использующиеся в FileVisitResult в качестве return следующего действия после выполнения кода по FileVisitResult
        //CONTINUE – означает, что нужно продолжать обход по файлам;
        //TERMINATE – означает, что нужно немедленно прекратить обход по файлам;
        //SKIP_SUBTREE – означает, что в данную директорию заходить не надо;
        //SKIP_SIBLINGS – означает, в данной директории продолжать обход по файлам не нужно.
    }

    @Override //File
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        System.out.println("File name " + file.getFileName());
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        System.out.println("Error while visiting file: " + file.getFileName());
        return FileVisitResult.TERMINATE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        System.out.println("Exit from Directory " + dir);
        return FileVisitResult.CONTINUE;
    }
}