/*
 * What is Overriding - When There is Inheritance , We have an option to override the parent 
 * methods in child . Signature must be same
 * 1. Weaker Access Rule
 * Why We Do Overriding
 * When some feature is coming from parent and that feature is outdated for child, then 
 * we need overriding
 *2. Return Covariant (Parent-Child) Type
 */

class K
{
	 Number display(){
		return 100;
	}
}

class K1 extends K
{
Integer display(){
	return 200;
}
}

class Z
{
	int p,q;
}
class X
{
	int a,b,c;
}
class Xplus extends X
{
	int d,e;
}
class P
{
	//private int b;
	//int c;
	protected X print(){
		System.out.println("Old Print");
		X obj = new X();
		return obj;
	}
}
class P2 extends P
{
	private int a;
	//@Override  // U r saying to the compiler i am doing overriding
	 public Xplus print(){
		System.out.println("New Print");
		Xplus obj = new Xplus();
		return obj;
	}
	 public Z show(){
		 Z obj = new Z();
		 return obj;
	 }
}
public class OverrideRules {

	public static void main(String[] args) {
		P2 obj = new P2();
		obj.print();

	}

}
