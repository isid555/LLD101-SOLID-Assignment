public class Standard extends Shipment{

    Standard(String type, double w) {
        super("STANDARD", w);
    }

    @Override
    double calcCost() {
        return 50 + (5*this.weightKg);
    }


}
