import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lives extends Actor
{
    public Lives(){
        GreenfootImage image = new GreenfootImage(200,50);
        
        setImage(image);
    }
    
    public void setScore(int lives){
        GreenfootImage image = getImage();
        image.clear();
        greenfoot.Font f = new greenfoot.Font("Comic Sans MS",32);
        image.setFont(f);
        greenfoot.Color c = new greenfoot.Color(127,127,127,127); 
        image.setColor(c);
        image.fill();
        image.setColor(greenfoot.Color.BLACK);
        //image.drawString("Score = " + String.valueOf(score),10,30);
        image.drawString("Lives =  " + String.valueOf(lives),10,30);
        setImage(image);
    }  
}
