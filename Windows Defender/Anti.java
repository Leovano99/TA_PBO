import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Anti here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Anti extends Actor
{
    /**
     * Act - do whatever the Anti wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        moveup();
    }    
    public void moveup()
    {
            int ypos = getY(); //get the current position
          // check if missile hasn't reached the top
            if (ypos > 0)        
            {
               ypos = ypos - 8;  // reduce the ypos so it's "higher" than before
               setLocation(getX(),ypos); //set the new location = move UP
               // destroy enemy
               destroyEnemy();
            } else  {
                
                getWorld().removeObject(this);
            
            }
    }

    public void destroyEnemy()
    {
        Attacker enemy2 = (Attacker) getOneIntersectingObject(Attacker.class);
      
        Missile enemy3 = (Missile) getOneIntersectingObject(Missile.class);
        
        
       if (enemy2 !=null)
        {
        
            enemy2.damageHealth(1);
            getWorld().removeObject(this);
        
    }else if (enemy3 !=null)
    {
        getWorld().removeObject(this);
    }
}
private Defender myShip;
    
   public Anti(Defender myShip)
    {
            this.myShip = myShip;
        
    }
}
