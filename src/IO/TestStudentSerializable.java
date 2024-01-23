package IO;

import java.io.*;

public class TestStudentSerializable {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        //Serialize.....
        ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("D://faltu//StudentSerili.txt"));

        StudentSerializable s = new StudentSerializable(1, "YUGAL RAJPUT");
        o.writeObject(s);
        o.close();

        //Deserialize....
        ObjectInputStream i = new ObjectInputStream(new FileInputStream("D://faltu//StudentSerili.txt"));
        s = (StudentSerializable) i.readObject();
        System.out.println(s.getId());
        System.out.println(s.getName());


    }
}
