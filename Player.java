
package game;

import java.awt.Graphics2D;
import java.awt.event.KeyEvent;


public class Player extends Sprite 
{
    // Add projectile
    public Player(Game game)
    {
        super(game);
        // Create a projectile
    }
    
    public Player(Game game, int x, int y, int xSpeed, int ySpeed, int width, int height)
    {
        super(game, x, y, xSpeed, ySpeed, width, height);
        // Create a projectile
    }
    
    public void paint(Graphics2D g)
    {
        super.paint(g); //paint the bottom rectangle
        g.fillRect(x + width / 4, y - height, width / 2, height);
    }
    
    public void keyPressed(KeyEvent e)
    {
        if(e.getKeyCode() == KeyEvent.VK_LEFT)
        {
            xSpeed = -3;
        }
        
        if(e.getKeyCode() == KeyEvent.VK_RIGHT)
        {
            xSpeed = 3;
        }
    }
    
    public void keyReleased(KeyEvent e)
    {
        if(e.getKeyCode() == KeyEvent.VK_LEFT)
        {
            xSpeed = 0;
        }
        
        if(e.getKeyCode() == KeyEvent.VK_RIGHT)
        {
            xSpeed = 0;
        }
        
        if(e.getKeyCode() == KeyEvent.VK_SPACE)
        {
            fire();
        }
    }
    
    private void fire()
    {
        
    }
    
    public void move()
    {
        if((x + xSpeed > 0) && (x + xSpeed < game.getWidth() - width))
        {
            x = x + xSpeed;
        }
    }
    
    
    
}
