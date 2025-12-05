package StaticMethodAccessVariable;

public class Test {
    static int x = 130;

    static void show() {
        System.out.println(x);  // OK
    }
     public static void main(String[] args) {
        Test.show();
    }
}
