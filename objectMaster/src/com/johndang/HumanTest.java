package com.johndang;

public class HumanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human human1= new Human();
		Human human2= new Human();
		human1.attack(human2);
		human2.displayHealth();
		
		Wizard wizard = new Wizard();
		wizard.heal(human2);
		human2.displayHealth();
		wizard.fireball(human2);
		human2.displayHealth();
		
		Ninja ninja = new Ninja();
		ninja.steal(human2);
		ninja.displayHealth();
		human2.displayHealth();	
		ninja.runaway();
		ninja.displayHealth();
		
		Samurai samurai = new Samurai();
		samurai.deathBlow(human1);
		human1.displayHealth();
		samurai.displayHealth();
		samurai.howMany();
		samurai.meditate();
		samurai.displayHealth();
		
		
	}

}
