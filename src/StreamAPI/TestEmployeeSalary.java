package StreamAPI;

import java.util.ArrayList;
import java.util.List;

//salary >=20000;
public class TestEmployeeSalary {
    public static void main(String[] args) {
        List<EmployeeSalary> l = new ArrayList<EmployeeSalary>();

        l.add(new EmployeeSalary(25000, "Aman"));
        l.add(new EmployeeSalary(5000, "Hani"));
        l.add(new EmployeeSalary(10000, "Sumit"));
        l.add(new EmployeeSalary(15000, "Ravi"));
        l.add(new EmployeeSalary(30000, "Yugal"));

        l.stream().distinct().filter(e -> (e.getSalary() >= 20000)).forEach(e -> System.out.println(e.getSalary() + " " + e.getName()));


    }
}
