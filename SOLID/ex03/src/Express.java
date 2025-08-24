public class Express extends Shipment{

    Express(String type, double w) {
        super("EXPRESS", w);
    }

    @Override
    double calcCost() {
        return 80 + (8*this.weightKg);
    }
}
