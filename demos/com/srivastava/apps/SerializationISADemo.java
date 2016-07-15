package com.srivastava.apps;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// Case-1 When Parent is Serializable so Child is Automatically Serializable
// Case-2 When Child is Serializable and Parent is Not
class Person //implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int age;
	String name;
	Person(){
		System.out.println("this is Default Cons of Person class");
	}
	Person(int age , String name){
		this.age = age;
		this.name = name;
		System.out.println("Person Class Cons Call");
	}
}
class Customer extends Person implements Serializable
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private  int id;
	private double balance;
	Customer(int id, double balance,int age, String name){
		super(age,name);
		this.id = id;
		this.balance = balance;
		System.out.println("Customer Class Cons Call");
	}
	public String toString(){
		return "Name "+name+" Age "+age+" Id  "+id+" Balance "+balance;
	}
}
public class SerializationISADemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Customer ram =new Customer(1001,9999,21,"Ram");
		FileOutputStream fs = new FileOutputStream("/Users/amit/Documents/FileHandlingTesting/customer.dat");
		ObjectOutputStream os = new ObjectOutputStream(fs);
		os.writeObject(ram);  // Convert Byte into Object 
		// and then give bytes to FileOutputStream , so it will write the 
		// bytes in a file
		os.close();
		fs.close();
		
		System.out.println("Data Serialization is Done....");
		FileInputStream fi = new FileInputStream("/Users/amit/Documents/FileHandlingTesting/customer.dat");
		ObjectInputStream oi = new ObjectInputStream(fi);
		Customer object = (Customer)oi.readObject(); // Convert Bytes into Object
		System.out.println(object);
		// and read the Bytes from a file by using FileInputStream
		oi.close();
		fi.close();

	}

}
