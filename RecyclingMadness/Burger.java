import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Burger here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Burger extends Foods
{
    int FOOD_SPEED = -7;
    
    public Burger()
    {
        GreenfootImage yb = getImage();
        yb.scale(50,50);
        this.score -= 3;
    }
    /**
     * Act - do whatever the CoffeCup wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
        setLocation(getX() + FOOD_SPEED,getY());
    }     
}
