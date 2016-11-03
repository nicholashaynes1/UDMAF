package model;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Controlls implements KeyListener
{
	public Controlls() 
	{
		
	}

	@Override
	public void keyPressed(KeyEvent e)
	{
		int Key = e.getKeyCode();
		if(Key == KeyEvent.VK_RIGHT)
		{
			Player.X ++;
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
		int Key = e.getKeyCode();
		if(Key == KeyEvent.VK_RIGHT)
		{
			Player.X += 100;
		}
		
		
	}
	
	
}
