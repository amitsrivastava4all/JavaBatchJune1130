//Utility Class = final + private constructor + static methods
// Java 8 Now I Have static methods in interface
// Java 8 Utility Interfaces
import static java.lang.System.out;
interface MathOperations{
//final class MathOperations{
	// This is Private Constructor
	// So NoBody Can Create Object of this class
	//private MathOperations(){}
	public static int add(int x, int y){
		return x + y;
	}
	
	public static int power(int x,int y){
		return 0;
	}
}
public class StaticMethods {

	public static void main(String[] args) {
		//System s = new System();
		out.println("Hello");
		//MathOperations math = new MathOperations();
		//int sum = math.add(100, 200);
		int result = MathOperations.add(100, 200);
		out.println("Result is "+result);

	}

}
