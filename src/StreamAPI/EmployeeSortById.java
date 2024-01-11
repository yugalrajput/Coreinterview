package StreamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EmployeeSortById {
    public static void main(String[] args) {

        List<Employee> l = new ArrayList<Employee>();

        l.add(new Employee(8, "Ravi"));
        l.add(new Employee(5, "Sumit"));
        l.add(new Employee(10, "Aman"));
        l.add(new Employee(1, "Yugal"));

        l.stream().sorted(Comparator.comparingInt(Employee::getId)).forEach(e -> System.out.println(e.getId() + " " + e.getName()));


    }
}
