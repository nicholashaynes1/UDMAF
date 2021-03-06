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
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import model.Animation;
import model.Controlls;
import model.Enemies;
import model.Player;


public class JGamePanel extends JPanel
{
	private Controller baseContoller;
	private SpringLayout baseLayout;
	
	//Class declerations
	private static Player player;
	private static Enemies enemy;
	private Controlls baseControlls;
	
	//Player Image stuff
	private BufferedImage img;
	private BufferedImage playerImg;
	private BufferedImage enemyImg;
	private BufferedImage enemyImgLeft;
	
	private int enemyStart;
	
	//Animation decleration
	private Animation animationClass;
	
	//Array list to keep track of enemie count.
	private  ArrayList<Integer> enemyArrayList;

	
	
	
	

	public JGamePanel(Controller baseController)
	{
		this.baseContoller = baseController;
		baseLayout = new SpringLayout();
		
		//Class instantiation
		player = new Player();
		enemy = new Enemies(); 
		baseControlls = new Controlls();
		animationClass = new Animation();
		
		//Calling the animation class  
		animationClass.enemyWalkAnimation(enemy.getEnemyXArray());
		animationClass.enemyWalkAnimationLeft(enemy.getEnemyLeftXArray());
		animationClass.animateWalk(player.getStandingPosX(), player.getStandingPosY(), player.getStandingPosWidth(), player.getStandingPosHeight(), player.getWalkAnimationDrawXArray(),player.getWalkAnimationDrawYArray(), player.getWalkAnimationDrawWidthArray(),player.getWalkAnimationDrawHeightArray());
		
		//array list to keep track of how many enemies to use
		enemyArrayList = new ArrayList<Integer>(0);
		
//		enemyStartRanges();
		setupPanel();
		setupLayout();
		
		
	}
	
	private void enemyStartRanges()
	{
		
		if(enemy.getEnemyX() < 50)
		{
			enemy.setEnemyX(enemy.getEnemyX() + 100);
		}
		else
		{
			enemy.setEnemyX(enemy.getEnemyX() + 600);
		}
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
			img = img.getSubimage(baseControlls.getMoveScreenX(), 0, 1920, 1080); // 500 x 500
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
       	 playerImg = ImageIO.read(getClass().getResource(player.getPlayerImage()));
       	 playerImg = playerImg.getSubimage(animationClass.getPlayerDrawX(),animationClass.getPlayerDrawY() , animationClass.getPlayerDrawWidth(), animationClass.getPlayerDrawHeight()); // 500 x 500

       	 //draws the player image.
       	 g.drawImage(playerImg, player.getX(), player.getY(), this);
        } 
        catch (IOException e) 
        {
       	 e.printStackTrace();
        }
        
        
			
			try 
	        {
				
	       	 //finds the enemy image.
	       	 enemyImg = ImageIO.read(getClass().getResource(enemy.getEnemyImage()));
	       	 enemyImg = enemyImg.getSubimage(animationClass.getEnemyDrawX(),0,60,100); // 500 x 500
	       	 
	       	enemyImgLeft = ImageIO.read(getClass().getResource(enemy.getEnemyImageLeft()));
	       	enemyImgLeft = enemyImgLeft.getSubimage(animationClass.getEnemyDrawX(),0,60,100); // 500 x 500
	       	

	       	 //draws the enemy image.
	       	 g.drawImage(enemyImg, enemy.getEnemyX(), 500, this);
	       	 enemyArrayList.add(0);
	       	
	       	 g.drawImage(enemyImgLeft, enemy.getEnemyX() + 1920, 500, this);
	       	 enemyArrayList.add(0);
	       	 
	       	 
	        } 
	        catch (IOException e1) 
	        {
	       	 e1.printStackTrace();
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
