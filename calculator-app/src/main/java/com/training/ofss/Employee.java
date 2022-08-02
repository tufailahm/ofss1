package com.training.ofss;

import java.util.Arrays;


public class Employee {

	private String position; // Employee Position
	private int number; // Employee Number
	private int age; // Employee Age

	// Declaring Constants
	private static final String[] validPositions  = {"engineer", "tester","executive"};
	public static final int MIN_AGE = 19;
	public static final int MAX_AGE = 84; 
	public static final int MAX_EMPLOYEE_NUM = 9999;
	public static final int MIN_EMPLOYEE_NUM = 0;

	
	/**
	 * Setter function that sets Employee position
	 * <p>
	 * This method checks if the position  is in the validPositions array,
	 * if it exists, it sets the Employee class variable to position provided by user.
	 * <p>
	 * @param _position employee position set by user
	 * @param validPositions array of valid positions
	 * 
	 */
	public void setPosition (String _position) {
		if (Arrays.asList(validPositions).contains(_position)){
			position = _position;
		} 
	}

	
	/**
	 * Setter function that sets Employee number
	 * <p>
	 * This method checks if the Employee number  is in the valid range
	 * and sets the class Employee number variable to Employee number provided by user.
	 * <p>
	 * @param _numer employee number set by user
	 */
	public void setNumber (int _number) {
		if (_number >= MIN_EMPLOYEE_NUM && _number <= MAX_EMPLOYEE_NUM ){
			number = _number;
		}
	}
	
	/**
	 * Setter function that sets Employee age
	 * <p>
	 * This method checks if the Employee age  is in the valid range
	 * and sets the Employee age to Employee age provided by user.
	 * <p>
	 * @param _age employee number set by user
	 * 
	 */
	public void setAge (int _age) {
		if ( _age >= MIN_AGE && _age <= MAX_AGE){
			age = _age;
		}
	}
	
	/**
	 * Getter functions that returns employee position
	 * 
	 * @return employee position
	 */
	public String getPosition () {
		return position;
	}
	
	/**
	 * Getter functions that returns employee age
	 * 
	 * @return employee number
	 */
	public int getAge () {
		return age;
	}
	
	/**
	 * Getter functions that returns employee number
	 * <p>
	 * @return employee number
	 */
	public int getNumber () {
		return number;
	}
	
	@Override
	public String toString () {
		return "\nEmployee No: "+this.getNumber()+
				"\nEmployee Position: "+this.getPosition()+
				"\nEmployee Age: "+this.getAge()+"\n";
		
	}

	/**
	 * main method
	 */
	public static void main (String[] args) {
		/*
		 Creating new object called andrew,
		 setting all three parameters and printing them out. 
		 */
		Employee andrew = new Employee ();
		andrew.setNumber(123);
		andrew.setAge(28);
		andrew.setPosition("tester");
		System.out.println("-=Employee Andrew=-"+andrew.toString());
	}
}
