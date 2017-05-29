import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class Multi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Multi extends World
{
    private GreenfootSound backgroundMusic = new GreenfootSound("start.wav");
    /**
     * Constructor for objects of class Multi.
     * 
     */
    public Multi()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(400, 600, 1); 
        prepare1();
    }
    private Counter scoreBoard;
    
    public Counter getCounter()
    {
        return scoreBoard;
    }

    public void started()
    {
        backgroundMusic.play();
    }
    
    public void stopped()
    {
        backgroundMusic.pause();
    }
   
    private void prepare1()
    {
        Attacker player1 = new Attacker();
        addObject(player1,200,100);
        
        Defender player2 = new Defender();
        addObject(player2,200,500);
        
        Target castle1 = new Target();
        addObject(castle1,200,580);
        
        scoreBoard = new Counter();
        addObject(scoreBoard,50,570);
        
        
        
        
        
        
         
    }
}
