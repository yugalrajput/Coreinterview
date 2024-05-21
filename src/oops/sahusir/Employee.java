package oops.sahusir;

public class Employee implements Cloneable {
    public String firstName;
    public String lastName;

    public Address address1 = new Address();
    public Address address2 = new Address();
    public Address address3 = new Address();

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Employee e = (Employee) super.clone();
        e.address1 = (Address) address1.clone(); // address1 deep cloning
        e.address2 = (Address) address2.clone(); // address2 deep cloning
        e.address3 = (Address) address3.clone(); // address3 deep cloning
        return e;
    }
}


