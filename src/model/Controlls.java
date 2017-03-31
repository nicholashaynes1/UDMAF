package model;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Timer;
import java.util.TimerTask;
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
	private Timer jumpTimer;

	public Controlls() 
	{
		jumpTimer = new Timer();
	}

	//Checks for a key pressed event
	@Override
	public void keyPressed(KeyEvent e)
	{
		int Key = e.getKeyCode();
		if(Key == KeyEvent.VK_D)
		{
			if(moveScreenX <1070)
			{
				if(Player.getX() < 800)
				{
					Player.setX(Player.getX() + 10);
					
					
				}
				else
				{
					moveScreenX += 10;
				}
				
				isWalking = true;
			}
			else
			{
				if(Player.getX() < 1420)
				{
					Player.setX(Player.getX() + 10);
				}
				
			}
			
			
			
		}
		if(Key == KeyEvent.VK_A)
		{
			if(Player.getX() > 200)
			{
				Player.setX(Player.getX() - 10);
			
			
			}
			else
			{
				moveScreenX -= 10;
			}
		
			isWalking = true;
		}
		if(Key == KeyEvent.VK_SPACE)
		{
			Player.setY(Player.getY() - 10);
			
			
			
			
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
		if(Key == KeyEvent.VK_SPACE)
		{
			sleep();
			Player.setY(Player.getY() + 10);
			
		}
		
		
	}

	@Override
	public void keyTyped(KeyEvent e)
	{	
		int Key = e.getKeyCode();
		if(Key == KeyEvent.VK_SPACE)
		{
			
		}
	}

	
	private void sleep()
	{
		
		try 
		{
			TimeUnit.MILLISECONDS.sleep(10);
		} 
		catch (InterruptedException e1) 
		{
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
	}
	
	public boolean isWalking()
	{
		return isWalking;
		
	}

	public static int getMoveScreenX() {
		return moveScreenX;
	}

	public static int getMoveScreenY() {
		return moveScreenY;
	}

	
	
}
