/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package le2inc.zombie;

/**
 *
 * @author ADMIN
 */
public class FlagZombie extends Zombie {
    private static final int HP = 50;
    private static final int ATTACK = 25;

    public FlagZombie() {
        super(HP, ATTACK);
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
   

