package com.designpattern.solid.srp;

public class Test {

	public static void main(String[] args) {
		
		Text text = new Text();
		text.setText("The Single Principle Responsibility");
		
		Printer printer = new Printer(text);	
		printer.printText();
	}
}
