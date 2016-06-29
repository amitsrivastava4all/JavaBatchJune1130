interface A1
{
	default void print(){
		System.out.println("A1 Print Call");
	}
}
interface A2
{
	default void print(){
		System.out.println("A2 Print Call");
	}
}
class A3 implements A1, A2
{
	@Override
	public void print(){
		A1.super.print();
		A2.super.print();
		System.out.println("this is a3 print...");
	}
}
public class JavaMultipleInheritanceProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A3 obj = new A3();
		obj.print();
	}

}
