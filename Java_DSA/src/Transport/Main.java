package Transport;

public class Main {
    public static void main(String[] args) {

        // Car car = new Car("BMW", "X5", 4, 4, "Automatic");
        // car.startEngine();
        // car.startAC();
        // car.stopEngine();
        Motorcycle Bullet = new Motorcycle("RoyalEnfield", "Thunderbird", 2, "U", "Spring");
        Bullet.startEngine();
        Bullet.wheelie();
        Bullet.stopEngine();

    }
}
