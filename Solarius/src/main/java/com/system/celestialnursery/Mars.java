package com.system.celestialnursery;

import com.system.systemlogic.Graviton;


public class Mars extends Planet implements Graviton{
	
	private static double mass=0.107;
	private static String name="Mars";
	private static double revolutionPeriod=686.98*23.9345;
	private static double rotationPeriod=24.623;
	private static double distanceFromSun=1.524;
	
	public Mars() {
		super (CelestialObjects.MARS, mass, name, revolutionPeriod, rotationPeriod, distanceFromSun);
		construct();
	}
	
	public String toString(){
		return "Name" + ":" + Mars.name + "\n" + "Mass" + ":" + Mars.mass + "\n" + "Revolution Period" + ":" + Mars.revolutionPeriod + "\n" 
				+ "Rotation Period" + ":" + Mars.rotationPeriod + "\n" + "Distance From Sun" + ":" + Mars.distanceFromSun;
	}
	
	@Override
	protected void construct(){
		//System.out.println("Mars created");
	}

	@Override
	public double getMass() {
		// TODO Auto-generated method stub
		return Mars.mass;
	}

}
