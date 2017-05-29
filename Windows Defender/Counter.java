import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class Counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Counter extends Actor
{
    /**
     * Act - do whatever the Counter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    private int totalCount = 0;
   
   public void bumpCount(int amount)
   {   
       totalCount = totalCount + amount;
       setImage(new GreenfootImage("Virus:" + totalCount, 30, Color.WHITE, Color.GRAY));    
       
            
        }
     
        
        
   public Counter()
   {
       setImage(new GreenfootImage("Virus: 0", 30, Color.WHITE, Color.GRAY)); 
       
    }
    
    
    public int getScore()
    {
        return totalCount;
    }
}
