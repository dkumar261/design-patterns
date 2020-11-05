package com.designpattern.util.serialversion.uid;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Address address = new Address("abc", "Malaysia");

//		serializedAddress(address);	
		deserializedAddress();

	}

	private static void serializedAddress(Address address) throws IOException, FileNotFoundException {
		// object -> file
		try (FileOutputStream fos = new FileOutputStream("address.obj");
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			oos.writeObject(address);
			oos.flush();
			System.out.println("-------------Address is Serialized-------------------");
		}
	}

	private static void deserializedAddress() throws IOException, ClassNotFoundException, FileNotFoundException {
		Address result = null;
		// file -> object
		try (FileInputStream fis = new FileInputStream("address.obj");
				ObjectInputStream ois = new ObjectInputStream(fis)) {
			result = (Address) ois.readObject();
		}

		System.out.println(result);
//		System.out.println(result.ab);
	}
}
