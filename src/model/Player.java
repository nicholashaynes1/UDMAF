package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;


/**
 * The player class that holds all player info
 * @author nick
 *
 */
public class Player
{
	private static int X , Y;
	private static boolean saveState = false;
	private Scanner playerFileScanner;
	private Formatter fileFormatter;
	
	
	
	public Player()
	{
		
		
		try
		{
			//Scanner reads the PlayerFile 
			playerFileScanner = new Scanner(new File("PlayerFile.txt"));
		} catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try
		{
			fileFormatter = new Formatter("PlayerFile.txt");
		} catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		saveX();
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
	
	public static void setSaveState(boolean saveState)
	{
		Player.saveState = saveState;
	}
	/**
	 * Saves the X-coordinate to the PlayerFile.txt
	 */
	private void saveX()
	{
		if(saveState = true)
		{
			fileFormatter.format(toString(""));
			closeFile();
		}
	}
	private void closeFile()
	{
		fileFormatter.close();
	}
	
	private String toString(String xString)
	{
		xString = Integer.toString(X);
		return xString;
		
	}
	

	
	
	
}