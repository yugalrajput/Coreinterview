package StreamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeSortByName {
    public static void main(String[] args) {
        List<Employee> l = new ArrayList<Employee>();

        l.add(new Employee(5, "Ravi"));
        l.add(new Employee(3, "Sumit"));
        l.add(new Employee(9, "Aman"));
        l.add(new Employee(1, "Yugal"));

        l.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList()).forEach(e -> System.out.println(e.getId() + " " + e.getName()));

    }
}
