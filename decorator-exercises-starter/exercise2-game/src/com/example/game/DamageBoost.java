public class DamageBoost extends CharacterDecorator{
    private int bonus;
    public DamageBoost(Character character , int bonus){
        super(character);
        this.bonus = bonus;
    }
    public int getDamage(){
        return super.getDamage() + bonus;
    }

    public void attack(){
        System.out.println("Attacking with boosted damage " + getDamage() +
                " using sprite " + getSprite());
    }
}