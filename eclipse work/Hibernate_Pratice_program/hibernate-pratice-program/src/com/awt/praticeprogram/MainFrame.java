package com.awt.praticeprogram;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainFrame extends Frame implements ActionListener {

	public MainFrame() {
		this.setBackground(Color.gray);
		setSize(1000, 1050);
		setLayout(null);
		setVisible(true);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	public void paint(Graphics g) {
		g.setColor(Color.pink);
		Font f1 = new Font("Arial Black", Font.ITALIC, 30);
		g.setFont(f1);
		g.drawString("MainPage", 500, 50);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

	}

}
