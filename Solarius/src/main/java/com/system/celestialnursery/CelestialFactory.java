package com.system.celestialnursery;



public class CelestialFactory {

	public static Planet buildPlanet(CelestialObjects planet) {

		Planet planets = null;

		switch(planet){
		case MERCURY:
			planets = new Mercury();
			break;
			
		case MARS:
			planets = new Mars();
			break;
			
		case EARTH:
			planets = new Earth();
			break;
			
		case VENUS:
			planets = new Venus();
			break;
			
		case SATURN:
			planets = new Saturn();
			break;
			
		case NEPTUNE:
			planets = new Neptune();
			break;
			
		case JUPITER:
			planets = new Jupiter();
			break;
			
		case URANUS:
			planets = new Uranus();
			break;
			
		case PLUTO:
			planets = new Pluto();
			break;			

		default:
			System.out.println("no planet built");
		}
	return planets;
	}

}
