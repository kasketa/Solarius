package com.system.celestialnursery;

public abstract class Planet {
	
	//planet properties
	/*private double mass;
	private String name;
	private double revolutionPeriod;
	private double rotationPeriod;
	private double distanceFromSun;
	*/
	public Planet (CelestialObjects planet, double mass, String name, double revolutionPeriod, double rotationPeriod, double distancefromSun ){
		this.planet = planet;
		createPlanet();
	}
	
	private void createPlanet(){
	
	}
	
	protected abstract void construct();
	
		
	private CelestialObjects planet = null;
	
	public CelestialObjects getPlanet(){
		return planet;
	}
	
	public void setPlanetProperties (CelestialObjects planet){
		this.planet=planet;
	}
}