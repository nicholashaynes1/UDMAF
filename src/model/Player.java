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
	private int[] walkAnimationDrawHeightArray;
	private int[] walkAnimationDrawWidthArray;
	
	private  int[] walkAnimationDrawXArray;
	private  int[] walkAnimationDrawYArray;
	
	private int standingPosWidth = 200, standingPosHeight = 400,standingPosX = 0,StandingPosY = 250;

	public Player()
	{
		//Array that controls the width
		walkAnimationDrawWidthArray = new int[3];
		walkAnimationDrawWidthArray[0] = 220;
		walkAnimationDrawWidthArray[1] = 220;
		walkAnimationDrawWidthArray[2] = 220;
		
		//Array that controls the height
		walkAnimationDrawHeightArray = new int[3];
		walkAnimationDrawHeightArray[0] = 250;
		walkAnimationDrawHeightArray[1] = 250;
		walkAnimationDrawHeightArray[2] = 250;
		//Array that controls the x
		walkAnimationDrawXArray = new int[3];
		walkAnimationDrawXArray[0] = 0;
		walkAnimationDrawXArray[1] = 195;
		walkAnimationDrawXArray[2] = 410;
		
		//Array that controls the y
		walkAnimationDrawYArray = new int [3];
		walkAnimationDrawYArray[0] = 0;
		walkAnimationDrawYArray[1] = 0;
		walkAnimationDrawYArray[2] = 0;
		
		
		
		
		
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

	public int[] getWalkAnimationDrawWidthArray()
	{
		return walkAnimationDrawWidthArray;
	}

	public  int[] getWalkAnimationDrawHeightArray() {
		return walkAnimationDrawHeightArray;
	}

	public int[] getWalkAnimationDrawXArray()
	{
		return walkAnimationDrawXArray;
	}
	
	public  int[] getWalkAnimationDrawYArray() {
		return walkAnimationDrawYArray;
	}

	public int getStandingPosX() {
		return standingPosX;
	}

	public int getStandingPosY() {
		return StandingPosY;
	}
	
	public int getStandingPosWidth() {
		return standingPosWidth;
	}

	public int getStandingPosHeight() {
		return standingPosHeight;
	}	
	
}