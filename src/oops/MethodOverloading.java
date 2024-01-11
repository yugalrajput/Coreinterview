package oops;

public class MethodOverloading {
    public void movie(int i){
        System.out.println("This is first movie"+i);
    }
    public void movie(int i ,int j){
        System.out.println("This is secound movie"+j);
    }

    public static void main(String[] args) {
        MethodOverloading m = new MethodOverloading();
        m.movie(10);
        m.movie(20,30);
    }
}
