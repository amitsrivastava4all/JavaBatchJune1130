import java.util.Scanner;

// To Count How Many Objects of Student are created.
class Student
{
	// These Variables Will be come when u create a new object
	int rollno; // Instance Variable
	String name;
	//int counter;
	static int counter; // Class Variables
	
	static{
		counter = 1000;
		System.out.println("This Will Call When Class is loaded..."+counter);
	}
	
	// this is init block
	// init block will call before constructor call
	// it will call on each object
	{
		System.out.println("I am a Init Block and I will call before constructor call");
	}
	{
		System.out.println("Iam init2");
	}
	// static bind with class , where instance variable is bind with object
	// static things will come in memory when class is loaded..
	// class is loaded only once , where object is created n number of times
	// Constructor is used to initalize the instance variables
	Student(int rollno, String name){
		this.rollno = rollno;
		this.name = name;
		counter++;
		//this.counter++;
		System.out.println(" I am a Constructor and I will call when u create an object");
		System.out.println("Counter "+counter+" Rollno "
		+this.rollno+" Name "+this.name);
	}
	
}
class EE
{
	static{
		System.out.println("This is EE Static Block");
	}
}
public class StaticDemo {

	public static void main(String[] args) throws ClassNotFoundException {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the ClassName to Load");
		String className = scanner.next();
		 Class.forName(className) ; // It is used to load a class
		// Class.forName is a Lazy way to load a class
		//Class.forName("Student");
		//Students ram = new Students(1002,"Ram");//Eager Way
	//	Student ram = new Student(1001,"Ram"); // Class Load + Object Create
	//	Student shyam = new Student(1002,"Shyam"); // Object Create

	}

}
