public class Point {
    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    private int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    private int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        int xA = x;
        int yA = y;
        int x0 = 0;
        int y0 = 0;
        return Math.sqrt((xA - x0) * (xA - x0) + (yA - y0) * (yA - y0));
    }

    public double distance(int xB, int yB) {
        int xA = x;
        int yA = y;

        return Math.sqrt((xA - xB) * (xA - xB) + (yA - yB) * (yA - yB));
    }

    public double distance(Point point) {
        int xA = x;
        int yA = y;
        int xB = point.getX();
        int yB = point.getY();

        return Math.sqrt((xA - xB) * (xA - xB) + (yA - yB) * (yA - yB));
    }

}
