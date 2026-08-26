package Class_object;

public class App {
    public static void main(String[] args) {
        // Default constructor
        // Student A = new Student();
        // A.id = 1;
        // A.age = 14;
        // A.name = "chandani";
        // A.nos = 2;
        // System.out.println(A.name);
        // System.out.println(A.age);
        // System.out.println(A.id);
        // System.out.println(A.nos);
        // A.bunk();
        // A.study();
        // A.sleep();

        // Parameterised constructor
        Student A = new Student(1, 23, "Vikas", 5);

        System.out.println(A.name);
        System.out.println(A.age);
        System.out.println(A.id);
        System.out.println(A.nos);
        A.bunk();
        A.study();
        A.sleep();

        // copy constructor
        // Student B = new Student(A);

        // System.out.println(B.name);
        // System.out.println(B.age);
        // System.out.println(B.id);
        // System.out.println(B.nos);
        // B.sleep();
    }
}
