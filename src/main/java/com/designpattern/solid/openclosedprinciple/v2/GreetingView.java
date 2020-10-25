package com.designpattern.solid.openclosedprinciple.v2;

public class GreetingView {

	public void displayGreeting(IGreeting iGreeting) {
		
		String greeting = iGreeting.greeting();
		System.out.println(greeting);
	}

}
