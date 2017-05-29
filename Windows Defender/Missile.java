import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Missile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Missile extends Actor
{
    /**
     * Act - do whatever the Missile wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        movedown();
    }    
    public void movedown()
    {
            int ypos = getY(); //get the current position
          // check if missile hasn't reached the top
            if (ypos > 0)        
            {
               ypos = ypos + 8;  // reduce the ypos so it's "higher" than before
               setLocation(getX(),ypos); //set the new location = move UP
               // destroy enemy
               destroyEnemy();
            } else  {
                
                getWorld().removeObject(this);
            
            }
    }

    public void destroyEnemy()
    {
        Defender enemy = (Defender) getOneIntersectingObject(Defender.class);
      
        Target enemy1 = (Target) getOneIntersectingObject(Target.class);
        
        
        
        
       if (enemy !=null)
        {
        
            enemy.damageHealth(1);
            getWorld().removeObject(this);
        } else if (enemy1 !=null)
        {
        
           enemy1.damageHealth(1);
            getWorld().removeObject(this);
            
        }
        
    }
}
