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
	 * Animates the walk cycle.
	 * @param xDrawArray An int that controls where the draw x is.
	 * @param yDrawArray An int that controls where the draw y is.
	 * @param widthDrawArray An int that controls where the draw width is.
	 * @param heightDrawArray An int that controls where the draw height is.
	 */
	public void animateWalk( int[] xDrawArray, int[] yDrawArray, int[] widthDrawArray, int[] heightDrawArray)
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
							playerDrawX = xDrawArray[0];
							playerDrawY = yDrawArray[0];
							playerDrawWidth = widthDrawArray[0];
							playerDrawHeight = heightDrawArray[0];
							
						}
						
						
						
					}
					
				}, 100, 100);
		
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
