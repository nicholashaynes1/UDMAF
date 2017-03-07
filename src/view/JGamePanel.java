package view;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import controller.Controller;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

import model.Controlls;
import model.Player;


public class JGamePanel extends JPanel
{
	private Controller baseContoller;
	private SpringLayout baseLayout;
	//Class declerations
	private static Player player;
	private Controlls baseControlls;
	//Player Image stuff
	private BufferedImage img;
	private BufferedImage playerImg;
	//Timer to track the changed image to draw
	private Timer walkAnimationTimer;
	
	private int[][] walkAnimationDrawWidth2dArray;
	private int[][] walkAnimationDrawHeight2dArray;
	
	//predetermined walk spritesheet heights and widths;
	private int walkDimensionWidth0 = 40;
	private int walkDimensionWidth1 = 40;
	private int walkDimensionWidth2 = 40;
	private int walkDimensionWidth3 = 40;
	private int walkDimensionWidth4 = 40;
	private int walkDimensionWidth5 = 40;
	private int walkDimensionWidth6 = 40;
	private int walkDimensionWidth7 = 40;
	
	private int walkDimensionHeight0 = 80;
	private int walkDimensionHeight1 = 80;
	private int walkDimensionHeight2 = 80;
	private int walkDimensionHeight3 = 80;
	private int walkDimensionHeight4 = 80;
	private int walkDimensionHeight5 = 80;
	private int walkDimensionHeight6 = 80;
	private int walkDimensionHeight7 = 80;
	
	//ints used to draw the sprites width and height
	private int playerDrawWidth,playerDrawHeight;
	
	

	public JGamePanel(Controller baseController)
	{
		this.baseContoller = baseController;
		baseLayout = new SpringLayout();
		
		//Class instantiation
		player = new Player();
		baseControlls = new Controlls();
		
		//This timer times the walk animation
		walkAnimationTimer = new Timer();
		
		//this 2d array keep track of the draw width of the sprite sheet
		walkAnimationDrawWidth2dArray = new int[8][];
		walkAnimationDrawWidth2dArray[0] = new int[40];
		walkAnimationDrawWidth2dArray[1] = new int[40];
		walkAnimationDrawWidth2dArray[3] = new int[40];
		walkAnimationDrawWidth2dArray[4] = new int[40];
		walkAnimationDrawWidth2dArray[5] = new int[40];
		walkAnimationDrawWidth2dArray[6] = new int[40];
		walkAnimationDrawWidth2dArray[7] = new int[40];
		
		//this 2d array keep track of the draw height of the sprite sheet
		walkAnimationDrawHeight2dArray = new int [8][];
		walkAnimationDrawHeight2dArray[0] = new int[80];
		walkAnimationDrawHeight2dArray[1] = new int[80];
		walkAnimationDrawHeight2dArray[2] = new int[80];
		walkAnimationDrawHeight2dArray[3] = new int[80];
		walkAnimationDrawHeight2dArray[4] = new int[80];
		walkAnimationDrawHeight2dArray[5] = new int[80];
		walkAnimationDrawHeight2dArray[6] = new int[80];
		walkAnimationDrawHeight2dArray[7] = new int[80];
		
		
		
		
		setupPanel();
		setupLayout();
		
	}								
	@Override
     public void paintComponent(Graphics g) 
	 {
         super.paintComponent(g);
 
        //draws specific parts of the image and only renders those spots.
		try
		{
			//Loads in the map
			img = ImageIO.read(getClass().getResource("/images/testMap.png"));
			img = img.getSubimage(0, 0, 1920, 1080); // 500 x 500
			g.drawImage(img, 0, 0, this);
			
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		//loads the player image.
        try 
        {
       	 //finds the player image.
       	 playerImg = ImageIO.read(getClass().getResource("/images/PlayerImage.png"));
       	 playerImg = playerImg.getSubimage(10, 10, 40, 80); // 500 x 500
       	 
       	 //draws the player image.
       	 g.drawImage(playerImg, player.getX(), player.getY(), this);
        } 
        catch (IOException e) 
        {
       	 e.printStackTrace();
        }
         
		
		repaint();
     }
	
	/**
	 * Animates the walk cycle
	 */
	private void animateWalk()
	{
		if(baseControlls.isWalking() == true)
		{
			walkAnimationTimer.scheduleAtFixedRate(new TimerTask()
					{

						@Override
						public void run()
						{
							
							
						}
				
					}, 1000, 1000);
		}
		
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.WHITE);
		
		
		
	}
	
	
	private void setupLayout()
	{
		// TODO Auto-generated method stub
		
	}

}
