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
	//x and y to hold the player position
	private static int X , Y;
	private static boolean saveState = false;
	//a file scanner to collect player info
	private Scanner playerFileScanner;
	//writes to the files
	private Formatter fileFormatter;
	
	//arrays to hold the draw length 
	private  int[] walkAnimationDrawWidthArray;
	private  int[] walkAnimationDrawXArray;
	
	
	
	
	public Player()
	{
		walkAnimationDrawWidthArray = new int[8];
		walkAnimationDrawWidthArray[0] = 40;
		walkAnimationDrawWidthArray[1] = 35;
		walkAnimationDrawWidthArray[2] = 30;
		walkAnimationDrawWidthArray[3] = 30;
		walkAnimationDrawWidthArray[4] = 40;
		walkAnimationDrawWidthArray[5] = 40;
		walkAnimationDrawWidthArray[6] = 28;
		walkAnimationDrawWidthArray[7] = 20;
//		
		//this array keep track of the draw height of the sprite sheet
		walkAnimationDrawXArray = new int [8];
		walkAnimationDrawXArray[0] = 0;
		walkAnimationDrawXArray[1] = 40;
		walkAnimationDrawXArray[2] = 70;
		walkAnimationDrawXArray[3] = 95;
		walkAnimationDrawXArray[4] = 125;
		walkAnimationDrawXArray[5] = 160;
		walkAnimationDrawXArray[6] = 187;
		walkAnimationDrawXArray[7] = 220;
		
		
		try
		{
			//Scanner reads the PlayerFile 
			playerFileScanner = new Scanner(new File("PlayerFile.txt"));
		} 
		catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try
		{	//formats the file
			fileFormatter = new Formatter("PlayerFile.txt");
		} 
		catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		saveX();
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

	public  int[] getWalkAnimationDrawWidthArray() {
		return walkAnimationDrawWidthArray;
	}

	public  int[] getWalkAnimationDrawXArray() {
		return walkAnimationDrawXArray;
	}
	

	
	
	
}