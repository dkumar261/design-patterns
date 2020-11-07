package com.designpattern.singleton;

public class Test{

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Display display = Display.getDisplay();
		System.out.println(display.clone());
		System.out.println(display);
	}

}