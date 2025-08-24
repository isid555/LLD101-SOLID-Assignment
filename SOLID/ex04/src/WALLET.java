public class WALLET implements PaymentProvider{
    @Override
    public String pay(double amount) {
        return "Wallet debit " + amount;
    }
}
