class MainWays
{
/*
void show(){
}
void show(int x){
}
void show(int x,int y ){
}*/
// Java 5 (Variable Arguments ) (var -args) (variable arity)
static void show(int ...x)
{
System.out.println("Hello Show ");
// Enhance for loop (Java 5)
for(int y : x){
System.out.println(y);
}
/*
for(int i = 0 ; i<x.length; i++){
System.out.println("X is "+x[i]);
}
*/

}
static public void main(){
System.out.println("My Main ");
}
static public void main(String args[]){
main();
int sum = 0;

for(String x : args){
sum = sum + Integer.parseInt(x);
}
System.out.println("Sum is "+sum);
/*
show();
show(10);  
show(20,10);
show(10,20,30,40);
System.out.println("Hello Java ");
*/
//return 0;
}
}