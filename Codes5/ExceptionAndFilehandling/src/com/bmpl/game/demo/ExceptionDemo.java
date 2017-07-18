package com.bmpl.game.demo;

import java.io.File;
import java.io.IOException;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("DB COnnection Open....");
		System.out.println("DB Query....");
		try{
			String path = "/Users/amit/Documents/FileOutput5453/abcd.txt";
			File file = new File(path);
			if(file.exists()){
				System.out.println("Yes this file is exist ");
				file.delete();
			}
			else
			{
				file.createNewFile();
				System.out.println("File Created...");
			}
			String name = null;
			if("amit".equals(name)){
			//if(name!=null && name.equals("amit")){
				System.out.println("Welcome "+name);
			}
			else
			{
				System.out.println("Hello ");
			}
//			String t = null;
//			if(t!=null){
//			t.toUpperCase();
//			}
//			int ww[] = new int[10];
//			ww[11] = 100;
		//int e = 10/0;  // throw new ArithmeticException();
		}
		catch(ArithmeticException e){
			System.err.println("U Divide a No with Zero "+e);
			//return ;
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("MOre than Array Bound (Size) ");
		}
		catch(IOException e){
			System.out.println("File Can't Be Create....");
		}
//		catch(Exception e){
//			System.out.println("Some Other Problem Arise , COntact to System Admin...");
//		}
		
		System.out.println("Get the Result of Query");
		System.out.println("Print the Result of the Query");
		System.out.println("Close the Connection...");

	}

}
