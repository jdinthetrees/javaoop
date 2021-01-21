package com.johndang;

public class Calculator implements java.io.Serializable {
	
	private double operandOne;
	private double operandTwo;
	private String operation;
	//member variables will yell at you if you dont use them "this.something" like in line 38
	private double result= 0;
	
	public Calculator() {
		
	}
	
	public void setOperandOne(double num) {
		this.operandOne = num;
	}
	
	public double getOperandOne() {
		return this.operandOne;
	}
	
	public void setOperandTwo(double num) {
		this.operandTwo = num;
	}
	
	public void setOperation(String operation) {
		this.operation = operation;
	}
	
	public double getOperandTwo() {
		return this.operandTwo;
	}
	
	public double performOperation() {
//		double result = 0;
		if(operation == "+") {
			this.result = operandOne + operandTwo;
		} else if (operation == "-") {
			this.result = operandOne - operandTwo;
			
		}
		return this.result;
	}
	
	public double getResults() {
		return performOperation();
	}
	

}
