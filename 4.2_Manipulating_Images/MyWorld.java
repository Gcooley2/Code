import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private static final GreenfootImage bgImage = new GreenfootImage(600,400);
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        setBackground(bgImage);
        populate();
    }
   
    public void populate()
    {
        Comet c = new Comet();
        addObject(c, 100, 200);
        Planet p = new Planet();
        addObject(p, 200, 200);
        Rocket r = new Rocket();
        addObject(r, 300, 200);
    }      
}
