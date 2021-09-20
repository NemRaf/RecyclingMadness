import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlasticBin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PaperBin extends RecyclingBins
{
    int BIN_SPEED = 5;
    int plasticCounter;
    /**
     * Act - do whatever the PlasticBin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public PaperBin ()
    {
        GreenfootImage yb = getImage();
        yb.scale(80,80);
    }
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(),getY() - BIN_SPEED);
        }
        if(Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(),getY() + BIN_SPEED);
        }
        
    } 
    public int collect()
    {
        int totalScore = 0;
        for(Trash obj: getIntersectingObjects(Trash.class))
        {
            totalScore += obj.getScore();
            getWorld().removeObject(obj);
            Greenfoot.playSound("win.wav");
        }
        return totalScore;
    }
    
}
