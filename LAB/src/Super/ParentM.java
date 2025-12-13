package Super;

public class ParentM {
     void show() {
        System.out.println("Parent method");
    }
}
class Child extends ParentM {
    void show() {
        System.out.println("Child method");
    }

    void display() {
        show();       
       super.show();
    }
    public static void main(String[] args) {
        Child c = new Child();
        c.display();
    }
}