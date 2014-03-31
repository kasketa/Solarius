package com.system.celestialnursery;

import com.system.systemlogic.Graviton;


public class Pluto extends Planet implements Graviton{
	
	private static double mass=0.0021;
	private static String name="Pluto";
	private static double revolutionPeriod=(247.68*365.24)*23.9345;
	private static double rotationPeriod=6.405*23.9345;
	private static double distanceFromSun=39.53;
	
	public Pluto() {
		super (CelestialObjects.PLUTO, mass, name, revolutionPeriod, rotationPeriod, distanceFromSun);
		construct();
	}
	
	
	public String toString(){
		return "Name" + ":" + Pluto.name + "\n" + "Mass" + ":" + Pluto.mass + "\n" + "Revolution Period" + ":" + Pluto.revolutionPeriod + "\n" 
				+ "Rotation Period" + ":" + Pluto.rotationPeriod + "\n" + "Distance From Sun" + ":" + Pluto.distanceFromSun;
	}
	
	@Override
	protected void construct(){
		//System.out.println("PLUTO created");
	}


	@Override
	public double getMass() {
		// TODO Auto-generated method stub
		return Pluto.mass;
	}

}
