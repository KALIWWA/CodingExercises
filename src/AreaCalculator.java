public class AreaCalculator {

    public static double area(double radius) {
        double area = -1;
        if (radius >= 0) {
            area = radius * radius * Math.PI;
        }
        return area;
    }

    public static double area(double x, double y) {
        double area = -1;
        if (x >= 0 && y >= 0) {
            area = x * y;
        }
        return area;
    }
}
