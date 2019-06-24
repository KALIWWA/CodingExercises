package Exercise36PoolArea;

public class Cuboid extends Rectangle {
    private double height = 0;

    public Cuboid(double width, double length, double height) {
        super(width, length);
        if (height >= 0) {
            this.height = height;
        }
    }

    private double getHeight() {
        return height;
    }

    public double getVolume() {
        return getArea() * getHeight();
    }
}
