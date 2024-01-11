package oops;

public class DeepStudent implements Cloneable{
    public int rollNo;

    public DeepAddress addrss;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public DeepAddress getAddrss() {
        return addrss;
    }

    public void setAddrss(DeepAddress addrss) {
        this.addrss = addrss;
    }

    @Override
    public DeepStudent clone() throws CloneNotSupportedException{
       DeepStudent student = (DeepStudent) super.clone();
       student.addrss=(DeepAddress) addrss.clone();
       return student;
    }
}
