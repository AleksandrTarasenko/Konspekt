package IO_files;

import java.io.*;

public class BufferedReaderBufferedWriter {
    public static void main(String[] args) {
        //BufferedReader/BufferedWriter - буфер для чтения и записи данных, с более редким обращением к файлу
        try (BufferedReader reader = new BufferedReader(
                new FileReader("text2.txt"));
             BufferedWriter writer =new BufferedWriter(
                     new FileWriter("test3.txt"));
        ){
//            int character;
//            while ((character = reader.read()) != -1) {
//                writer.write(character);
//            }
            //Можно читать построчно
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.write('\n');
            }
            System.out.println("Done!");


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
