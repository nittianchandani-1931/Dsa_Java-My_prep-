package Polymorphism;

public class circle extends shape {
    @Override
    public void draw(){
        System.out.println("Circle drawing....");
    }


    public void personal(){
        System.out.println("Personal method of circle");
    }
}
