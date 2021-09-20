import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MenuScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MenuScreen extends World
{
    private TextButton textbutton1;
    private TextButton textbutton2;
    private TextButton textbutton3;
    private TextButton textbutton4;
    private Banner banner;
    private TextButton textbutton5;
    private GreenfootSound music = new GreenfootSound("Title.mp3");
    /**
     * Constructor for objects of class MenuScreen.
     * 
     */
    public MenuScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(750, 525, 1); 
        prepare();
    }
    public void act()
    {
       
        if(Greenfoot.mouseClicked(textbutton1))
        {
            music.stop();
            Room room = new Room();
            Greenfoot.setWorld(room);
        }
        if(Greenfoot.mouseClicked(textbutton2))
        {
            music.stop();
            Road road = new Road();
            Greenfoot.setWorld(road);
        }
        if(Greenfoot.mouseClicked(textbutton3))
        {
            music.stop();
            Sea sea = new Sea();
            Greenfoot.setWorld(sea);
        }
        if(Greenfoot.mouseClicked(textbutton4))
        {
            music.stop();
            InfoScreen info = new InfoScreen();
            Greenfoot.setWorld(info);
            
        }
        if(Greenfoot.mouseClicked(textbutton5))
        {
            music.stop();
            RulesScreen rules = new RulesScreen();
            Greenfoot.setWorld(rules);
            
        }
    }
    public void prepare()
    {
        music.play();
        banner = new Banner();
        addObject(banner,250,220);
        textbutton1 = new TextButton("   Room   ", 40);
        addObject(textbutton1, 200, 450);
        textbutton2 = new TextButton( "  Road  ", 40);
        addObject(textbutton2, 350, 450);
        textbutton3 = new TextButton("   Sea   ", 40);
        addObject(textbutton3, 480, 450);
        textbutton4 = new TextButton("   Info   ", 40);
        addObject(textbutton4, 400, 500);
        textbutton5 = new TextButton ("   Rules   ",40);
        addObject(textbutton5,250,500);
    }
}
