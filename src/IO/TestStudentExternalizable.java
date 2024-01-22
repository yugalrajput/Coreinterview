package IO;

import java.io.*;

public class TestStudentExternalizable {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

        //Serialize....
        StudentExternalizable s = new StudentExternalizable(1, "YUGAL");
        ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("D://faltu//StudentEXT.txt"));
        o.writeObject(s);

        //Deserialize....
        ObjectInputStream i = new ObjectInputStream(new FileInputStream("D://faltu//StudentEXT.txt"));
        s = (StudentExternalizable) i.readObject();

        System.out.println(s.getId());
        System.out.println(s.getName());

        o.close();
        i.close();
    }
}
