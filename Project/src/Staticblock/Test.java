package Staticblock;

public class Test {
    static {
        System.out.println("Static block");
    }

    Test() {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        new Test();
        new Test();
    }
}

