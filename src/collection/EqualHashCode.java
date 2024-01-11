package collection;

public class EqualHashCode {
    public int id;
    public String name;
    public String salary;

    public EqualHashCode(int id, String name, String salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;

    }

    //hashcode will not apply in primitive data type
    @Override
    public int hashCode() {
        String s = this.id + this.name + this.salary;
        return s.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (getClass() != obj.getClass()) {
            return false;
        }
        if (!(obj instanceof EqualHashCode)) {
            return false;
        }
        EqualHashCode e = (EqualHashCode) obj;
        String st = this.id + this.name + this.salary;
        String st1 = e.id + e.name + e.salary;
        return st.equals(st1);
    }
}
