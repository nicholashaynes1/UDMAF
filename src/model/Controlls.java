package model;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

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
			Player.X ++;
		}
		if(Key == KeyEvent.VK_A)
		{
			Player.X --;
		}
		if(Key == KeyEvent.VK_S)
		{
			Player.Y ++;
		}
		if(Key == KeyEvent.VK_W)
		{
			Player.Y --;
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
