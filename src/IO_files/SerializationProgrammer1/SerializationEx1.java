package IO_files.SerializationProgrammer1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializationEx1 {
    public static void main(String[] args) {
        List<String> employee = new ArrayList<>();
        employee.add("Aleksandr");
        employee.add("Ivan");
        employee.add("Elena");
        try (ObjectOutputStream outputStream =new ObjectOutputStream(
                new FileOutputStream("employees1.bin")
        )

                ) {
            outputStream.writeObject(employee);
            System.out.println("Done!");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
