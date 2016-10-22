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
public class Sunflower extends Plant implements Producer{

    
    private static final int HP = 30;
    private static final int ATTACK = 0;
    private static final int SC = 50;
    
     
    public Sunflower() {
        super(HP, ATTACK, SC);
        
    }
    
       public void takeDamage(int damage) {
        // TODO
        
        super.takeDamage(damage);
       
    }


  
    
    @Override
     public int produce(){
         
         return 100;
         
     }
     
     
}
