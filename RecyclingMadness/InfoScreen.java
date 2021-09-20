import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class InfoScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InfoScreen extends World
{
    private TextButton textbutton;
    private TextButton info;
    private GreenfootSound music = new GreenfootSound("inforules.mp3");
    /**
     * Constructor for objects of class InfoScreen.
     * 
     */
    public InfoScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(750, 525, 1);
        prepare();
    }
    public void prepare()
    {
        music.play();
        textbutton = new TextButton("   Back  to menu screen   ", 40);
        addObject(textbutton, getWidth()/2, 460);
        //info = new TextButton(" THE PURPOSE OF THESE MINIGAMES IS TO TEACH \n KIDDS HOW TO DISTINGUISH THE TRASH THAT\n THEY NEED TO RECYCLE.THIS HAPPENS\n WITH THREE DIFFERENT MINIGAMES . FIRST IS THE ROOM\nTHAT THEY NEED TO COLLECT PAPERS\n SECOND IS THE SEA THAT THEY NEED TO COLLECT PLASTIC \nAND LAST ONE IS THE ROAD WHERE THEY NEED TO COLLECT\n  RECYCLING TRASH BINS. ALL THIS GAMES\n AWARD POINTS IN A FUN AND COMPETITIVE ENVIRONMENT. ",30);
        //addObject(info,200,50);
        showText(" THE PURPOSE OF THESE MINIGAMES IS TO TEACH \n KIDDS HOW TO DISTINGUISH THE TRASH THAT\n THEY NEED TO RECYCLE.THIS HAPPENS\n WITH THREE DIFFERENT MINIGAMES . FIRST IS THE ROOM\nTHAT THEY NEED TO COLLECT PAPERS,\n SECOND IS THE SEA THAT THEY NEED TO COLLECT PLASTIC \nAND LAST ONE IS THE ROAD WHERE THEY NEED TO COLLECT\n  GLASS. ALL THIS GAMES\n AWARD POINTS IN A FUN AND COMPETITIVE ENVIRONMENT. ",350,170);
    }
    public void act()
    {
        if(Greenfoot.mouseClicked(textbutton))
        {
            music.stop();
            MenuScreen menu = new MenuScreen();
            Greenfoot.setWorld(menu);
            
        }
    }
}
