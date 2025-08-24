public class Demo03 {
    public static void main(String[] args) {
//        System.out.println(new ShippingCostCalculator().cost(new Shipment("EXPRESS", 2.0)));
        Express express = new Express("EXPRESS", 2.0);
        System.out.println(new ShippingCostCalculator().cost(express));
    }
}
