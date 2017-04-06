package com.despattern.singleton;

public class SingleObject {
	//create an object of SingleObject
	private static SingleObject instance = new SingleObject();
	
	//make the constructor private so that this class cannot be
	//instantiated
	private SingleObject() {
		// TODO Auto-generated constructor stub
	}
	
	//Get the only object available
	public static SingleObject getSingleObject(){
		return instance;
	}
	
	public void showMessage(){
		System.out.println("Hello World!)))");
	}
}
