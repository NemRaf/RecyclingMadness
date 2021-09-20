import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Trash here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Trash extends Actor
{
    int score;
    
    /**
     * Act - do whatever the Trash wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Trash()
    {
        this.score = 0;
    }
    public void act() 
    {
        // Add your action code here.
    } 
    public int getScore()
    {
        return this.score;
    }
    public boolean isOutOfBounds()
    {
        return getX()<3;
    }
}
