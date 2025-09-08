package beverages_decorator;

public class Sugar extends Decorator{
    public Sugar(Beverage beverage){
        super(beverage);
    }
    public int cost() {
        return beverage.cost() + 1;
    }
}