package com.muhammad.teamroster.modell;

import java.io.Serializable;

public class Player implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static int numOfPlayer;
	public Integer id;
	private String firstName;
	private String lastName;
	private int age;
	

	public Player() {
		id = numOfPlayer++;
	}
	
	public Player(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		id = numOfPlayer++;
	}

	public String getFirstName() {
		return firstName;
	}
	

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Player [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
	}
	
}
