import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CoffeCup here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CoffeCup extends Plastic
{
    int PLASTIC_SPEED = -5;
    public CoffeCup()
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
        
        setLocation(getX() + PLASTIC_SPEED,getY());
        
        
    }  
    
}
