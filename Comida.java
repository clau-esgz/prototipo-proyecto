import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Comida here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Comida extends Actor
{
    /**
     * Act - do whatever the Comida wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    /**
     * 1=pizza
     * 2=hamburguesa
    
     * 3=zapato
     */
    private int tipoDeComida,valor,velocidad,aceleracion;
    
    
    public Comida(int unNumero)
    {
       
        velocidad=0;
        aceleracion=2;
        valor=0;
        asignaImagen(unNumero);
    }
    public void act() 
    {
        // Add your action code here.
        cae();
        checaLimite();
        checaPuntos();
    }    
    public void cae()
    {
        this.setLocation(this.getX(),this.getY()+velocidad);
        velocidad+=aceleracion;
    }
    private void checaLimite()
   {
       if(this.getY()>=570)
       {
           getWorld().removeObject(this);
           //this.setLocation(500,800);
       }
   }
    public void checaPuntos()
    {
        if(getWorld()!=null)//si el mundo existe 
        {
        if(this.isTouching(charlie.class))// metodo de java isTouching
        {
            paisaje mundo = (paisaje)getWorld();
            contador cont= mundo.getContador();
            cont.addcontar(valor);
           // getWorld().removeObject(this);
           this.setLocation(1000,getY());
        }
    }
        
    }
    public void asignaImagen(int unTipoDeComida)
    {
        switch(unTipoDeComida)
        {
            case 0:
            //colocarle la imagen 
            //dar puntaje a valor
            setImage("pizza_cheese.png");
            valor=5;
          //  paisaje mundo = (paisaje)getWorld();
            //contador cont= mundo.getContador();
            //cont.addcontar();
            
            break;
          
              case 1:
              setImage("zapato.png");
              valor=-5;
            break;
        }
        
    }
}
