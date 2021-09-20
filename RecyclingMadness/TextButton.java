import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TextButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TextButton extends Actor
{
    GreenfootImage background;
    GreenfootImage myImage;
    String myText;
    int myFont;
    
    public TextButton(String text,int font)
    {
        myText = text;
        myFont = font;
        prep(text,font);
    }
    /**
     * Act - do whatever the TextButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }
    
    public void prep(String text,int font)
    {
        myImage = new GreenfootImage(text,font,Color.WHITE,Color.BLACK);
        background = new GreenfootImage(myImage.getWidth() + 10 ,myImage.getHeight() +10);
        
        background.drawImage(myImage,5,5);
        setImage(background);
    }
}
