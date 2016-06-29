interface A
{
	//From Java 8 Interfaces are not 100% Abstract
	void show();
	// default is a new keyword in Java 8
	// It is used to define methods in Java Interface
	default void print(){
		System.out.println("A Print Call...");
	}
}
class B implements A
{
	public void show(){
		System.out.println("B Show Call...");
	}
}
public class Java8InterfaceDemo {

	public static void main(String[] args) {
		B obj = new B();
		obj.show();
		obj.print();

	}

}
