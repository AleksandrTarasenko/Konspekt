package IO_files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamFileOutputStream {
    public static void main(String[] args) {
        try (FileInputStream inputStream = new FileInputStream("C:\\Users\\HOTRIC-RIG2\\Desktop\\162821.jpg");
             FileOutputStream outputStream = new FileOutputStream("Pictur2.jpg")
        ){
            int i;
            while ((i = inputStream.read()) != -1) {
                outputStream.write(i);
            }
            System.out.println("Done!");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
