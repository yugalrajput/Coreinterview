package oops;

public class ShallowClonee implements Cloneable {

    public int rollNo;

    public int getRollNo() {

        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
       return super.clone();
    }
}
