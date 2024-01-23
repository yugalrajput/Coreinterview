package IO;

import java.io.Serializable;

public class StudentSerializable implements Serializable {
   // transient int id;
    int id;
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
