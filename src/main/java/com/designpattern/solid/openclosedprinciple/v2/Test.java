package com.designpattern.solid.openclosedprinciple.v2;

/**
 * 
 * @author Dinesh
 *
 */
public class Test {

	public static void main(String[] args) {
		
		GreetingView greetingView = new GreetingView();
		
		IGreeting greeting = new NewYear();
		greetingView.displayGreeting(greeting );
	}
}
