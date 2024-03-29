package basics;

public class SwappingWithVariable {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        a = a + b;
        b = a - b;
        a = a - b;

        //without variable
        System.out.println("before swapping:a=" + a + ",b=" + b);


       /* //with variable
        int temp = a;
        a = b;
        b = temp;

        System.out.println("after swapping:a=" + a + ",b=" + b);
    */
    }

}
