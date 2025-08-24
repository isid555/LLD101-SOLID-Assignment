public class UPI implements  PaymentProvider{
    @Override
    public String pay(double amount) {
        return "Paid via UPI " + amount;
    }
}
