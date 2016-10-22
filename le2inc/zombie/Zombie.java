package le2inc.zombie;

import le2inc.Character;

/**
 * Class to generalize all types of zombies.
 */
public abstract class Zombie extends Character {

    public Zombie(int hp, int damage) {
        super(hp, damage);
    }
    
    
    
        public void takeDamage(int damage) {
        // TODO
       
        super.takeDamage(damage);
       
    }


    public void attack() {
        // TODO
        super.attack(this);
         
    }

}
