import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOverScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOverScreen extends World
{
    private TextButton textbutton1;
    private TextButton textbutton2;
    private int finalScore;
    private GameOver over;
    private GreenfootSound music = new GreenfootSound("gameover.mp3");
    /**
     * Constructor for objects of class GameOverScreen.
     * 
     */
    public GameOverScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(750, 600, 1); 
        over = new GameOver();
        addObject(over,400,300);
        music.playLoop();
    }
    public void act()
    {
        
        if(Greenfoot.mouseClicked(textbutton1))
        {
            music.stop();
            MenuScreen menu = new MenuScreen();
            Greenfoot.setWorld(menu);
        }
        
        
    }
    public void prepare()
    {
        textbutton1 = new TextButton(" Back to  Menu   ", 40);
        addObject(textbutton1, 380, 550);
        textbutton2 = new TextButton("Your score is : " +String.valueOf(this.finalScore),40);
        addObject(textbutton2,380,450);
    }
    public void setFinalScore(int score)
    {
        this.finalScore = score;
        prepare();
    }
}
