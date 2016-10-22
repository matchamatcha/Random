package le2inc;

/**
 * Class to represent all characters on the board.
 */
public abstract class Character {
    public int hp;
    public int damage;

  
    public Character(int hp, int damage) {
        this.hp = hp;
        this.damage = damage;
        
    }

    // subtract damage points inflicted on this character
    public void takeDamage(int damage) {
        // TODO
        hp -= damage;
    }

    // applies damage to given defender
    public void attack(Character defender) {
        // TODO
        defender.hp -= damage; 
        
    }

    // returns true if alive
    public boolean isAlive() {
        return hp > 0 ? true : false;
    }

    public int getDamage() {
        return damage;
    }
}
