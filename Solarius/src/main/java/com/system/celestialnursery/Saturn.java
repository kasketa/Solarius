package com.system.celestialnursery;

import com.system.systemlogic.Graviton;


public class Saturn extends Planet implements Graviton {
	
	private static double mass=95.162;
	private static String name="Saturn";
	private static double revolutionPeriod=(29.46*365.24)*23.9345;
	private static double rotationPeriod=10.50;
	private static double distanceFromSun=9.539;
	
	public Saturn() {
		super (CelestialObjects.SATURN, mass, name, revolutionPeriod, rotationPeriod, distanceFromSun);
		construct();
	}
	
	
	public String toString(){
		return "Name" + ":" + Saturn.name + "\n" + "Mass" + ":" + Saturn.mass + "\n" + "Revolution Period" + ":" + Saturn.revolutionPeriod + "\n" 
				+ "Rotation Period" + ":" + Saturn.rotationPeriod + "\n" + "Distance From Sun" + ":" + Saturn.distanceFromSun;
	}
	
	@Override
	protected void construct(){
		//System.out.println("Saturn created");
	}


	@Override
	public double getMass() {
		// TODO Auto-generated method stub
		return Saturn.mass;
	}

}
