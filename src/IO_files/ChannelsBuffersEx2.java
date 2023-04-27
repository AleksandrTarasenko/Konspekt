package IO_files;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelsBuffersEx2 {
    public static void main(String[] args) {
    try (RandomAccessFile file = new RandomAccessFile("test5.txt", "r");
         FileChannel channel = file.getChannel();){


        ByteBuffer buffer = ByteBuffer.allocate(5);
        channel.read(buffer);
        buffer.flip();
        System.out.println((char)buffer.get());
        System.out.println((char)buffer.get());
        System.out.println((char)buffer.get());
    //rewind
        buffer.rewind(); //помещает курсор на позицию 0 для чтения
        System.out.println((char)buffer.get()); //прочитано 'а'
        System.out.println("--------------------------");
    //compact
        buffer.compact();// переносит непрочитанные байты в начало буфера и
          // переносит курсор для записи к первому байту после непрочитанных
        channel.read(buffer);
        buffer.flip();
        while (buffer.hasRemaining()) {
            System.out.println((char) buffer.get());
        }
        System.out.println("--------------------------");
        buffer.clear();
        channel.read(buffer);
        buffer.flip();
        System.out.println((char) buffer.get());
    //mark
        buffer.mark();//ставит отметку на последнем прочитанном элементе
        System.out.println((char) buffer.get());
        System.out.println((char) buffer.get());
    //reset
        buffer.reset();// возврат курсора на место где был поставлена отметка
        while (buffer.hasRemaining()) {
            System.out.println((char) buffer.get());
        }


    } catch (FileNotFoundException e) {
        throw new RuntimeException(e);
    } catch (IOException e) {
        throw new RuntimeException(e);
    }
    }
}
