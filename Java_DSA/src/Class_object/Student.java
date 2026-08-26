package Class_object;

public class Student {

    // Attributes
    public int id;
    public int age;
    public String name;
    public int nos;

    // default constructor// atrributes ->garbage value
    public Student() {
        System.out.println("Student default constructor called");
    }
    // Parameterised constructor

    public Student(int id, int age, String name, int nos) {
        System.out.println("Student Parameterised constructor");
        this.id = id;
        this.age = age;
        this.name = name;
        this.nos = nos;
    }

    // copy constructor
    public Student(Student sourceobject) { // source obj-> A
        System.out.println("Student is copy constructor");
        this.id = sourceobject.id;
        this.age = sourceobject.age;
        this.name = sourceobject.name;
        this.nos = sourceobject.nos;
    }

    public void study() {
        System.out.println(name + " is Studying");
    }

    public void sleep() {
        System.out.println(name + " is Sleeping");
    }

    public void bunk() {
        System.out.println(name + " is Bunking");
    }

    public static void main(String[] args) {

    }
}
