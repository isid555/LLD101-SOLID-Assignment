public class OrderController {
//    void create(String id){
//        SqlOrderRepository repo = new SqlOrderRepository(); // hard dependency
//        repo.save(id);
//        System.out.println("Created order: " + id);
//    }
    private final IOrderRepository repository;

    public OrderController(IOrderRepository repository) {
        this.repository = repository;
    }


    void create(String id){
        repository.save(id);
        System.out.println("Created order: " + id);
    }
}

/*
*
* DIP - violated
*
* It's not flexible: If you wanted to change the database from SQL to NoSQL, you would have to modify the OrderController class.

It's hard to test: You cannot easily test the OrderController's logic without a real SqlOrderRepository and an active database connection.
*
*
* */