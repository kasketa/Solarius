package com.system.celestialnursery;

import com.system.systemlogic.Graviton;

public class Earth extends Planet implements Graviton {
	public static double mass = 1.00540;
	public static String name = "Earth";
	public static final int revolutionPeriod = 365;
	public static final int rotationPeriod = 24;
	public static double distanceFromSun = 1.000;

	public Earth() {
		super(CelestialObjects.EARTH, mass, name, revolutionPeriod,
				rotationPeriod, distanceFromSun);
		construct();
	}

	public String toString() {
		return "Name" + ":" + Earth.name + "\n" + "Mass" + ":" + Earth.mass
				+ "\n" + "Revolution Period" + ":" + Earth.revolutionPeriod
				+ "\n" + "Rotation Period" + ":" + Earth.rotationPeriod + "\n"
				+ "Distance From Sun" + ":" + Earth.distanceFromSun;

	}

	@Override
	protected void construct() {
		// System.out.println("PLANET CREATED!" + "\n" + toString());
	}
	

	@Override
	public double getMass() {
		// TODO Auto-generated method stub
		return Earth.mass;
	}

}
