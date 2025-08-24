public class Overnight extends Shipment{
    Overnight(String type, double w) {
        super("OVERNIGHT", w);
    }

    @Override
    double calcCost() {
        return 120 + (10*this.weightKg);
    }
}
