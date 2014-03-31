package com.system.celestialnursery;

import com.system.systemlogic.Graviton;


public class Venus extends Planet implements Graviton {
	
	private static double mass=0.815;
	private static final String NAME="Venus";
	private static double revolutionPeriod=224.70*23.9345;
	private static double rotationPeriod=243.69*23.9345;
	private static double distanceFromSun=0.723;
	
	public Venus() {
		super (CelestialObjects.VENUS, mass, NAME, revolutionPeriod, rotationPeriod, distanceFromSun);
		construct();
	}
	
	public String toString(){
		return "Name" + ":" + Venus.NAME + "\n" + "Mass" + ":" + Venus.mass + "\n" + "Revolution Period" + ":" + Venus.revolutionPeriod + "\n" 
				+ "Rotation Period" + ":" + Venus.rotationPeriod + "\n" + "Distance From Sun" + ":" + Venus.distanceFromSun;
	}
	
	@Override
	protected void construct(){
		//System.out.println("Venus created");
	}

	@Override
	public double getMass() {
		// TODO Auto-generated method stub
		return Venus.mass;
	}

}
