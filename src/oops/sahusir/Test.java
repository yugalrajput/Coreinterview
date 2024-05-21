package oops.sahusir;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {

        Employee e1 = new Employee();

        e1.firstName = "abc";
        e1.lastName = "xyz";

        e1.address1.city = "indore";
        e1.address1.state = "MP";
        e1.address1.country = "india";

        e1.address2.city = "lucknow";
        e1.address2.state = "UP";
        e1.address2.country = "india";

        e1.address3.city = "mumbai";
        e1.address3.state = "MH";
        e1.address3.country = "india";

        Employee e2 = (Employee) e1.clone();

        e2.firstName = "aaa";
        e2.lastName = "bbb";

        e2.address1.city = "a";
        e2.address1.state = "b";
        e2.address1.country = "c";

        e2.address2.city = "e";
        e2.address2.state = "f";
        e2.address2.country = "g";

        e2.address3.city = "p";
        e2.address3.state = "q";
        e2.address3.country = "r";

        System.out.println("Employee1 => ");
        System.out.println("firstname = " + e1.firstName);
        System.out.println("lastname = " + e1.lastName);

        System.out.println();
        System.out.println("address1 => ");
        System.out.println("city = " + e1.address1.city);
        System.out.println("state = " + e1.address1.state);
        System.out.println("country = " + e1.address1.country);

        System.out.println();
        System.out.println("address2 => ");
        System.out.println("city = " + e1.address2.city);
        System.out.println("state = " + e1.address2.state);
        System.out.println("country = " + e1.address2.country);

        System.out.println();
        System.out.println("address3 => ");
        System.out.println("city = " + e1.address3.city);
        System.out.println("state = " + e1.address3.state);
        System.out.println("country = " + e1.address3.country);

        System.out.println();
        System.out.println("Employee2 => ");
        System.out.println("firstname = " + e2.firstName);
        System.out.println("lastname = " + e2.lastName);

        System.out.println();
        System.out.println("address1 => ");
        System.out.println("city = " + e2.address1.city);
        System.out.println("state = " + e2.address1.state);
        System.out.println("country = " + e2.address1.country);

        System.out.println();
        System.out.println("address2 => ");
        System.out.println("city = " + e2.address2.city);
        System.out.println("state = " + e2.address2.state);
        System.out.println("country = " + e2.address2.country);

        System.out.println();
        System.out.println("address3 => ");
        System.out.println("city = " + e2.address3.city);
        System.out.println("state = " + e2.address3.state);
        System.out.println("country = " + e2.address3.country);

    }

}
