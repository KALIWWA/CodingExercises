package Exercise36PoolArea;

class Rectangle {
    private double width = 0;
    private double length = 0;

    Rectangle(double width, double length) {
        if (width >= 0) {
            this.width = width;
        }

        if (length >= 0) {
            this.length = length;
        }
    }

    private double getWidth() {
        return width;
    }

    private double getLength() {
        return length;
    }

    double getArea() {
        return getLength() * getWidth();
    }
}
