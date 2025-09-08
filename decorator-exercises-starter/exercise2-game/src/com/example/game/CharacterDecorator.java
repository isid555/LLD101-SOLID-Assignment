public class CharacterDecorator implements Character {
    public Character character ;
    public CharacterDecorator(Character character){
        this.character = character;
    }

    public void move(){
        character.move();
    }                // prints action including current speed/sprite
    public  void attack(){
        character.attack();
    }              // prints action including current damage/sprite
    public int getSpeed(){
        return character.getSpeed();
    }
    public  int getDamage(){
        return character.getDamage();
    }
    public String getSprite(){
        return character.getSprite();
    }

}