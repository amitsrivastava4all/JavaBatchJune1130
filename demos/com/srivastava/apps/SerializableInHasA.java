package com.srivastava.apps;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable
{
	Course course = new Course();
	String name;
	int rollno;
	Student(){
		name="ABC";
		rollno = 1001;
	}
}
class Course implements Serializable{
	String duration;
	String name;
	Course(){
		name="Java";
		duration = "2Months";
	}
}
public class SerializableInHasA {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Student ram =new Student();
		FileOutputStream fs = new FileOutputStream("/Users/amit/Documents/FileHandlingTesting/student.dat");
		ObjectOutputStream os = new ObjectOutputStream(fs);
		os.writeObject(ram);  // Convert Byte into Object 
		// and then give bytes to FileOutputStream , so it will write the 
		// bytes in a file
		os.close();
		fs.close();
		System.out.println("Done...");
	}

}
