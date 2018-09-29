package view;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Alert extends JFrame {
	public Alert() {
		super("login");
    	Container tela = getContentPane();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	setLayout(null);
    	
    	setSize(400,400);
    	
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setLocationRelativeTo(null);
		setVisible(true);
	}
}
