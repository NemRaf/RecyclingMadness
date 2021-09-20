import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class InfoText here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InfoText extends Actor
{
    String text = " THE PURPOSE OF THESE MINIGAMES IS TO TEACH \n KIDDS HOW TO DISTINGUISH THE TRASH THAT\n THEY NEED TO RECYCLE.THIS HAPPENS\n WITH THREE DIFFERENT MINIGAMES . FIRST IS THE ROOM\nTHAT THEY NEED TO COLLECT PAPERS\n SECOND IS THE SEA THAT THEY NEED TO COLLECT PLASTIC \nAND LAST ONE IS THE ROAD WHERE THEY NEED TO COLLECT\n  RECYCLING TRASH BINS. ALL THIS GAMES\n AWARD POINTS IN A FUN AND COMPETITIVE ENVIRONMENT. ";
    GreenfootImage inner = new GreenfootImage(text, 48, Color.BLACK, new Color(0, 0, 0, 96));
    /**
     * Act - do whatever the InfoText wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    // create a gameover image the size of the world
    public void addedToWorld(World world)
    {
        int wide = world.getWidth();
        int high = world.getHeight();
        GreenfootImage outer = new GreenfootImage(wide, high);
        int leftX = (wide - inner.getWidth())/2;
        int topY = (high - inner.getHeight())/2;
        outer.drawImage(inner, leftX, topY);
        setImage(outer);
    }
 
    // the following is optional
    // remove pop-up when clicked on
    public void act()
    {
        if (Greenfoot.mouseClicked(this))
        {
             getWorld().removeObject(this);
        }
    }
}
