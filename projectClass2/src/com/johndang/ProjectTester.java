package com.johndang;

public class ProjectTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Project test = new Project();
//		String name="KittyRoomba";
//		String description="cat on a Roomba";
		test.setName("KittyRoomba");
		test.setDescription("cat on a Roomba");
//		test.getName();
//		test.getDescription();
    	test.elavatorPitch();
    	
    	  //getters/setters
        Project newProject = new Project("LobsterSauna", "they cook themselves");
        System.out.println("Project:  " + newProject.getName() + " : " + newProject.getDescription());
        newProject.setName("Metal Rolly Pollys");
        newProject.setDescription("To massage your sciatic nerve!");     
        System.out.println("Project:  " + newProject.getName() + " : " + newProject.getDescription());
        
	}

}
