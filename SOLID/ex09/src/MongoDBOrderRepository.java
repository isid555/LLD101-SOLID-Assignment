public class MongoDBOrderRepository implements IOrderRepository{
    @Override
    public void save(String id) {
        System.out.println("Saved order " + id + " to MongoDb");
    }
}
