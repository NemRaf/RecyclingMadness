import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlasticBottle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlasticBottle extends Plastic
{
    /**
     * Act - do whatever the PlasticBottle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int PLASTIC_SPEED = -5;
    
    public PlasticBottle()
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
