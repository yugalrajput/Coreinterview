package collection.Comparator;

public class ComparatorEx {
    public int id;

    public String name;
    public int salary;

    public ComparatorEx(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return id+ "  " + name+ "  " + salary;
    }
}
