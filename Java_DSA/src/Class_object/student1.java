package Class_object;

public class student1 {

    // Attributes
    private int id;
    private int age;
    private String name;
    private int nos;
    private String gf;

    public String getname() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int a) {
        // extra layer of authentication
        if (age < 100)
            this.age = a;
        return;
    }

    // default constructor// atrributes ->garbage value
    public student1() {
        System.out.println("Student default constructor called");
    }
    // Parameterised constructor

    public student1(int id, int age, String name, int nos, String gf) {
        System.out.println("Student Parameterised constructor");
        this.id = id;
        this.age = age;
        this.name = name;
        this.nos = nos;
        this.gf = gf;
    }

    // copy constructor
    public student1(student1 sourceobject) { // source obj-> A
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

    private void gfChatting() {
        System.out.println(name + " is chatting to his gf ");

    }
}
