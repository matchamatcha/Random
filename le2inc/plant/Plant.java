package le2inc.plant;

import le2inc.Character;

/**
 * Class to generalize all types of plants.
 */
public abstract class Plant extends Character {

   private int sunlightCost;
    

  
     public Plant(int hp, int damage, int sunlightCost) {
        super(hp, damage);
        this.sunlightCost = sunlightCost;
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
