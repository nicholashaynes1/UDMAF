package model;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.concurrent.TimeUnit;

/**
 * This class holds all the methods that have to do with keyboard based movement.
 * @author nick
 *
 */
public class Controlls implements KeyListener
{
	public Controlls() 
	{
		
	}

	//Checks for a key pressed event
	@Override
	public void keyPressed(KeyEvent e)
	{
		int Key = e.getKeyCode();
		if(Key == KeyEvent.VK_D)
		{
			Player.setX(Player.getX() + 1);
		}
		if(Key == KeyEvent.VK_A)
		{
			Player.setX(Player.getX() - 1);
		}
		if(Key == KeyEvent.VK_S)
		{
			Player.setY(Player.getY() + 1);
		}
		if(Key == KeyEvent.VK_W)
		{
			Player.setY(Player.getY() - 1);
		}
		if(Key == KeyEvent.VK_ESCAPE)
		{
			Player.setSaveState(true);
		}
		
	}

	@Override
	public void keyReleased(KeyEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e)
	{	
		
	}
	
	
}
