package view;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

import controller.Controller;
import model.Controlls;

public class JGameFrame extends JFrame
{
	private Controller baseController;
	private JGamePanel basePanel;
	private Controlls controlls;
	
	public JGameFrame(Controller baseController)
	{
		this.baseController = baseController;
		basePanel = new JGamePanel(baseController);
		
		
		controlls = new Controlls();
		//adding a key listener
		addKeyListener(controlls);
		
		
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setResizable(false);
		this.setSize(java.awt.Toolkit.getDefaultToolkit().getScreenSize());
		this.setVisible(true);
		
	}
	


}
