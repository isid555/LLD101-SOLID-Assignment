public class Card implements PaymentProvider{


    @Override
    public String pay(double amount) {
        return " Charged card:  +" + amount;
    }
}
