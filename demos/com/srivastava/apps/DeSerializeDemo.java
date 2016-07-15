package com.srivastava.apps;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializeDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		FileInputStream fi = new FileInputStream("/Users/amit/Documents/FileHandlingTesting/emp.dat");
		ObjectInputStream oi = new ObjectInputStream(fi);
		Employee e = (Employee)oi.readObject();
		System.out.println(e);  //e.toString()
	    oi.close();
	    fi.close();
		

	}

}
