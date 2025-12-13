package Super;
 
public class ParentX {
      ParentX() {
        System.out.println("Parent Constructor");
    }
}

class Child extends ParentX {
    Child() {
        super();
        System.out.println("Child Constructor");
    }

    public static void main(String[] args) {
        Child c = new Child();
    }
}
