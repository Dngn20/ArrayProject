package array.view;

import javax.swing.*;
import array.controller.ArrayController;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HipsterPanel extends JPanel
{
	private ArrayController baseController;
	private JButton myButton;
	private JComboBox dropDown;
	private JLabel wordsLabel;
	private SpringLayout baseLayout;


	public HipsterPanel(ArrayController baseController)
	{
		this.baseController = baseController;
		myButton = new JButton("Click Here!!");
		wordsLabel = new JLabel("words here!");
		baseLayout = new SpringLayout();
		dropDown = new JComboBox(baseController.getHipster());
		
		setupPanel();
		setupLayout();
		setupListeners();
		
	}
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.GREEN);
		this.add(myButton);
		this.add(wordsLabel);
		this.add(dropDown);
	}

	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.SOUTH, wordsLabel, -117, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, wordsLabel, -167, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.WEST, myButton, 47, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, myButton, -1, SpringLayout.NORTH, dropDown);
		baseLayout.putConstraint(SpringLayout.NORTH, dropDown, 129, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, dropDown, -69, SpringLayout.EAST, this);
		
	}
	
	private void setupListeners()
	{
		dropDown.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent selection)
			{
				String selectedText = baseController.getWords()[dropDown.getSelectedIndex()];
				wordsLabel.setText(selectedText);
			}
		});
	

		myButton.addActionListener(new ActionListener()
		{		
			public void actionPerformed(ActionEvent selection)
			{
				baseController.impactHipsters();
				repaint();
			}
	
		});
	}
}