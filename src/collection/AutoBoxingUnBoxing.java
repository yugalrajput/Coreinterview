package collection;

public class AutoBoxingUnBoxing {
    public static void main(String[] args) {
        //AutoBoxing
        int primitiveInt = 1;


        Integer WrapperInt = primitiveInt;

        System.out.println(primitiveInt);
        System.out.println(WrapperInt);


        //Unboxing
        Integer WrapperInt1 = new Integer(12);
        int primitiveInt1 = WrapperInt1;
        System.out.println(WrapperInt1);
        System.out.println(primitiveInt1);

    }


}
