/*package com.system.solarsystem;

import java.util.Observable;

import com.system.celestialnursery.Earth;

public class SolarSystem extends Observable {

	private int day;
	private int hour;

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		int oldDay = this.day;
		this.day = clampDay(day);
		if (oldDay != this.day) {
			setChanged();
			notifyObservers();
		}
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		int oldHour = this.hour;
		this.hour = clampHour(hour);
		if (oldHour != this.hour) {
			setChanged();
			notifyObservers();
		}
	}

	private int clampDay(int day) {
		return day % Earth.revolutionPeriod;
	}

	private int clampHour(int hour) {
		return hour % Earth.rotationPeriod;
	}
}
*/