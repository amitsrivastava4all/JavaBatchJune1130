import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

class A
{
	A(){
		System.out.println("A Cons Call");
	}
	static{
		System.out.println("A Class Load");
	}
}
class B
{
	B(){
		System.out.println("B Cons Call");
	}
	static{
		System.out.println("B Class Load");
	}
	}

class Calc
{
	private int add(int x, int y){
		return x + y;
	}
	public int subtract(int x, int y){
		return x - y;
	}
	public int multiply(int x, int y){
		return x * y;
	}
	public int divide(int x, int y){
		return x / y;
	}
}
public class TestReflection {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
		//Calc calc = new Calc();
		System.out.println("Enter the Class Name ");
		Scanner scanner = new Scanner(System.in);
		String className = scanner.next();
		//Class.forName(className); // To Load Class Dynamically
		Object object = Class.forName(className).newInstance(); // new className()
		//object = Class.forName(className).newInstance();
		System.out.println("Type Your Choice");
		System.out.println("Type add for Addition");
		System.out.println("Type subtract for Subtraction");
		System.out.println("Type multiply for Multiplication ");
		System.out.println("Type divide for Division");
		
		System.out.println("Enter the Operation Name ");
		String operationName = scanner.next().toLowerCase();
		Method method = object.getClass().getDeclaredMethod(operationName, int.class, int.class);
		method.setAccessible(true);
		Object result = method.invoke(object, 100,200);
		System.out.println("Result is "+result);
	}

}
