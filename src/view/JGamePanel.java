package view;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

import controller.Controller;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JGamePanel extends JPanel
{
	private Controller baseContoller;
	private SpringLayout baseLayout;
	private JButton simpleButton;
	
	int rectX = 200;
	int rectY = 200;
	
	public JGamePanel(Controller baseController)
	{
		this.baseContoller = baseController;
		baseLayout = new SpringLayout();
		
		simpleButton = new JButton();
		
		setupPanel();
		setupLayout();
		setupListeners();
		
	}
	@Override
     public void paintComponent(Graphics g) 
	 {
         super.paintComponent(g);
		g.drawRect(rectX, rectY, 200, 200);
		
		repaint();
     }
	
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.YELLOW);
		this.add(simpleButton);
		
		
	}
	
	
	private void setupLayout()
	{
		// TODO Auto-generated method stub
		
	}


	private void setupListeners()
	{
		simpleButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				rectX += 100;
				rectY += 100;
				
				System.out.println(rectX);
			}

		});

		
	}

}
