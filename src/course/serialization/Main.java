package course.serialization;

import java.io.*;

public class Main {
    /*          Serialization                     De-Serialization
     * Object -> Byte-stream ->      File         -> Byte-stream -> Object
     * Object -> Byte-stream ->      Database     -> Byte-stream -> Object
     *
     *
     * 1 -> If a parent class has implemented Serializable interface then child class doesn't need to implement
     * 2 -> Only non-static data members will be Serialized during Serialization process
     * 3 -> Static data members and transient data members will not be Serialized during Serialization process
     * */
    public void serialization(Object v) throws IOException {
        FileOutputStream fileOut = new FileOutputStream("polo.ser");

        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(v);
        out.close();
        fileOut.close();

        System.out.println("Serialized");
    }

    public void main(String[] args) throws IOException, ClassNotFoundException {
        Vehicle polo = new Vehicle("Volkswagen", "Polo GT", 2021);
        serialization(polo);
    }
}
