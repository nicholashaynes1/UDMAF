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
	private static int playerDrawWidth = 40,playerDrawX = 0;
	
	public Animation()
	{
		walkTimer = new Timer();
		baseControlls = new Controlls();
		
		
		
	}
	/**
	 * call this to animate from a sprite sheet
	 * @param widthDrawArray an int used to draw the width of the sprite
	 * @param xDrawArray an int used to draw the X of the sprite
	 */
	public void animateWalk(int[] widthDrawArray, int[] xDrawArray)
	{
		walkTimer.scheduleAtFixedRate(new TimerTask()
				{

					@Override
					public void run()
					{
						if(baseControlls.isWalking() == true)
						{
							
							if(animationFrame == 7)
							{
								animationFrame = 0;
							}
							else
							{
								playerDrawWidth = widthDrawArray[animationFrame];
								playerDrawX = xDrawArray[animationFrame]; 
								
								animationFrame++;
							}
							
							
						}
						else
						{
							playerDrawWidth = widthDrawArray[0];
							playerDrawX = xDrawArray[0];
						}
						
						
						
					}
					
				}, 100, 100);
		
	}

	public static int getPlayerDrawWidth()
	{
		return playerDrawWidth;
	}

	public static int getPlayerDrawX()
	{
		return playerDrawX;
	}

}
