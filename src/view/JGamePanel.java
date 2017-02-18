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

import model.Player;


public class JGamePanel extends JPanel
{
	private Controller baseContoller;
	private SpringLayout baseLayout;
	private static Player player;
	private JLabel testDisplay;
	private BufferedImage img;
	private BufferedImage playerImg;
	

	public JGamePanel(Controller baseController)
	{
		this.baseContoller = baseController;
		baseLayout = new SpringLayout();
		
		player = new Player();
		
		
		
		
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
       	 //finds the player image
       	 playerImg = ImageIO.read(getClass().getResource("/images/testSpriteSheet.png"));
       	 playerImg = playerImg.getSubimage(0, 0, 40, 40); // 500 x 500
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
