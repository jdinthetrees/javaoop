package com.johndang;

public class Human {
	protected int strength=3;
	protected int stealth=3;
	protected int intelligence=3;
	protected int health=100;
	
	
	public void attack(Human human) {
		human.health -= this.strength;
	}
	
	public int displayHealth() {
		System.out.println(this.health);
		return this.health;
	}
	
	
	
}
