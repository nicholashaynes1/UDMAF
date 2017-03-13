package model;

import java.util.Timer;
import java.util.TimerTask;

public class Animation
{
	private Timer walkTimer;
	
	public Animation()
	{
		walkTimer = new Timer();
		
		
	}
	
	public void animateWalk(int[] widthDraw, int[] xDraw)
	{
		walkTimer.scheduleAtFixedRate(new TimerTask()
				{

					@Override
					public void run()
					{
						
						
					}
					
				}, 100, 100);
		
	}

}
