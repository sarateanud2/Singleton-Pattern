package com.despattern.singleton;

public class SingletonPatternDemo {
	public static void main(String[] args){
		//illegal construct
	    //Compile Time Error: The constructor SingleObject() is not visible
	    //SingleObject object = new SingleObject();
		
		//Get the only object available
		SingleObject object = SingleObject.getSingleObject();
		
		//show the message
	     object.showMessage();
	}
}
