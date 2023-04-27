package IO_files.FileTreeEx;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class DeliteFileTree {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:\\Users\\HOTRIC-RIG2\\Desktop\\CopyHere");
        Files.walkFileTree(path, new MyFileVisitor3());
    }
}

class MyFileVisitor3 extends SimpleFileVisitor<Path> {
    @Override //File
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        System.out.println("Delete name " + file.getFileName());
        Files.delete(file); //Files.delete - удаление файла
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        System.out.println("Delete  Directory " + dir.getFileName());
        Files.delete(dir);
        return FileVisitResult.CONTINUE;
    }
}