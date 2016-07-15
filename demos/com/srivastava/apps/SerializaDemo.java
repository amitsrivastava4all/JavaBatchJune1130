package com.srivastava.apps;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private double salary;
	private transient String pinCode;  // static 
	private int bonus=1111;
	private int pf = 2222;
	// pinCode Instance Member Now not write in a file 
	Employee(int id , String name, double salary, String pinCode){
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.pinCode= pinCode;
				
	}
	@Override
	public String  toString(){
		return "Id "+id+" Name "+name+" Salary "+salary+" PinCode "+pinCode+" bonus "+bonus+" pf "+pf;
	}
}
public class SerializaDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Employee ram = new Employee(1001,"Ram",9999,"A123");
		// Write Bytes in a File
		FileOutputStream fo = new FileOutputStream("/Users/amit/Documents/FileHandlingTesting/emp.dat");
		ObjectOutputStream os = new ObjectOutputStream(fo);
		os.writeObject(ram); // Convert Object into Bytes
		os.close();
		fo.close();
		System.out.println("Object Store in a File...");
		

	}

}
