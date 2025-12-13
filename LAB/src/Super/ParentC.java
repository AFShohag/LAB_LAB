package Super;

public class ParentC {
    ParentC(String name) {
        System.out.println("Parent Constructor: " + name);
    }
}

class Child extends ParentC {
    Child(String name) {
        super(name);  
        System.out.println("Child Constructor: " + name);
    }

    public static void main(String[] args) {
        Child c = new Child("SUII"+ "");
    }
}
