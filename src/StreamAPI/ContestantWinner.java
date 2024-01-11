package StreamAPI;

public class ContestantWinner {
    String phoneno;
    String name;

    public ContestantWinner(String phoneno,String name){
        this.phoneno=phoneno;
        this.name=name;
    }

    public String getPhoneno(){
        return phoneno;
    }

    public String getName(){
        return name;
    }

}
