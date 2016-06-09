strictfp class Calc
{
public static void main(String args[]){

//long w = 1000;
//int w1 = (int)w;
if(args.length==2){
try{
int a =Integer.parseInt(args[0]); //4 Bytes
int b =Integer.parseInt(args[1]);

int c = a + b;
System.out.println("Sum is "+c);
}
catch(NumberFormatException e){
System.out.println("Only Number Allowed U Enter Some Special Chars or Strings ");
}
}


else
{
System.out.println("Need two Values to run this Program , Insufficent Values ");
}
}
}