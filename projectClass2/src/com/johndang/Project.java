package com.johndang;

// Create a Project class that has the fields of name and description.- X
// Create an instance method called elevatorPitch that will return 
//the name and description separated by a colon.- X
// Overload the constructor method in three different ways.
//      public Project() {}
//      public Project(String name) {}
//      public Project(String name, String description) {}
// Create getter and setters for each field.- X
// Create a ProjectTest file that will test all the functionality.

public class Project {
	
	private String name;
	private String description;
	
	public void elavatorPitch() {
        System.out.println("Project Name is " + this.getName() + " : " + "Project Description is " + this.getDescription());
    }
	
	//this creates a null person
	public Project() {
		
	}
	
	public Project(String name) {
		//setting the name attribute to the value from the name parameter
		this.setName(name);
		
	}
	
	public Project(String name, String description) {
		//setting the name attribute to the value from the name parameter
    	//setting the description attribute to the value from the description parameter
    	this.name = name;
    	this.description = description;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
