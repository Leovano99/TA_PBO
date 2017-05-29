import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Defender here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Defender extends Actor
{
    /**
     * Act - do whatever the Defender wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        playerMovement();
        shoot();
    }    
      public void playerMovement()
    {
        
        if ( Greenfoot.isKeyDown("right") )
        {   
            move(10); 
        }
        if ( Greenfoot.isKeyDown("left") )
        {   
            move(-10);
        }

    }
    
    private int enemyHealth = 1; //give your enemy initiale heath of 1     
    public void damageHealth(int amount)
        {
            if (enemyHealth > 1) //if not dead yet
           {
                enemyHealth -= amount;
               
            } else  {
                 givePoints(1);
                 
            }  
            
        
    } 
    private int shotTimer = 0;
    public void shoot()
    {
        
        if (shotTimer > 0) {
            shotTimer = shotTimer -1;
        }else if(Greenfoot.isKeyDown("up") )
        {            
            Greenfoot.playSound("shot.wav");
            getWorld().addObject(new Anti(this), getX(), getY() -40);
            shotTimer = 100;
        }
    }
    
    public void givePoints(int points)
    {
        Multi spaceWorld = (Multi) getWorld(); 
        Counter score = spaceWorld.getCounter();
        score.bumpCount(points);
        
    }
}
