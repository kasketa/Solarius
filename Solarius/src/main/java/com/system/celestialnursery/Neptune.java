package com.system.celestialnursery;

import com.system.systemlogic.Graviton;


public class Neptune extends Planet implements Graviton {
	
	private static double mass=17.147;
	private static String name="Neptune";
	private static double revolutionPeriod=(164.79*365.24)*23.9345;
	private static double rotationPeriod=16.11;
	private static double distanceFromSun=30.06;
	
	
	public Neptune() {
		super (CelestialObjects.NEPTUNE, mass, name, revolutionPeriod, rotationPeriod, distanceFromSun);
		construct();
	}
	
	public String toString(){
		return "Name" + ":" + Neptune.name + "\n" + "Mass" + ":" + Neptune.mass + "\n" + "Revolution Period" + ":" + Neptune.revolutionPeriod + "\n" 
				+ "Rotation Period" + ":" + Neptune.rotationPeriod + "\n" + "Distance From Sun" + ":" + Neptune.distanceFromSun;
	}
	
	@Override
	protected void construct(){
		//System.out.println("Neptune created");
	}

	@Override
	public double getMass() {
		// TODO Auto-generated method stub
		return Neptune.mass;
	}

}
