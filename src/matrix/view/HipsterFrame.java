package matrix.view;

import javax.swing.*;
import matrix.controller.MatrixController;
import matrix.view.HipsterPanel;
import java.awt.Dimension;

public class HipsterFrame extends JFrame
{
	private HipsterPanel appPanel;
	private MatrixController baseController;
	
	public HipsterFrame(MatrixController baseContoller)
	{
		super();
		this.baseController = baseController;
		this .appPanel = new HipsterPanel(baseController);
		setupFrame();
	}
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setSize(new Dimension(600, 400));
		this.setTitle("Hispeter dya 1984");
		this.setResizable(false);
		this.setVisible(true);
	}
}
