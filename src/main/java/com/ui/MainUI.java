package com.ui;

import javax.swing.*;
import java.awt.event.*;

public class MainUI extends JFrame implements ActionListener {

	private JButton button1;

	public MainUI() {

		setLayout(null);

		button1 = new JButton("Cerrar");
		button1.setBounds(150,20,100,25);
		add(button1);
		button1.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e){

		if (e.getSource() == button1){
			System.exit(0);
		}
	}

	public static void main(){
		MainUI window = new MainUI();
		window.setBounds(0,0,900,550);
		window.setVisible(true);
		window.setLocationRelativeTo(null);
		window.setResizable(false);
	} 
}