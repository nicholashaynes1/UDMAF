package view;

import javax.swing.JPanel;
import javax.swing.SpringLayout;
import controller.Controller;
import java.awt.Color;
import java.awt.Graphics;
import model.Controlls;
import model.Player;


public class JGamePanel extends JPanel
{
	private Controller baseContoller;
	private SpringLayout baseLayout;
	
	
	private static Player player;
	
	
	
	
	
	public JGamePanel(Controller baseController)
	{
		this.baseContoller = baseController;
		baseLayout = new SpringLayout();
		
		
		
		player = new Player(100,100);
		System.out.println("here 1");
		
		
		
		setupPanel();
		setupLayout();
		
	}
	@Override
     public void paintComponent(Graphics g) 
	 {
         super.paintComponent(g);
		g.drawRect(player.X, player.Y, 200, 200);
		
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
