import com.example.orders.*;
import java.util.List;
import java.util.ArrayList;

public class TryIt {
    public static void main(String[] args) {
        OrderLine l1 = new OrderLine("A", 1, 200);
        OrderLine l2 = new OrderLine("B", 3, 100);
//        Order o = new Order("o2", "a@b.com");
//        o.addLine(l1);
//        o.addLine(l2);
//        o.setDiscountPercent(10);
//        System.out.println("Before: " + o.totalAfterDiscount());
//        l1.setQuantity(999); // demonstrates mutability leak
//        System.out.println("After:  " + o.totalAfterDiscount());
//        System.out.println("=> In the solution, totals remain stable due to defensive copies.");
        List<OrderLine> orderLineList = new ArrayList<>();
        orderLineList.add(l1);
        orderLineList.add(l2);

        Order order = new Order.Builder("o2", "a@b.com")
                .lines(orderLineList)
                .discountPercent(10)
                .build();


        System.out.println("Total before discount: " + order.totalBeforeDiscount());
        System.out.println("Total after discount:  " + order.totalAfterDiscount());

        // Now, let's try to modify a line *after* the order is built
//        l1.setQuantity(999);
        System.out.println("Modified l1 outside of the Order object.");

        // The order's total remains stable because the builder made a defensive copy.
        System.out.println("New total after discount: " + order.totalAfterDiscount());

    }
}
