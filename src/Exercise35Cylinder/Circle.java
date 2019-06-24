package Exercise35Cylinder;

public class Circle {
    private double radius;

    Circle(double radius) {
        if (radius < 0) {
            this.radius = 0;
        } else {
            this.radius = radius;
        }
    }

    public double getRadius() {
        return radius;
    }

    double getArea() {
        return (radius * radius * Math.PI);
    }
}
