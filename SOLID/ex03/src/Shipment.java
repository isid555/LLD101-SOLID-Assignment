public abstract  class Shipment {
    String type; double weightKg;

    Shipment(String type, double w){
        this.type=type; this.weightKg=w;
    }

    abstract double calcCost();
}