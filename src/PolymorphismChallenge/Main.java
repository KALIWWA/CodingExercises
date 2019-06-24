package PolymorphismChallenge;

class Car {
    private boolean hasEngine;
    private int cylinders;
    private String name;
    private int wheels;

    Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.hasEngine = true;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String accelerate() {
        return "Car.startEngine()";
    }

    public String startEngine() {
        return "Car.accelerate()";
    }

    public String brake() {
        return "Car.brake()";
    }
}

class Mitsubishi extends Car {
    Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String accelerate() {
        return "Mitsubishi.accelerate()";
    }

    @Override
    public String startEngine() {
        return "Mitsubishi.startEngine()";
    }

    @Override
    public String brake() {
        return "Mitsubishi.brake()";
    }
}

class Ford extends Car {
    Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String accelerate() {
        return "Ford.accelerate()";
    }

    @Override
    public String startEngine() {
        return "Ford.startEngine()";
    }

    @Override
    public String brake() {
        return "Ford.brake()";
    }
}

class Holden extends Car {
    Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + ".accelerate()";
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + ".startEngine()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + ".brake()";
    }
}

public class Main {

    public static void main(String[] args) {
        Car car = new Car(8, "Base car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander 4WD");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        Ford Ford = new Ford(6, "F-150");
        System.out.println(Ford.startEngine());
        System.out.println(Ford.accelerate());
        System.out.println(Ford.brake());

        Holden Holden = new Holden(8, "Commodore");
        System.out.println(Holden.startEngine());
        System.out.println(Holden.accelerate());
        System.out.println(Holden.brake());

    }

}
