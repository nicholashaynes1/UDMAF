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
	

	public JGamePanel(Controller baseController)
	{
		this.baseContoller = baseController;
		baseLayout = new SpringLayout();
		
		player = new Player(10,10);
		
		
		
		
		setupPanel();
		setupLayout();
		
	}
	@Override
     public void paintComponent(Graphics g) 
	 {
         super.paintComponent(g);
         //loads the player image.
         Image playerImg; 
         try 
         {
         playerImg = ImageIO.read(getClass().getResource("/images/satan.png"));
         g.drawImage(playerImg, player.X, player.Y, this);
         } 
         catch (IOException e) 
         {
         e.printStackTrace();
         }
         
        //draws specific parts of the image adn only renders those spots.
		try
		{
			img = ImageIO.read(getClass().getResource("/images/satan.png"));
			img = img.getSubimage(0, 0, 40, 40); // 500 x 500
			g.drawImage(img, 0, 0, this);
			
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
         
		
		repaint();
     }
	
	
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.YELLOW);
		
		
		
	}
	
	
	private void setupLayout()
	{
		// TODO Auto-generated method stub
		
	}

}
