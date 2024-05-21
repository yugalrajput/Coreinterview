package oops.sahusir;

public class Address implements Cloneable {
    public String city;
    public String state;
    public String country;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
