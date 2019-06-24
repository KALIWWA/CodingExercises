package InheritanceChallenge;

abstract class Vehicle {
    private String name;
    private String size;

    private int currentVelocity;
    private int currentDirection;

    Vehicle(String name, String size) {
        this.name = name;
        this.size = size;
        this.currentVelocity = 0;
        this.currentDirection = 0;
    }

    public void steer(int direction) {
        currentDirection += direction;
        System.out.println("Vehicle.steer(): Steering at " + currentDirection + " degrees.");
    }

    void move(int velocity, int direction) {
        currentVelocity = velocity;
        currentDirection = direction;
        System.out.println("Vehicle.move(): Moving at " + currentVelocity + " in direction "+ currentDirection);

    }

    void stop() {
        currentVelocity = 0;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    String getSize() {
        return size;
    }

    void setSize(String size) {
        this.size = size;
    }

    int getCurrentVelocity() {
        return currentVelocity;
    }

    void setCurrentVelocity(int currentVelocity) {
        this.currentVelocity = currentVelocity;
    }

    int getCurrentDirection() {
        return currentDirection;
    }

    void setCurrentDirection(int currentDirection) {
        this.currentDirection = currentDirection;
    }
}
