/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package le2inc.plant;

import java.util.List;
import le2inc.zombie.Zombie;

/**
 *
 * @author ADMIN
 */
public class CherryBomb extends Plant implements SplashAttacker{

    private static final int HP = 10;
    private static final int ATTACK = 150;
    private static final int SC = 150;
    
    private int turnCount = 2;
    
    public CherryBomb() {
        super(HP, ATTACK, SC);
        this.turnCount = turnCount;
    }
    public CherryBomb(int hp, int damage, int sunlightCost, int turnCount) {
        super(HP, ATTACK, SC);
        this.turnCount = turnCount;
    }
    
     public int turnCount(){
         return turnCount;
         
     }

    /*@Override
    public void attack(List<Zombie> defenders) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/

    @Override
    public void splashAttack(List<Zombie> defenders) {
        
    
    
        if (turnCount != 0){
            turnCount--;
        }
        else{
             
       
        for(Zombie defender  : defenders){
            defender.takeDamage(damage);
        }
        this.takeDamage(damage);
       
    
        }
    }
    
    @Override
       public void takeDamage(int damage) {
        // TODO
        
        super.takeDamage(damage);
       
    }


//    public void attack() {
//        // TODO
//        super.attack(this);
//         
//    }
   
}
