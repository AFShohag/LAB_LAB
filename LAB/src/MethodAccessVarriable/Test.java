package MethodAccessVarriable;

public class Test {
     static int x = 190;

    static void show() {
        System.out.println(x); 
    }
     public static void main(String[] args) {
        Test.show();
    }
}
