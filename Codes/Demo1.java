import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo1 {
	static Scanner scanner = new Scanner(System.in);
	static int firstNo = 0;
	static int secondNo = 0;
	static void takeFirstNo(){
		System.out.println("Enter the First Number");
		try{
			 firstNo = scanner.nextInt();  //throw new InputMisMatchException();
		}
		//InputMisMatchException e = new InputMisMatchException();
		catch(InputMismatchException e){
			System.out.println("Only Number Allowed , And U Enter Something else");
			scanner.nextLine();
			takeFirstNo();
			//System.out.println("Enter the First Number");
			//firstNo = scanner.nextInt();
			
		}
	}
	static void takeSecondNo(){
		System.out.println("Enter the Second Number");
		try{
			 secondNo = scanner.nextInt();  //throw new InputMisMatchException();
		}
		//InputMisMatchException e = new InputMisMatchException();
		catch(InputMismatchException e){
			System.out.println("Only Number Allowed , And U Enter Something else");
			scanner.nextLine();
			takeSecondNo();
			//System.out.println("Enter the First Number");
			//firstNo = scanner.nextInt();
			
		}
	}
	public static void main(String[] args) {
		// Program Terminate 
		// Exception Message (Programmer Friendly Message)
		// Print on Console (Wrong Impact for the User)
		// TODO Auto-generated method stub
		takeFirstNo();
		takeSecondNo();
		int result =0;
		try{
		 result = firstNo/secondNo;
		}
		catch(ArithmeticException e){
			System.out.println("U divide a number with zero ");
			takeSecondNo();
		}
		System.out.println("Result is "+result);
		scanner.close();
		

	}

}
