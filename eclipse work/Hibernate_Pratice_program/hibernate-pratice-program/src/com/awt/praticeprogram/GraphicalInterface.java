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

public class GraphicalInterface extends Frame implements ActionListener {

	TextField name, mobile, email, pass;

	public static void storedata(String name, String mobile, String email, String pass) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Register.class)
				.buildSessionFactory();
		Session session = factory.getCurrentSession();

		try {

			Register r2 = new Register(name, mobile, email, pass);
			session.beginTransaction();
			System.out.println("saving the object");
			session.save(r2);
			session.getTransaction().commit();
			System.out.println("Done!");
			factory.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	Button b1, b2;
	Font f = new Font("Arial", Font.ITALIC, 15);

	public GraphicalInterface() {
		this.setBackground(Color.black);
		name = new TextField("name");
		name.setBounds(500, 100, 150, 20);
		name.setBackground(Color.pink);
		name.setFont(f);

		mobile = new TextField("mobile");
		mobile.setBounds(500, 150, 150, 20);
		mobile.setBackground(Color.pink);
		mobile.setFont(f);

		email = new TextField("email");
		email.setBounds(500, 200, 150, 20);
		email.setBackground(Color.pink);
		email.setFont(f);

		pass = new TextField("pass");
		pass.setBounds(500, 250, 150, 20);
		pass.setEchoChar('*');
		pass.setBackground(Color.pink);
		pass.setFont(f);

		b1 = new Button("Register");
		b1.setBounds(500, 300, 150, 50);
		b1.setBackground(Color.red);
		b1.setFont(f);
		b1.addActionListener(this);

		b2 = new Button("login");
		b2.setBounds(500, 350, 150, 50);
		b2.setBackground(Color.orange);
		b2.setFont(f);
		b2.addActionListener(this);

		add(name);
		add(mobile);
		add(email);
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
		g.setColor(Color.green);
		Font f1 = new Font("Arial Black", Font.ITALIC, 30);
		g.setFont(f1);
		g.drawString("wellcome", 500, 50);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Graphics g = this.getGraphics();
		String s1 = name.getText();
		String s2 = mobile.getText();
		String s3 = email.getText();
		if (e.getSource() == b1) {

			g.setColor(Color.green);
			g.drawString("Name :" + s1, 50, 400);
			g.drawString("Mobile :" + s2, 50, 450);
			g.drawString("email :" + s3, 50, 500);
			g.drawString("pass :" + pass.getText(), 50, 550);

			storedata(s1, s2, s3, pass.getText());

		} else if (e.getSource() == b2) {
			LoginFrame f2 = new LoginFrame();

		}

	}

	public static void main(String[] args) {
		new GraphicalInterface();

	}
}
