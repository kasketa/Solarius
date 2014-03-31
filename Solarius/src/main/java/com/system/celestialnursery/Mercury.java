package com.system.celestialnursery;

import com.system.systemlogic.Graviton;


public class Mercury extends Planet implements Graviton {
	
	private static double mass=0.0553;
	private static String name="Mercury";
	private static double revolutionPeriod=87.97*23.9345;
	private static double rotationPeriod=58.81*23.9345;
	private static double distanceFromSun=0.387;
	
	public Mercury() {
		super (CelestialObjects.MERCURY, mass, name, revolutionPeriod, rotationPeriod, distanceFromSun);
		construct();
	}
	
	public String toString(){
		return "Name" + ":" + Mercury.name + "\n" + "Mass" + ":" + Mercury.mass + "\n" + "Revolution Period" + ":" + Mercury.revolutionPeriod + "\n" 
				+ "Rotation Period" + ":" + Mercury.rotationPeriod + "\n" + "Distance From Sun" + ":" + Mercury.distanceFromSun;
	}
	
	@Override
	protected void construct(){
		//System.out.println("Mercury created");
	}

	@Override
	public double getMass() {
		// TODO Auto-generated method stub
		return Mercury.mass;
	}

}
