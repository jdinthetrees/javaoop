package com.johndang;

public class IPhone extends Phone implements Ringable{
	public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
        //must add ring() as it was implemented
//    	return String.format("IPhone %s says %s", this.getVersionNumber(), this.getRingTone());
    	//another way to return string
    	return "iPhone " + "says "+ this.getVersionNumber() + " " + this.getRingTone() + "!";
    }
    @Override
    public String unlock() {
    	//must add unlock() as it was implemented
    	return ("Unlocking via facial regcognition");
    }
    @Override
    public void displayInfo() {
        // your code here  
    	System.out.println(String.format("IPhone %s from %s", this.getVersionNumber(), this.getCarrier()));
    }
}
