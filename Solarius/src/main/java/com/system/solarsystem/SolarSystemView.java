/*package com.system.solarsystem;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Observable;
import java.util.Observer;
import java.util.Random;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import com.system.celestialnursery.Earth;

public class SolarSystemView extends JComponent implements Observer {

	private static final double SUN_RADIUS_PROPORTION = 0.2;
	private static final double EARTH_RADIUS_PROPORTION = .3 * SUN_RADIUS_PROPORTION;

	private static final double EARTH_DISTANCE_PROPOTION_SCREEN = 0.4;

	private static final int DEFAULT_WIDTH = 800;
	private static final int DEFAULT_HEIGHT = 800;

	private static final int NUM_STARS = 100;
	private static final int MAX_STAR_RADIUS = 3;

	private static final double TWO_PI = 2.0 * Math.PI;

	private SolarSystem model;
	private Random random = new Random();

	private int[] starX;
	private int[] starY;
	private int[] starRadius;

	public SolarSystemView(SolarSystem model) {
		super();

		this.model = model;
		setPreferredSize(new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT));

		createStarField(DEFAULT_WIDTH, DEFAULT_HEIGHT, MAX_STAR_RADIUS);

	}

	private void createStarField(int width, int height, int maxRadius) {

		starRadius = new int[NUM_STARS];
		starX = new int[NUM_STARS];
		starY = new int[NUM_STARS];

		for (int i = 0; i < NUM_STARS; i++) {
			starX[i] = random.nextInt(width);
			starY[i] = random.nextInt(height);
			starRadius[i] = random.nextInt(maxRadius);
		}

	}

	private void drawSpaceBackdrop(Graphics2D g2) {

		g2.setColor(Color.BLACK);
		g2.fillRect(0, 0, getWidth(), getHeight());

		g2.setColor(Color.WHITE);

		for (int i = 0; i < NUM_STARS; i++) {
			g2.fillOval(starX[i], starY[i], starRadius[i], starRadius[i]);

		}

	}

	private void drawSun(Graphics2D g2) {
		int sunRadius = (int) (SUN_RADIUS_PROPORTION * getWidth());
		GradientPaint sunColor = new GradientPaint(0, 0, Color.YELLOW, 0,
				sunRadius, Color.RED);
		g2.setPaint(sunColor);
		g2.fillOval(-sunRadius / 2, -sunRadius / 2, sunRadius, sunRadius);
	}

	private void drawEarth(Graphics2D g2) {

		double earthTheta = map(model.getDay(), 0, Earth.revolutionPeriod, 0,
				TWO_PI);

		g2.rotate(earthTheta);
		int distancefromEarthToSun = (int) (EARTH_DISTANCE_PROPOTION_SCREEN * getWidth());
		g2.translate(distancefromEarthToSun, 0);

		int earthRadius = (int) (EARTH_RADIUS_PROPORTION * getWidth());
		GradientPaint earthColor = new GradientPaint(0, 0, Color.BLUE, 0,
				earthRadius, Color.GREEN.darker(), true);
		g2.setPaint(earthColor);

		g2.fillOval(-earthRadius / 2, -earthRadius / 2, earthRadius,
				earthRadius);

	}

	@Override
	public void paintComponent(Graphics g) {

		Graphics2D g2 = (Graphics2D) g;

		drawSpaceBackdrop(g2);

		g2.translate(getWidth() / 2, getHeight() / 2);

		drawSun(g2);

		drawEarth(g2);
	}

	public static void main(String[] args) {

		JFrame frame = new JFrame("Solar System");

		final SolarSystem model = new SolarSystem();
		final SolarSystemView view = new SolarSystemView(model);
		model.addObserver(view);

		JPanel panel = new JPanel();
		panel.add(view);

		final JSlider daySlider = new JSlider(0, Earth.revolutionPeriod);
		daySlider.setPaintLabels(true);
		daySlider.setPaintTicks(true);
		daySlider.setMajorTickSpacing(100);
		panel.add(daySlider);
		daySlider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				model.setDay(daySlider.getValue());
			}
		});
		frame.add(panel);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}

	public void update(Observable o, Object arg) {
		repaint();
	}

	public static final double map(double value, double low1, double high1,
			double low2, double high2) {

		double diff = value - low1;
		double proportion = diff / (high1 - low1);

		return lerp(low2, high2, proportion);

	}

	public static final double lerp(double value1, double value2, double amt) {
		return ((value2 - value1) * amt) + value1;
	}

}
*/