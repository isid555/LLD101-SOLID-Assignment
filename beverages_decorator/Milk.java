package beverages_decorator;
public class Milk extends Decorator{
    public Milk(Beverage beverage){
        super(beverage);
    }

    public int cost(){
        return beverage.cost() + 2;
    }
}