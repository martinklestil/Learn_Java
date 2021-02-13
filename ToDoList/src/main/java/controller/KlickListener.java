package controller;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import model.Global;



public class KlickListener implements ActionListener {
	private Box container;
	private JTextField inputTextField;
	private JButton button;
	private JPanel mainWindow;
	
	public KlickListener(JPanel mainPanel, JButton button, Box container, JTextField inputTextField) {
		mainWindow = mainPanel;
		this.container = container;
		this.inputTextField = inputTextField;
		this.button = button;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button) {
			JLabel valueLabel = new JLabel(inputTextField.getText());
			valueLabel.setFont(new Font(Global.getDefaultFont(), Font.PLAIN, 16));
			valueLabel.setForeground(Global.getWhite());
			container.add(valueLabel);
			container.repaint();
			inputTextField.setText("");
			mainWindow.repaint();
			mainWindow.updateUI();
			
		}
		
	}
	
	
	

}
