package com.johndang;

public class Samurai extends Human{
	
	private static int counter;
	
	public Samurai() {
		
		this.health = 200;
		counter++;
	}
	
	public void deathBlow(Human human) {
		human.health = 0;
		this.health = this.health/2;
	}
	
	public void meditate() {
		this.health += this.health * 2;
	}
	
	public void howMany() {
		System.out.println(counter);
	}

}
