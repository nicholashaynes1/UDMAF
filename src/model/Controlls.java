package model;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Timer;
import java.util.concurrent.TimeUnit;

/**
 * This class holds all the methods that have to do with keyboard based movement.
 * @author nick
 *
 */
public class Controlls implements KeyListener
{
	private static boolean isWalking;
	private static int moveScreenX = 0, moveScreenY = 0;
	
	
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
			if(Player.getX() < 800)
			{
				Player.setX(Player.getX() + 10);
				
			}
			
			isWalking = true;
		}
		if(Key == KeyEvent.VK_A)
		{
			Player.setX(Player.getX() - 1);
			isWalking = true;
		}
		if(Key == KeyEvent.VK_S)
		{
			Player.setY(Player.getY() + 1);
			isWalking = true;
		}
		if(Key == KeyEvent.VK_W)
		{
			Player.setY(Player.getY() - 1);
			isWalking = true;
		}
		if(Key == KeyEvent.VK_ESCAPE)
		{
			Player.setSaveState(true);
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e)
	{
		int Key = e.getKeyCode();
		if(Key == KeyEvent.VK_D)
		{
			isWalking = false;
		}
		if(Key == KeyEvent.VK_A)
		{
			isWalking = false;
		}
		if(Key == KeyEvent.VK_S)
		{
			isWalking = false;
		}
		if(Key == KeyEvent.VK_W)
		{
			isWalking = false;
		}
		
		
	}

	@Override
	public void keyTyped(KeyEvent e)
	{	
		
	}

	public boolean isWalking()
	{
		return isWalking;
		
	}

	
	
}
