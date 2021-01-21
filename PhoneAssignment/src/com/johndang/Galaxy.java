package com.johndang;

public class Galaxy extends Phone implements Ringable{
	public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
    	//must add ring() as it was implemented
    	return String.format("Galaxy %s says %s", this.getVersionNumber(), this.getRingTone());
    	
    }
    @Override
    public String unlock() {
    	//must add unlock() as it was implemented
    	return ("Unlocking via fingerprint");
    }
    @Override
    public void displayInfo() {
        // your code here
    	System.out.println(String.format("Galaxy %s from %s", this.getVersionNumber(), this.getCarrier()));
    }

}
