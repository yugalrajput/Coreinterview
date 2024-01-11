package StreamAPI;

public class EmployeeSalary {
    int salary;
    String name;

    public EmployeeSalary(int salary, String name) {
        this.salary = salary;
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }
}
