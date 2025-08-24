public class OrderService {
//    double taxRate = 0.18;
    EmailClient email = new EmailClient();
    Tax tax = new Tax();
//    double totalWithTax(double subtotal) {
//        return subtotal + subtotal * taxRate;
//    }
    void checkout(String customerEmail, double subtotal) {
        double total = tax.totalWithTax(subtotal);
        email.send(customerEmail, "Thanks! Your total is " + total);
        System.out.println("Order stored (pretend DB).");
    }

    /*
    * SRP - violated
    * tac regime chanegs every yr
    * OrderService shld be resp for tax calc , not for modification
    * */
}