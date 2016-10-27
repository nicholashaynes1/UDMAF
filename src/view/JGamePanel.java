package view;

import javax.swing.JPanel;
import javax.swing.SpringLayout;

import controller.Controller;

import java.awt.Color;
import java.awt.Graphics;

public class JGamePanel extends JPanel
{
	private Controller baseContoller;
	
	private SpringLayout baseLayout;

	public JGamePanel(Controller baseController)
	{
		this.baseContoller = baseController;
		baseLayout = new SpringLayout();
		
		
		setupPanel();
		setupLayout();
		setupListeners();
		
	}

	 @Override
     public void paintComponent(Graphics g) 
	 {
         super.paintComponent(g);
         g.drawRect(200, 200, 200, 200);
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


	private void setupListeners()
	{
		// TODO Auto-generated method stub
		
	}

}
