package IO_files;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelsBuffersEx {
    public static void main(String[] args) {
        //Канал и буфер позволяют читать информацию из файла с помощью буфера
        try (RandomAccessFile file = new RandomAccessFile("test10.txt", "rw");
        FileChannel channel = file.getChannel();) { //создаем канал

            ByteBuffer buffer = ByteBuffer.allocate(25); //Создаем буфер (Размер 25 байт)
            //allocate - размер буфера

            //если превысится буфер будет выброшено исключение и места для новых байт в буфере нет
            StringBuilder stix = new StringBuilder(); //создаем StringBuilder для возможности склеивания текста

            int byteRead = channel.read(buffer); //читаем с помощью канала в буфер
            //метод read возвращ. количество прочитанных байт

            while (byteRead > 0) {
                System.out.println("Read " + byteRead);

                buffer.flip(); // меняет режим запись на режим чтения в буфере

                while (buffer.hasRemaining()) { //hasRemaining - пока что есть читать
                    stix.append((char)buffer.get());
                }
                buffer.clear(); // переводит буфер в режим новой записи с начала буфера
                // (старые данные не удаляются, а переписываются поверх)

                byteRead = channel.read(buffer);
            }

    //Запись в файл ВАРИАНТ 1
            System.out.println(stix);

            String text = "\nVsem privet, ya ochen rad" +
                    "lkjlhdf asdkf njklas OWE" +
                    "psd, lx;dflk lfvmv';osjioxn mdnc";
            ByteBuffer buffer2 = ByteBuffer.allocate(text.getBytes().length);
            //Узнать размер буфера для всего текста (capacity), можно в параметр allocate внести переменную (text)
            // вызвать метод getBytes перенеся в массив байтов текст
            //вызвать метод length что бы узнать длину массива полученного с помощью getBytes
            buffer2.put(text.getBytes()); // методом put вносим текст в буфер
            buffer2.flip(); //переводим буфер в режим записи
            channel.write(buffer2); //записываем в канал из буфера

    //Запись и файл ВАРИАНТ 2
            ByteBuffer buffer3 = ByteBuffer.wrap(text.getBytes());
    //метод wrap позволяет исключить необходимость узнавать длину буфера, записывать буфер, делать flip буфера
            channel.write(buffer3);


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
