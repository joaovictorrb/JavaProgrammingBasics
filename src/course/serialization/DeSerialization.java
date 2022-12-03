package course.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Vehicle polo = null;
        FileInputStream fileInput = new FileInputStream("polo.ser");
        ObjectInputStream in = new ObjectInputStream(fileInput);
        polo = (Vehicle) in.readObject();
        in.close();
        fileInput.close();
        System.out.println("DeSerialized");
        System.out.println(polo.model);
    }
}
