package com.system.celestialnursery;

import com.system.systemlogic.Graviton;


public class Uranus extends Planet implements Graviton{
	
	private static double mass=14.536;
	private static String name="Uranus";
	private static double revolutionPeriod=(84.01*365.24)*23.9345;
	private static double rotationPeriod=17.24;
	private static double distanceFromSun=19.182;
	
	public Uranus() {
		super (CelestialObjects.URANUS, mass, name, revolutionPeriod, rotationPeriod, distanceFromSun);
		construct();
	}
	
	public String toString(){
		return "Name" + ":" + Uranus.name + "\n" + "Mass" + ":" + Uranus.mass + "\n" + "Revolution Period" + ":" + Uranus.revolutionPeriod + "\n" 
				+ "Rotation Period" + ":" + Uranus.rotationPeriod + "\n" + "Distance From Sun" + ":" + Uranus.distanceFromSun;
	}
	
	@Override
	protected void construct(){
		//System.out.println("Uranus created");
	}

	@Override
	public double getMass() {
		// TODO Auto-generated method stub
		return Uranus.mass;
	}

}
