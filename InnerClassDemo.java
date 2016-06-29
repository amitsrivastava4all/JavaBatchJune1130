


class P
{
	interface T{
		void show();
	}
	class Q
	{
		
		class E implements T
		{
			public void show(){
				
			}
		}
		class E1 extends E
		{
			
		}
	}
}

class Employee{
	int x;
	Employee(){
		System.out.println("Employee Cons Call");
		//Account account = new Account();
	}
	
	// this is member class
	 class Account{
		Account(){
			System.out.println("Account Cons Call");
		}
	}
}

class X
{
	int a = 100;
	class Y
	{
		int a = 200;
		Y(){
			int sum = X.this.a+ this.a;
			System.out.println("Sum is "+sum);
		}
	}
}
//Nested Class

class DD
{
	static int a = 1000;
	static class EE
	{
		static void print(){
			System.out.println("Print Call");
		}
	}
}
class K
{
	// Method Local Inner Class
	// U Can Share Local Variables of the Methods with the Class Member
	// If U change the local variables in the class , then local variable
	// become effective final (Java 8)
	public void print(){
		int e = 900; // print local variable
		class H
		{
			H(){
				System.out.println("H Cons Call");
			}
			void show(){
				//System.out.println("H Show Call "+e);
				//e++;
			}
		}
		H obj = new H();
		obj.show();
		e++;
	}
}
public class InnerClassDemo {

	public static void main(String[] args) {
		K obj = new K();
		obj.print();
		//DD.EE.print();
		//System.out.println(DD.a);
		// TODO Auto-generated method stub
		//Employee ram = new Employee();
		//Employee.Account account = new Employee().new Account();
		//X.Y obj = new X().new Y();
	}

}
