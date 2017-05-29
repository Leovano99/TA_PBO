import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Target here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Target extends Actor
{
    /**
     * Act - do whatever the Target wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
     private int enemyHealth = 10; //give your enemy initiale heath of 1     
    public void damageHealth(int amount)
        {
            if (enemyHealth > 1) //if not dead yet
           {
                enemyHealth -= amount;
               
            } else {
                Greenfoot.playSound("off.wav"); 
                getWorld().addObject(new GameOver(), 199, 299);
                Greenfoot.stop();
            }
        
    }
}
