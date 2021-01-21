package com.johndang;

public class Ninja extends Human {
	
	public int stealth;
	
	public Ninja() {
		this.stealth = 10;
	}
	
	public void steal(Human human) {
		human.health -= this.stealth;
		this.health += this.stealth;
		
	}

	public void runaway() {
		this.health -= 10;
	}
}
