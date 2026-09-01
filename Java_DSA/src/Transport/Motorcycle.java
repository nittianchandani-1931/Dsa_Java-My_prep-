package Transport;

public class Motorcycle extends Vehicle {

    public String handleBarStyle;

    public String suspensiontype;

    Motorcycle(String name, String model, int noOfTyres, String handleBarStyle, String suspensiontype) {
        super(name, model, noOfTyres);
        this.handleBarStyle = handleBarStyle;
        this.suspensiontype = suspensiontype;
    }

    public void wheelie() {
        System.out.println("Motorcycle is doing wheelieeee!" + name);
    }
}
