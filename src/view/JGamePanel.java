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

import model.Animation;
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
	
	//player animation.
	private int[] walkAnimationDrawWidthArray;
	private int[] walkAnimationDrawXArray;
	private Animation animationClass;
	
	
	
	

	public JGamePanel(Controller baseController)
	{
		this.baseContoller = baseController;
		baseLayout = new SpringLayout();
		
		//Class instantiation
		player = new Player();
		baseControlls = new Controlls();
		
		//This timer times the walk animation
		
		//this array keep track of the draw width of the sprite sheet
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
		
		
		animationClass = new Animation();
		
		animationClass.animateWalk(walkAnimationDrawWidthArray, walkAnimationDrawXArray);
		
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
       	 playerImg = playerImg.getSubimage(animationClass.getPlayerDrawX(), 0, animationClass.getPlayerDrawWidth(), 83); // 241 x 83
       	 
       	 //draws the player image.
       	 g.drawImage(playerImg, player.getX(), player.getY(), this);
        } 
        catch (IOException e) 
        {
       	 e.printStackTrace();
        }
         
		
		repaint();
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
