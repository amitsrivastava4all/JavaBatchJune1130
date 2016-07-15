package com.srivastava.apps;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// step - 1 Specify the Path (Open a file)
		FileOutputStream fo = new FileOutputStream("/Users/amit/Documents/FileHandlingTesting/sample.txt");
		// Step - 2 Write Bytes in a file
		String data = "Hello this is sample data to write in a file";
		byte b[] = data.getBytes();
		fo.write(b);
		// step -3 close the file
		fo.close();
		System.out.println("Data Store in a File...");

	}

}
