import java.awt.event.WindowAdapter;
import java.awt.event.WindowListener;

interface X{
	void show();
	void print();
	
}
// Adapter is a Design Pattern
abstract class XAdapter implements X
{
	@Override
	public void show(){}
	@Override
	public void print(){}
}
class Z extends XAdapter
{
	public void print(){
		System.out.println("");
	}
}
class Y extends XAdapter //implements X
{
	@Override
	public void show(){
		System.out.println("Y Show");
	}
//	@Override
//	public void print(){
//		System.out.println("Y Print ");
//	}
}
public class InterfaceProblem {

	public static void main(String[] args) {
		WindowListener l ;
		WindowAdapter w;
		// TODO Auto-generated method stub

	}

}
