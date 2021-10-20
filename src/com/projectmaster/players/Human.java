package com.projectmaster.players;

public class Human {
	
	private int strength = 3;
	private int intelligence = 3;
	private int stealth = 3;
	private int health = 100;
	
	
//	Getters
	public int getStrength() {
		return this.strength;
	}
	
	public int getIntelligence() {
		return this.intelligence;
	}
	
	public int getStealth() {
		return this.stealth;
	}
	
	public int getHealth() {
		System.out.println("Health Level: " + health);
		return this.health;
	}
	
//	Setters
	public void attack(Human target) {
		target.health -= this.strength;
	}
}
