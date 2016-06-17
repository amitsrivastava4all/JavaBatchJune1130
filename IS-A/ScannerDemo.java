import java.util.Scanner;


public class ScannerDemo {

	public static void main(String[] args) {
		// System.in , in means InputStream
		// Need to Store the Inputs in some buffer (Scanner)
		// For Taking Input CPU Interaction is not needed, that's why they build buffer concept.
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Name");
		//String name = scanner.next();
		String name = scanner.nextLine();
		System.out.println("Enter the Age");
		int age = scanner.nextInt();  // 21 \n
		System.out.println("Enter the Course Name ");
		 scanner.nextLine();  // this will eat the new line which is coming from age
		String courseName = scanner.nextLine();
		//String courseName = scanner.next();
		System.out.println("Name is "+name);
		System.out.println("Age is "+age);
		System.out.println("Course Name "+courseName);
		Scanner scanner2 = new Scanner("Amit Srivastava");
		while(scanner2.hasNext()){
			System.out.println(scanner2.next());
		}

	}

}
