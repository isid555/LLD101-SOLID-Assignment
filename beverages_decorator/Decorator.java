package beverages_decorator;
public abstract class Decorator extends Beverage {
    public Beverage beverage; // java compostionon

    public  Decorator(Beverage beverage){
        this.beverage = beverage;
    }
}