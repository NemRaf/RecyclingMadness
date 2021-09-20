import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitleScreen extends World
{
    private Banner banner;
    private GreenfootSound music = new GreenfootSound("Title.mp3");
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(750, 540, 1); 
        //Greenfoot.playSound("Title.mp3");
        prepare();
        
        
    }
    
    public void act()
    {
        if (Greenfoot.isKeyDown("space"))
        {
            music.stop();
            MenuScreen menu = new MenuScreen();
            Greenfoot.setWorld(menu);
        }
        
    }
    public void prepare()
    {
        music.play();
        showText("Press space button to go to the menu",400,520);
        banner = new Banner();
        addObject(banner,200,40);
        
    }
}
    
