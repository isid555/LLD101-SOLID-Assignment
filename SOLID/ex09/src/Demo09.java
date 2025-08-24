public class Demo09 {
    public static void main(String[] args) {
//        new OrderController().create("ORD-1");
        IOrderRepository sql = new SqlOrderRepository();
        IOrderRepository mongoDb = new MongoDBOrderRepository();
        OrderController orderController1 = new OrderController(sql);
        OrderController orderController2 = new OrderController(mongoDb);
        orderController1.create("1");
        orderController2.create("2");
    }
}
