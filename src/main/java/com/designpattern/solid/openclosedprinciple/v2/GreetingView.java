package com.designpattern.solid.openclosedprinciple.v2;

public class GreetingView {

	public void displayGreeting(IGreeting greeting) {
		
		greeting.greeting();
		
	}

}
