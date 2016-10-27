package view;

import javax.swing.JFrame;

import controller.Controller;

public class JGameFrame extends JFrame
{
	private Controller baseController;
	private JGamePanel basePanel;
	
	public JGameFrame(Controller baseController)
	{
		this.baseController = baseController;
		basePanel = new JGamePanel(baseController);
		setupFrame();
	}

	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setResizable(false);
		this.setSize(700,700);
		this.setVisible(true);
		
	}

}
