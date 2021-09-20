import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RulesScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RulesScreen extends World
{

    private TextButton textbutton;
    private TextButton info;
    private GreenfootSound music = new GreenfootSound("inforules.mp3");
    /**
     * Constructor for objects of class InfoScreen.
     * 
     */
    public RulesScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(750, 525, 1);
        prepare();
    }
    public void prepare()
    {
        music.playLoop();
        textbutton = new TextButton("   Back  to menu screen   ", 40);
        addObject(textbutton, getWidth()/2, 460);
       
        showText(" THE RULES OF THIS GAME ARE SIMPLE. YOU HAVE TO\n CHOOSE  BETWEEN THREE STAGES (ROOM, ROAD , SEA). EACH \n STAGE REPRESENTS A DIFFERENT ENVIRONMENT THAT YOU WILL\n MOSTLY  ENCOUNTER THESE RECYCLING OBJECTS. THE GOAL IS\n TO EARN AS MANY POINTS AS YOU CAN GET BY COLLECTING IN \nYOUR TRASH BIN THE RECYCLING OBJECTS AND \n AVOIDING THE FOODS WHICH CAUSE YOU TO LOOSE POINTS.\n EACH RECYCLING ITEM GIVES +5 POINTS AND EACH FOOD\n GIVES -3 POINTS.YOU WILL LOOSE IF YOU GET NEGATIVE POINTS OR\n YOU LOOSE ALL YOUR REMAINING LIVES.\nYOU LOOSE LIVES BY LETTING RECYCLING\n OBJECTS PASS THROUGH\n YOUR RECYCLING BIN.    ",380,230);
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
