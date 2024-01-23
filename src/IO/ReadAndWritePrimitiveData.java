package IO;

import java.io.*;

public class ReadAndWritePrimitiveData {
    public static void main(String[] args) throws IOException {
        DataOutputStream o = new DataOutputStream(new FileOutputStream("D://faltu//primitivedata.txt"));

        o.writeInt(0);
        o.writeBoolean(true);
        o.writeDouble(42.36);
        o.writeChar('Y');

        o.close();
        System.out.println("Data Added........");

        DataInputStream i = new DataInputStream(new FileInputStream("D://faltu//primitivedata.txt"));

        System.out.println(i.readInt());
        System.out.println(i.readBoolean());
        System.out.println(i.readDouble());
        System.out.println(i.readChar());

        i.close();
    }
}
