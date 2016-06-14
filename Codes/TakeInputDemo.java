import java.util.Scanner;


public class TakeInputDemo {

	public static void main(String[] args) {
		// Scanner is a Buffer and it actually as a class
		// it will collect the input coming from the System.in
		// and store in Scanner(Buffer)
		
		int w[]= {10,20,30,40,50};
		long startTime = System.nanoTime();
		for(int i : w){
			System.out.println(i);
		}
		long endTime= System.nanoTime();
		System.out.println("Total Time Taken "+(endTime-startTime));
		startTime = System.nanoTime();
		for(int j = 0 ; j<w.length;j++){
			System.out.println(w[j]);
		}
		endTime= System.nanoTime();
		System.out.println("Total Time Taken "+(endTime-startTime));
		
		/*Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the First Number");
		int firstNo = scanner.nextInt();
		System.out.println("Enter the Second Number");
		int secondNo = scanner.nextInt();
		int result = firstNo + secondNo;
		System.out.println("Result is "+result);
		scanner.close();
		System.gc();
*/
	}

}
