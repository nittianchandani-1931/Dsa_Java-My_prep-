package Transport;

public class Car extends Vehicle {

    public int noOfDoors;

    public String transmissionType;

    Car(String name, String model, int noOfTyres, int noOfDoors, String transmissionType) {
        super(name, model, noOfTyres); // basse class ka constructor call lr rhe h

        this.noOfDoors = noOfDoors;
        this.transmissionType = transmissionType;
        super.startEngine(); // immediate parent class ke methods call kr rhe h
    }

    public void startAC() {
        System.out.printf("AC started of :" + name);

    }
}
