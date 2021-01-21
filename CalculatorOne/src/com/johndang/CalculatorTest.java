package com.johndang;

public class CalculatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calculator = new Calculator();
		calculator.setOperandOne(10.5);
//		System.out.println(calculator.getOperandOne());
		
		calculator.setOperation("+");
        
        calculator.setOperandTwo(5.2);
//        System.out.println(calculator.getOperandTwo());
        System.out.println("The Result is: " + calculator.getResults());
	}

}
