
package game;

import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.Rectangle;


public class Sprite 
{
    protected int x = 0;
    protected int y = 0;
    protected int xSpeed = 0;
    protected int ySpeed = 0;
    protected int width = 60;
    protected int height = 10;
    protected Game game;
    
    public Sprite(Game game)
    {
        this.game = game;
    }
    
    public Sprite(Game game, int x, int y, int xSpeed, int ySpeed, int width, int height)
    {
        this.game = game;
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
        this.width = width;
        this.height = height;
        
    }
    
    public void move()
    {
        x = x + xSpeed;
        y = y + ySpeed;
    }
    
    public void paint(Graphics2D g)
    {
        g.fillRect(x, y, width, height);
        
    }
    
    public void keyReleased(KeyEvent e)
    {
        
    }
    
    public void keyPressed(KeyEvent e)
    {
         
    }
    
    public Rectangle getBounds()
    {
        return new Rectangle(x, y, width, height);
    }
    
    public int getX()
    {
        return x;
    }
    
    public int getY()
    {
        return y;
    }
    
    public int getXSpeed()
    {
        return xSpeed;
    }
    
    public int getYSpeed()
    {
        return ySpeed;
    }
    
}
