class TT
{
	TT(int x){
		
	}
}
class A1{
A1(int x)
{
System.out.println("I am A1 Param Cons");
}
}

class B1 extends A1
{
B1(int x)
{
super(100);
System.out.println("I am B1 Param Cons");
}
}
public class ConstructorRules {

	public static void main(String[] args) {
		TT obj = new TT(444);

	}

}
