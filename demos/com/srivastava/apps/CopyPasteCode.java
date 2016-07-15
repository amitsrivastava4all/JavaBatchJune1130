package com.srivastava.apps;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyPasteCode {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		final int EOF = -1;
		FileInputStream fi = new FileInputStream("/Users/amit/Documents/FileHandlingTesting/TumHiHo.mp3");
		BufferedInputStream bi = new BufferedInputStream(fi);
		FileOutputStream fo = new FileOutputStream("/Users/amit/Documents/FileHandlingTesting/TumHiHoCopy.mp3");
		BufferedOutputStream bo = new BufferedOutputStream(fo);
		long startTime = System.currentTimeMillis();
		//int singleByte = fi.read(); // It Read the Single Byte
		int singleByte = bi.read();
		while(singleByte!=EOF){
			bo.write(singleByte);
			//fo.write(singleByte);
			//singleByte = fi.read();
			singleByte = bi.read();
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Total Time Taken "+(endTime-startTime)+"ms");
		bo.close();
		bi.close();
		fi.close();
		fo.close();
		System.out.println("Done...");
		

	}

}
