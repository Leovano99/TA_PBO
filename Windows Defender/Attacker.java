import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Attacker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Attacker extends Actor
{
    /**
     * Act - do whatever the Attacker wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        dropbomb();
        moveAround();
    }    
    private int velocity = 10;//Gerak secara otomatis kekanan dan kekeiri
        
        public void moveAround()
        {
           move(velocity);
            if(isAtEdge())
            {
                velocity = velocity * -1;
            } 

    }
    
    private int enemyHealth = 3; //Nyawa dari Attacker COM   
    public void damageHealth(int amount)
        {
            if (enemyHealth > 1) 
           {
                enemyHealth -= amount;
               
            } else  {
                Greenfoot.playSound("off.wav"); 
                getWorld().addObject(new Win(), 199, 299);
                Greenfoot.stop();
            }  
            
        
    }
    
    private int shotTimer = 0;
    
    
    public void dropbomb()//Bom auto dari Attacker COM
    {
       if (Greenfoot.getRandomNumber(1000) < 100)
        {
            getWorld().addObject(new Missile(), getX(), getY() );
            Greenfoot.playSound("shot.wav");
        }
        
}
}
