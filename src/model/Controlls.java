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
	private Player player;
//	private Enemies enemy;

	public Controlls() 
	{
		jumpTimer = new Timer();
		player = new Player();
//		enemy = new Enemies();
	}

	//Checks for a key pressed event
	@Override
	public void keyPressed(KeyEvent e)
	{
		int Key = e.getKeyCode();
		if(Key == KeyEvent.VK_D)
		{
			player.setPlayerImage("/images/knight_MoveR_strip6.png");
			isWalking = true;
			if(moveScreenX <1070)
			{
				if(Player.getX() < 800)
				{
					Player.setX(Player.getX() + 10);
					
					
				}
				else
				{
					Enemies.setEnemyX(Enemies.getEnemyX() - 10);
					moveScreenX += 10;
				}
				
				
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
			isWalking = true;
			player.setPlayerImage("/images/knight_MoveL_strip6.png");
			if(moveScreenX > 0)
			{
				if(Player.getX() > 200)
				{
					Player.setX(Player.getX() - 10);
				}
				else
				{
					moveScreenX -= 10;
					Enemies.setEnemyX(Enemies.getEnemyX() + 10);
				}
			}
			
		
			
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
