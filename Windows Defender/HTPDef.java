import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HTPDef here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HTPDef extends World
{

    /**
     * Constructor for objects of class HTPDef.
     * 
     */
    public HTPDef()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(400, 600, 1); 
        Start start = new Start();
        addObject(start,199, 560);
    }
}
