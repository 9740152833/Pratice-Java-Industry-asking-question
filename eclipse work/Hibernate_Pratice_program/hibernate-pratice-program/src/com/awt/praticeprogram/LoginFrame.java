package com.awt.praticeprogram;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class LoginFrame extends Frame implements ActionListener {
	TextField mobile, pass;
	Button b1, b2;
	Font f = new Font("Arial", Font.BOLD, 10);

	public String readObject(int id) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Register.class)
				.buildSessionFactory();
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		Register R = session.get(Register.class, id);
		String pass = R.getPass();
		return pass;
	}

	public LoginFrame() {
		this.setBackground(Color.LIGHT_GRAY);
		mobile = new TextField("id");
		mobile.setBounds(500, 100, 150, 20);
		mobile.setBackground(Color.pink);
		mobile.setFont(f);

		pass = new TextField("pass");
		pass.setBounds(500, 150, 150, 20);
		pass.setEchoChar('*');
		pass.setBackground(Color.pink);
		pass.setFont(f);

		b1 = new Button("Click");
		b1.setBounds(500, 200, 150, 50);
		b1.setBackground(Color.red);
		b1.setFont(f);
		b1.addActionListener(this);

		b2 = new Button("Back");
		b2.setBounds(500, 250, 150, 50);
		b2.setBackground(Color.green);
		b2.setFont(f);
		b2.addActionListener(this);

		add(mobile);
		add(pass);
		add(b1);
		add(b2);
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
		Font f1 = new Font("Arial Black", Font.BOLD, 30);
		g.setFont(f1);
		g.drawString("Login", 500, 50);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b2) {
			this.dispose();
		} else if (e.getSource() == b1) {
			String number = mobile.getText();
			int i = Integer.parseInt(number);
			String pass1 = pass.getText();
			String pass = readObject(i);
			if (pass.equals(pass1)) {
				MainFrame f = new MainFrame();
			}
		}

	}

}
