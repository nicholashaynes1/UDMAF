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
	private boolean isWalking = false;
	
	
	
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
			isWalking = true;
			System.out.println(isWalking);
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
			System.out.println(isWalking);
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

	public void setWalking(boolean isWalking)
	{
		this.isWalking = isWalking;
	}
	
	
}
