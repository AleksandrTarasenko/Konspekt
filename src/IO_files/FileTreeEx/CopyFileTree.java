package IO_files.FileTreeEx;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class CopyFileTree {
    public static void main(String[] args) throws IOException {
        Path source = Paths.get("C:\\Users\\HOTRIC-RIG2\\Desktop\\X");
        Path destination = Paths.get("C:\\Users\\HOTRIC-RIG2\\Desktop\\CopyHere");
        Files.walkFileTree(source, new  MyFileVisitor2(source, destination));
        System.out.println("Done");
    }
}

class MyFileVisitor2 extends SimpleFileVisitor<Path> {
    Path source;
    Path destination;

    public MyFileVisitor2(Path source, Path destination) {
        this.source = source;
        this.destination = destination;
    }

    @Override //Directory
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        Path newDestination = destination.resolve(source.relativize(dir));
        /*
        Метод preVisitDirectory копирует папку, которую видит перед собой.
        source.relativize(dir) - получает относительный путь, относительно папке которую копируем.
        dir - это копируемая папка (по относительному пути)
        Относительный путь содержит только имя папки.
        destination - имеет полный путь к папке в которую нужно скопировать.
        resolve - соеденияет путь destination и относительный путь source.relativize(dir)
        В результате папка копируется в новый адрес
         */
        Files.copy(dir, newDestination, StandardCopyOption.REPLACE_EXISTING);
        /*
        StandardCopyOption.REPLACE_EXISTING - позволяет перезаписать имя папки откуда копируем,
        т.к. мы явно её указываем какое имя папки копируем, однако имя конечной папки куда скопируются файлы
        отличается и метод StandardCopyOption.REPLACE_EXISTING позволяет перезаписать начальное имя
        копируемой папки на конечное.
         */
        return FileVisitResult.CONTINUE;
    }

    @Override //File
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        Path newDestination = destination.resolve(source.relativize(file)); //формула для файла такая же
        Files.copy(file, newDestination, StandardCopyOption.REPLACE_EXISTING);
        return FileVisitResult.CONTINUE;
    }
}