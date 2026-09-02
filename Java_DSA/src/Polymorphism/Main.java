package Polymorphism;

public class Main {
    public static void main(String[] args) {
        // calculator calc = new calculator();
        // System.out.println(calc.add(5, 10));
        // System.out.println(calc.add(5.5, 10.5));

        // Run time polymorphiosm
        // Upcasting
        circle c = new circle();
        // c.draw();
        doDrawingStuff(c);

        // Rectangle r = new Rectangle();
        // // r.draw();

    //     // Downcasting
    //     circle c = new circle();
    //     doDrawingStuff(c);
         
    //     Rectangle r= new Rectangle();
    //     doDrawingStuff(r);
    }

    public static void doDrawingStuff(shape s) {
        s.draw();  //polymorphic


        circle c = (circle) s; //Downcasting
        c.personal();
    }
}
