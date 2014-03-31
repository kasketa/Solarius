package com.system.celestialnursery;

import com.system.systemlogic.Graviton;


public class Jupiter extends Planet implements Graviton {

	private static double mass=1.000*317.83;
	private static String name="Jupiter";
	private static double revolutionPeriod=(11.86*365.24)*23.9345;
	private static double rotationPeriod=9.925;
	private static double distanceFromSun=5.203;

	public Jupiter() {
		super (CelestialObjects.JUPITER, mass, name, revolutionPeriod, rotationPeriod, distanceFromSun);
		construct();
	}

	public String toString(){
		return "Name" + ":" + Jupiter.name + "\n" + "Mass" + ":" + Jupiter.mass + "\n" + "Revolution Period" + ":" + Jupiter.revolutionPeriod + "\n" 
				+ "Rotation Period" + ":" + Jupiter.rotationPeriod + "\n" + "Distance From Sun" + ":" + Jupiter.distanceFromSun;
	}
	@Override
	protected void construct(){
		//System.out.println("JUPITER created");
	}

	@Override
	public double getMass() {
		// TODO Auto-generated method stub
		return Jupiter.mass;
	}

}
