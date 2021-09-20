import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GlassBottle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GlassBottle extends Glass
{
    /**
     * Act - do whatever the FaceMask wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int GLASS_SPEED = -5;
    int plasticCounter;
    public GlassBottle()
    {
        GreenfootImage yb = getImage();
        yb.scale(50,50);
        this.score =5;
    }
    /**
     * Act - do whatever the CoffeCup wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
        setLocation(getX() + GLASS_SPEED,getY());
        
        
    }
           
}
