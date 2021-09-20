import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Plastic here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Plastic extends Trash
{
    int PLASTIC_SPEED = -3;
    int plasticCounter;
    
    /**
     * Act - do whatever the PlasticBin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        plasticCounter++;
        if(plasticCounter==500)
        {
            PLASTIC_SPEED -= 1;
            setLocation(getX() + PLASTIC_SPEED,getY());
        }else if(plasticCounter ==1000)
        {
            PLASTIC_SPEED -= 2;
            setLocation(getX() + PLASTIC_SPEED,getY());
        }else if(plasticCounter==1500)
        {
            PLASTIC_SPEED -= 2;
            setLocation(getX() + PLASTIC_SPEED,getY());
        }
        setLocation(getX() + PLASTIC_SPEED,getY());
    }
}
