package oops;

public class DeepTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        DeepAddress address=new DeepAddress();
        address.setCity("indore");
        DeepStudent student=new DeepStudent();
        student.setRollNo(101);
        student.setAddrss(address);

        DeepStudent student1=(DeepStudent) student.clone();
        student1.setRollNo(102);
        student1.addrss.city = "bhopal";

        System.out.println(student.getRollNo());
        System.out.println(student.getAddrss().getCity());


        System.out.println("-----------------------------------------!!!!!!!!!");

        System.out.println(student1.getRollNo());
        System.out.println(student1.getAddrss().getCity());




    }




}
