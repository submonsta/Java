package com.ktds.hskim;

public class CalculatorVO {
	
	private String inputCal;
	
	private int numberOne;
	
	private int numberTwo;
	
	private String Operator;

	
	/**
	 * Getters / Setters
	 * @return
	 */
	public String getInputCal() {
		return inputCal;
	}
	public void setInputCal(String inputCal) {
		this.inputCal = inputCal;
	}
	public int getNumberOne() {
		return numberOne;
	}
	public void setNumberOne(int numberOne) {
		this.numberOne = numberOne;
	}
	public int getNumberTwo() {
		return numberTwo;
	}
	public void setNumberTwo(int numberTwo) {
		this.numberTwo = numberTwo;
	}
	public String getOperator() {
		return Operator;
	}
	public void setOperator(String operator) {
		Operator = operator;
	}
	
}
