public class GoldenAura extends CharacterDecorator{
    public GoldenAura(Character character){
        super(character);
    }

    public String getSprite(){
        return "golden_"+super.getSprite();
    }
    public int getSpeed(){
        return super.getSpeed() + 2;
    }
    public int getDamage(){
        return super.getDamage() +5;
    }


    public void move() {
        System.out.println("[Golden Aura] Radiating power...");
        super.move();
    }


    public void attack() {
        System.out.println("[Golden Aura] Glowing strike!");
        super.attack();
    }

}