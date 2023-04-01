import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * Write a description of class contador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class contador extends Actor
{
    static int contar=0;
    /**
     * Act - do whatever the contador wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setImage(new GreenfootImage("puntos :" + contar, 50, greenfoot.Color.GREEN, greenfoot.Color.BLACK));
        
    }    
    public static void addcontar(int puntos)
    {
        contar+=puntos;
        if(contar<=0)
            contar=0;
    }
}
