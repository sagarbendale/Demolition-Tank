import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class GameEnd here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameEnd extends BaseLevel
{

    /**
     * Constructor for objects of class GameEnd.
     * 
     */
    
    int scr;
    String status;
    final int MAX_SCORE = 11000;
    ArrayList<Integer> lvlScore = new ArrayList<Integer>();
    public GameEnd(int score, ArrayList<Integer> lvl)
    {
        
        
        
        lvlScore = lvl;
        status = "Final Score : "+score;
        int j=1;
       
        for(Integer i:lvlScore)
        {
            status = status + "\nLevel "+j+": "+i; j++;//System.out.println(i);
        }
        if(score == MAX_SCORE)
        {
            ScoreView go = new ScoreView(status);
            int textX = getWidth()/2;
            int textY = getHeight()/2;
            addObject(go, textX, textY);
        }
        else
        {
            GameOver go = new GameOver();
            int textX = getWidth()/2;
            int textY = getHeight()/2;
            addObject(go, textX, textY);
        }
        
        
        
        
    }
   
}
