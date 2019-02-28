package com.designpattern.singleton;

public class Display {

	private static Display display;
	private Display() {
		
	}
	
	public static Display getDisplay() {
		if(display == null) {
			display = new Display();
		}
		
		
		return display;
	}
	
}
