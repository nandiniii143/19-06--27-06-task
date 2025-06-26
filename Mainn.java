
class Vehicle {
    int speed = 0;

    void speedUp() {
        speed += 10;
        System.out.println("Vehicle speed increased to: " + speed + " km/h");
    }
}

class Car extends Vehicle {

    @Override
    void speedUp() {
        speed += 20;
        System.out.println("Car speed increased to: " + speed + " km/h");
    }
}


class Bicycle extends Vehicle {

    @Override
    void speedUp() {
        speed += 5;
        System.out.println("Bicycle speed increased to: " + speed + " km/h");
    }
}


public class Mainn {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        Car c = new Car();
        Bicycle b = new Bicycle();

        System.out.println("Vehicle");
        v.speedUp();

        System.out.println("Car");
        c.speedUp();

        System.out.println("Bicycle");
        b.speedUp();
    }
}
