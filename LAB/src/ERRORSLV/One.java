package ERRORSLV;

public class One {
     
    int n=15;
    String name;
    static int m=30;
    One(String name){
        this.name=name;
    }
    void firstMethod(){
        System.out.println(n+" "+m);
        System.out.println("non Static Metod");
    }
    static void secondMethod(){
        System.out.println("Static Metod");
    }
    public static void main(String[]args){
        One obj=new One("Hello");
        obj.firstMethod();
        One.secondMethod();
    }
}