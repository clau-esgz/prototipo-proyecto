import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class paisaje here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class paisaje extends World
{

    /**
     * Constructor for objects of class paisaje.
     * 
     */
    
    private charlie unCharlie;
    private Comida comida;
    int x,y;
    private int t;
    contador cont=new contador();

     public void act() 
    {
        creaComida();
        t++;
       
    }
    public paisaje()//constructor
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        incio();
        t=0;
        prepare(); 
        Greenfoot.setWorld(new background());
    }
    private void incio()
    {
        unCharlie=new charlie();
        x=50;
        y=400;
        addObject(unCharlie,x,y);
    }
   private void  creaComida()
   {
       if(t%5==0)
       {
       comida=new Comida(Greenfoot.getRandomNumber(2));
       addObject(comida,Greenfoot.getRandomNumber(800),0);
       }
       
   }
   public void prepare()//constructor
    {    
        
        addObject(cont, 200, 100);
    }
   
    public contador getContador() 
    {
     return cont;
    }
}