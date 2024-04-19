package IO;

import java.io.Serializable;

public class StudentSerializable implements Serializable {

    //es ka use ho rha hai to id 0 ho jayegiii
    transient int id;

    //or es ka use kroge to id 1 ho jayegii
    // int id;
    String name;

    public StudentSerializable(int id, String name) {
        super();
        this.id = id;
        this.name = name;

    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return id + name;
    }
}
