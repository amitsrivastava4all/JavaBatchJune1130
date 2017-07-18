package com.bmpl.game.demo;

public class ExceptionDemo2 {
	static void dao() throws ArithmeticException{
		System.out.println("Connection Open");
		try{
//		if(10>2){	
//		System.exit(0);
//			//return ;
//		}
			int s = 100/0;
		System.out.println("Query and Get result ");
		System.out.println("Send Result to Helper");
		}
		finally{
			// resource clean up code
		System.out.println("Connnection Close");
		}
		}
	static void helper() throws ArithmeticException{
		System.out.println("Call DAO ");
		dao();
		System.out.println("Get result from DAO ");
		System.out.println("Send Result to View");
		
	}
	static void view(){
		try{
		helper();
		}
		catch(ArithmeticException e){
			System.out.println("Some Problem in DAO...");
			e.printStackTrace();
		}
		System.out.println("Call helper ");
		System.out.println("Get result from helper ");
		System.out.println("Print result to user");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		view();

	}

}
