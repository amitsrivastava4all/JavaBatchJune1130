package com.srivastava.apps;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadDemo {
	static String readFile(String filePath) throws IOException{
		// It will read the File from Specified Location
		// Read in Bytes Form
		final int EOF = -1;
		FileInputStream fi = new FileInputStream(filePath);
		int singleByte =fi.read(); // read single byte
		StringBuilder sb = new StringBuilder();
		while(singleByte!=EOF){
			sb.append((char)singleByte);
			singleByte =fi.read();
		}
		fi.close();
		return sb.toString();
	}

}
