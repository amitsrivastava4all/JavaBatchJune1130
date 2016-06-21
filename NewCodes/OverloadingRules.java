import java.math.BigDecimal;
import java.math.BigInteger;

//0. default int
// 1. Wideing Primitive
// 2. Wrapper of Same Type
// 3. var args
class TypePromotion
{
	/*void print(int ...x){
		System.out.println("int var args");
	}*/
	/*void print(Integer x){
		System.out.println("Integer Wrapper");
	}*/
	void print(short x){
		System.out.println("short");
	}
	void print(byte x){
		System.out.println("byte");
	}
	/*void print(long x){
		System.out.println("long");
	}*/
	/*void print(int x){
		System.out.println("int");
	}*/
}
class Calc
{
	// ...x internally as an array
	int add(int ...x){
		int sum = 0;
		for(int y : x){
			sum = sum  + y;
		}
		return sum;
	}
	// Java 5 Var Args (Variable Arguments)
	/*int add(int x,int y){
		return  x + y;
	}
	int add(int x,int y,int z){
		return  x + y + z;
	}
	int add(int x,int y, int z , int m){
		return  x + y + z + m;
	}*/
}
public class OverloadingRules {

	public static void main(String[] args) {
		
		
		
		
		TypePromotion pr = new TypePromotion();
		pr.print((byte)10);
		/*Calc obj = new Calc();
		System.out.println(obj.add());
		System.out.println(obj.add(10));
		System.out.println(obj.add(10,20));
		System.out.println(obj.add(10,20,30));
		*/
		/*int x = 100;
		Integer w = 100; // this is a Wrapper Class
		byte q = w.byteValue();
		double e = w.doubleValue();
		double y = 100.20;
		int z = (int)y;   // Explicit Type Casting
		y = z;  // Implicit Type Casting
		System.out.println(Integer.MAX_VALUE);
		BigInteger bl;
		BigDecimal bb;*/

	}

}
