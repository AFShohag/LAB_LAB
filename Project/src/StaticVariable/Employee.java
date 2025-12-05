package StaticVariable;

public class Employee {
    static String companyName = "Google";  
    String name;

    Employee(String name) {
        this.name = name;
    }
    public static void main(String[] args) {
        Employee e1 = new Employee("X");
        Employee e2 = new Employee("Y");

        System.out.println(e1.companyName); 
        System.out.println(e2.companyName);
    }
}