public class SpeedBoost extends CharacterDecorator{
    private int bonus;
    public SpeedBoost(Character character , int bonus){
        super(character);
        this.bonus = bonus;
    }

    public int getSpeed(){
        return super.getSpeed() + bonus;
    }

    public void move(){
        System.out.println("Moving at boosted speed " + getSpeed() +
                " with sprite " + getSprite());
    }
}