
public class Demo04 {
    public static void main(String[] args) {
//        System.out.println(new PaymentService().pay(new Payment("UPI", 499)));
        UPI upi = new UPI();
        System.out.println(new PaymentService().pay(upi , 499));
    }
}
