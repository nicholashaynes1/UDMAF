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
	
	//Animation decleration
	private Animation animationClass;
	

	
	
	
	

	public JGamePanel(Controller baseController)
	{
		this.baseContoller = baseController;
		baseLayout = new SpringLayout();
		
		//Class instantiation
		player = new Player();
		baseControlls = new Controlls();
		animationClass = new Animation();
		
		//Calling the animation class  
		animationClass.animateWalk(player.getStandingPosX(), player.getStandingPosY(), player.getStandingPosWidth(), player.getStandingPosHeight(), player.getWalkAnimationDrawXArray(),player.getWalkAnimationDrawYArray(), player.getWalkAnimationDrawWidthArray(),player.getWalkAnimationDrawHeightArray());
		
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
       	 playerImg = ImageIO.read(getClass().getResource("/images/WalkingSpriteSheet.png"));
//      	 playerImg = playerImg.getSubimage(0,0 , 220, 250); // 500 x 500

       	        	 playerImg = playerImg.getSubimage(animationClass.getPlayerDrawX(),animationClass.getPlayerDrawY() , animationClass.getPlayerDrawWidth(), animationClass.getPlayerDrawHeight()); // 500 x 500
       	 
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
