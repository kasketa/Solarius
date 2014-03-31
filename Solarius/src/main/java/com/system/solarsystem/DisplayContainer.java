/*package com.system.solarsystem;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;


class TheSun extends JPanel {

	private static final long serialVersionUID = 1L;


	public void drawSun(Graphics g){

		super.paintComponent(g);	
		g.setColor(Color.orange);
		g.fillOval(350, 250, 100, 100);

	}

}




public class DisplayContainer extends JPanel {

	private static final long serialVersionUID = 1L;
	
	public void drawSun(Graphics g){
		
		Graphics2D g2d = (Graphics2D) g;

		super.paintComponent(g2d);	
		g2d.setColor(Color.orange);
		g2d.fillRect(15, 15, 200, 200);

	}


	public DisplayContainer () {

		initUI();
	}

	private void initUI() {
		setTitle("The Solar System");
		setSize (800,600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}




	public static void main (String[] args){

		

				DisplayContainer window = new DisplayContainer();
				JFrame jf = new JFrame();
				jf.setTitle("Solar System");
				jf.setSize(800, 600);
				jf.setVisible(true);
                jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                jf.add(window);
               //System.out.println(window.drawSun(g););
			}

	
	}

*/