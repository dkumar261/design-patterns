package com.designpattern.singleton;

public class Display implements Cloneable{

	private String dislayType;
	
	private static Display display;
	
	private Display() {}
	
	public synchronized static Display getDisplay() {
		if(display == null) {
			display = new Display();
			display.setDislayType("Mobile Display");
		}
		return display;
	}

	public String getDislayType() {
		return dislayType;
	}

	public void setDislayType(String dislayType) {
		this.dislayType = dislayType;
	}
	// implement readResolve method
    protected Object readResolve()
    {
        return display;
    }
	
	@Override
	public Object clone() {
		return display;
	}
}
