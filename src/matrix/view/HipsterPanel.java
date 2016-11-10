package matrix.view;

import javax.swing.*;
import matrix.controller.MatrixController;
import java.awt.Color;

public class HipsterPanel extends JPanel
{
	private SpringLayout baseLayout;
	private JComboBox dropDown;
	private JLabel infoLabel;
	private JButton myButton;
	private MatrixController baseController;
	
	public HipsterPanel(MatrixController baseController)
	{
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();
		this.myButton = new JButton("Click the button");
		this.infoLabel = new JLabel("Wowie dood");
		this.dropDown = new JComboBox(baseController.getWords());
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setBackground(Color.ORANGE);
		this.setLayout(baseLayout);
		this.add(dropDown);
		this.add(infoLabel);
		this.add(myButton);
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.WEST, myButton, 68, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, infoLabel, 0, SpringLayout.EAST, myButton);
		baseLayout.putConstraint(SpringLayout.NORTH, dropDown, 45, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, dropDown, -330, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, infoLabel, 4, SpringLayout.NORTH, dropDown);
		baseLayout.putConstraint(SpringLayout.NORTH, myButton, 39, SpringLayout.SOUTH, dropDown);
		
	}
	
	private void setupListeners()
	{
		
	}
}
	
