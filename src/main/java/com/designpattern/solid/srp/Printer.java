package com.designpattern.solid.srp;

class Printer {
	Text text;

	Printer(Text t) {
		this.text = t;
	}

	void printText() {
		System.out.println(text.getText());
	}
}