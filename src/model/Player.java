package model;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

/**
 * The player class that holds all player info
 * @author nick
 * @param Takes in a X and Y ints for coordinates
 * @param File location
 */
public class Player
{
	private static int X , Y;
	
	public Player()
	{
		
		
	}

	public static int getX()
	{
		return X;
	}

	public static void setX(int x)
	{
		X = x;
	}

	public static int getY()
	{
		return Y;
	}

	public static void setY(int y)
	{
		Y = y;
	}
	
	public static void saveState(boolean save)
	{
		if(save = true)
		{
			System.out.println(0);
			try
			{
				TimeUnit.MICROSECONDS.sleep(10);
				save = false;
			} 
			catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		if(save = false)
		{
			System.out.println(1);
		}
		
		
	}
	
	
}