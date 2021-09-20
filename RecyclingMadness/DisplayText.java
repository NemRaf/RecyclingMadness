import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DisplayText here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DisplayText extends Actor
{
    /**
     * Act - do whatever the DisplayText wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private String objectText;
    String Ttext = " KIDDS HOW TO DISTINGUISH THE TRASH THAT\n THEY NEED TO RECYCLE.THIS HAPPENS\n WITH THREE DIFFERENT MINIGAMES . FIRST IS THE ROOM\nTHAT THEY NEED TO COLLECT PAPERS\n SECOND IS THE SEA THAT THEY NEED TO COLLECT PLASTIC \nAND LAST ONE IS THE ROAD WHERE THEY NEED TO COLLECT\n  RECYCLING TRASH BINS. ALL THIS GAMES\n AWARD POINTS IN A FUN AND COMPETITIVE ENVIRONMENT. ";
    public void act() 
    {
        // Add your action code here.
    }
    public DisplayText(String text)
    {
        
        objectText = text;
    }
    public void objectText(String text)
    {
        String stringText = text;
        GreenfootImage textImage = new GreenfootImage(stringText,20,Color.WHITE, Color.BLACK);
    }
}
