import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class charlie here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class charlie extends Actor
{
    /**
     * Act - do whatever the charlie wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int x,y,paso;
    
    public void act() 
    {
        inicio();
        checaTecla();
        // Add your action code here.
    } 
    public void inicio()
    {
        x=this.getX();
        y=this.getY();
        paso=20;
    }
    
     private void checaTecla()
    {
   if(Greenfoot.isKeyDown("left"))//si esta presionada la flecha izquierda   
     {
         setImage("CharlieIzq.png");
         this.setLocation(x-=paso,y);setImage("CharlieIzq.png");setImage("CharlieIzq.png");
         paso+=paso;
     }
     if(Greenfoot.isKeyDown("right"))//si esta presionada la flecha derecha
     {
         setImage("CharlieOfficialPose1.png");
        this.setLocation(x+=paso,y);
        paso+=paso;
       
     }
    }
   
    
}
