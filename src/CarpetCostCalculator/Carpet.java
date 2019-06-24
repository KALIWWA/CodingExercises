package CarpetCostCalculator;

public class Carpet {
    private double cost = 0;

    public Carpet(double cost) {
        if (cost > 0) {
            this.cost = cost;
        }
    }

    double getCost() {
        return cost;
    }
}
