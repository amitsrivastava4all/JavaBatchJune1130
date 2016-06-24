interface A
{
	static  int X = 100;
	void show();
}
interface B {
	static  int X = 200;
	void show();
	void print();
}
interface C extends A,B{
	void disp();
}
class W
{
	
}
// Not Multiple Inheritance , It is Multiple Implementation
class X extends W implements A,B
{
	public void show(){
		
	}
	public void print(){
		
	}
}
public class InterfaceRules {

	public static void main(String[] args) {
		

	}

}
