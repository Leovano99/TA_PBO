import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Main extends World
{

    private GreenfootSound backgroundMusic = new GreenfootSound("start.wav");
    /**
     * Constructor for objects of class Main.
     * 
     */
    public Main()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(400, 600, 1); 
        Play start = new Play();
        addObject(start,199, 400);

    }
     public void started()
    {
        backgroundMusic.play();
    }
    
    public void stopped()
    {
        backgroundMusic.pause();
    }
}
