package com.designpattern.adapter.v2;

/**
 * Adapter Design Pattern Implementation We have two different approaches to
 * implement the adapter pattern. 
 * 
 * Object Adapter Pattern
 */
public class Test {

	public static void main(String[] args) {
		
		IndianSocket indianSocket = new IndianSocket();
		IndianConnector indianConnector = new IndianConnectorImpl();
		indianSocket.plugIn(indianConnector);

		USASocket usaSocket = new USASocket();
		USAConnector usaConnector = new USAConnectorImpl();
		usaSocket.plugIn(usaConnector);
		
		
		USAConnector connector = new USAToIndiaConnectorAdapter(indianConnector);
		usaSocket.plugIn(connector);
		
	}
}
