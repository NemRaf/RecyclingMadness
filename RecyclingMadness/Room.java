import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Room here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Room extends World
{

    int plastikCounter = 0;
    int score = 0;
    int foodCounter = 0;
    public PaperBin bin;
    public GameOverScreen gscreen;
    Score scoreImg = null;
    private int lives =2;
    Lives livesImg = null;
    private GreenfootSound music = new GreenfootSound("stage.mp3");
    /**
     * Constructor for objects of class Stage1.
     * 
     */
    public Room()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(750, 525, 1,false);
        
        //setPaintOrder(GameOver.class,Score.class,Sheep.class,Trunk.class);
        
        livesImg = new Lives();
        livesImg.setScore(this.lives);
        addObject(livesImg,650,25);
        scoreImg = new Score();
        scoreImg.setScore(score);
        addObject(scoreImg,100,25);
        this.bin = new PaperBin ();
        addObject(bin,40,getHeight()/2);
        this.gscreen = new GameOverScreen();
        music.playLoop();
    }
    public void act(){
        
        plastikCounter++;
        foodCounter++ ;
        if(plastikCounter%100==0){
            //Dhmiourgia trunk
            createPaper();
            
        }
        
        if(foodCounter%150==0)
        {
            createFood();
        }
        
        if(score<0)
        {
            music.stop();
            Greenfoot.setWorld(gscreen);
        }
        score += this.bin.collect();
        
        for(Paper obj: getObjects(Paper.class))
        {
            if(obj.isOutOfBounds())
            {
                removeObject(obj);
                this.lives--;
            }
            
        }
        livesImg.setScore(this.lives);
        scoreImg.setScore(score);
        if(this.lives<0)
        {   
            Greenfoot.playSound("loose.wav");
            music.stop();
            gameOver(score);
        }
        
    }
    public int getRandomNumber(int start,int end)
    {
       int normal = Greenfoot.getRandomNumber(end-start+1);
       return normal+start;
    }
    public void gameOver(int score)
    {
            
            this.gscreen.setFinalScore(score);
            Greenfoot.setWorld(gscreen);
        
    }
    private void createFood()
    {
        Banana banana = new Banana();
        Burger burger = new Burger();
        Cherrypie cherry = new Cherrypie();
        int random= getRandomNumber(50,450);
        int random1 = getRandomNumber(0,3);
        if (random1 ==0)
        {
            GreenfootImage image = banana.getImage();
            addObject(banana,getWidth(),random);
        }else if(random1==1)
        {
            GreenfootImage image = burger.getImage();
            addObject(burger,getWidth(),random);
        }else
        {
            GreenfootImage image = cherry.getImage();
            addObject(cherry,getWidth(),random);
        }
    }
    private void createPaper(){
        Book book = new Book();
        PaperBag bag = new PaperBag();
        CornFlakes flakes = new CornFlakes();
        int random= getRandomNumber(50,450);
        int random1 = getRandomNumber(0,3);
        if (random1 ==0)
        {
            GreenfootImage image = book.getImage();
            addObject(book,getWidth(),random);
        }else if(random1==1)
        {
            GreenfootImage image = bag.getImage();
            addObject(bag,getWidth(),random);
        }else
        {
            GreenfootImage image = flakes.getImage();
            addObject(flakes,getWidth(),random);
        }
        
    
    }
}
