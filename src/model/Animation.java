package model;

import java.util.Timer;
import java.util.TimerTask;
/**
 * Class that holds all animation methods
 * @author nick
 *
 */
public class Animation
{
	private Timer walkTimer;
	private Controlls baseControlls;
	private int animationFrame = 0;
	private int arraySize = 0;
	private  int playerDrawWidth = 0,playerDrawHeight = 0,playerDrawY = 0, playerDrawX = 0;
	
	
	//class that holds all animation methods.
	public Animation()
	{
		walkTimer = new Timer();
		baseControlls = new Controlls();
		
		
		
	}
	/**
	 * 
	 * @param standingDrawX The int for a draw x for the standing sprite
	 * @param standingDrawY The int for a draw y for the standing sprite
	 * @param standingDrawWidth The int for a draw width for the standing sprite
	 * @param standingDrawHeight The int for a draw height for the standing sprite
	 * @param xDrawArray the array that holds all the x draw positions 
	 * @param yDrawArray the array that holds all the y draw positions
	 * @param widthDrawArray the array that holds all the width draw positions
	 * @param heightDrawArray the array that holds all the height draw positions
	 */
	public void animateWalk(int standingDrawX, int standingDrawY, int standingDrawWidth, int standingDrawHeight, int[] xDrawArray, int[] yDrawArray, int[] widthDrawArray, int[] heightDrawArray)
	{
		
		
		walkTimer.scheduleAtFixedRate(new TimerTask()
				{
					@Override
					public void run()
					{
						if(baseControlls.isWalking() == true)
						{
							
							if(animationFrame == heightDrawArray.length)
							{
								animationFrame = 0;
							}
							else
							{
								playerDrawX = xDrawArray[animationFrame];
								playerDrawY = yDrawArray[animationFrame]; 
								playerDrawWidth = widthDrawArray[animationFrame];
								playerDrawHeight = heightDrawArray[animationFrame];

								animationFrame++;
							}
							
							
						}
						else
						{
							playerDrawX = standingDrawX;
							playerDrawY = standingDrawY;
							playerDrawWidth = standingDrawWidth;
							playerDrawHeight = standingDrawHeight;
							
						}
						
						
						
					}
					
				}, 110, 110);
		
	}
	
	public  int getPlayerDrawX()
	{
		return playerDrawX;
	}
	public  int getPlayerDrawY()
	{
		return playerDrawY;
	}
	public  int getPlayerDrawHeight()
	{
		return playerDrawHeight;
	}
	
	public int getPlayerDrawWidth()
	{
		return playerDrawWidth;
	}

	
}
