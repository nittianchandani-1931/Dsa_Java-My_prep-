package Abstraction;

abstract class Bird {

    abstract void fly();

    abstract void eat();
}

class Sparrow extends Bird {
    @Override
    void fly() {
        System.out.println("Sparrow can fly");
    }

    @Override
    void eat() {
        System.out.println("Sparrow eats seeds");
    }
}

class Crow extends Bird {
    @Override
    void fly() {
        System.out.println("Crow can fly");
    }

    @Override
    void eat() {
        System.out.println("Crow eats in different way");
    }
}

public class Main {
    public static void doBirdStuff(Bird b) {
        b.fly();
        b.eat();
    }

    public static void main(String[] args) {
        Bird b = new Sparrow();
        doBirdStuff(new Sparrow());
        doBirdStuff(new Crow());

        // b.fly();
        // b.eat();
        // b = new Crow();
        // b.fly();
        // b.eat();
    }
}