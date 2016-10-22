/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package le2inc.plant;

/**
 *
 * @author ADMIN
 */
public class Peashooter extends Plant {
    
    private static final int HP = 50;
    private static final int ATTACK = 20;
    private static final int SC = 100;
    
    /*
    private int hp;
    private int damage;
    private int sunlightCost; 
    */
    
    
   
    public Peashooter() {
        super(HP, ATTACK,SC );
        
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
