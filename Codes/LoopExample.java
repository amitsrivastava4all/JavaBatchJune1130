//import java.lang.*;
import java.util.*;
class LoopExample
{
public static void main(String args[]){
// Java 1.8 ForEach (2013)
ArrayList l = new ArrayList();  //10 Size Array
l.add(10);  // 0th Index
l.add(20); // 1st Index
l.add(0,100);
System.out.println("ForEach Loop Example ");
l.forEach((a)->System.out.println(a));  //Lambda 
// Enhance for Loop  (Java 1.5) (2007)
// It is for Array Traverse
int w[] = {10,20,30,40,50};
System.out.println("Enhance For Loop ");
for(int y : w){
System.out.println(y);
}

System.out.println("Older Approach ");
for(int i = 0; i<w.length; i++){
System.out.println(w[i]);
}
/*
int x = 100;

int k = 1;
while(k<=10){
System.out.println("K is "+k);
if(k==5)
k++;
else
k+=2;
}

do{
System.out.println("Inside Do While Loop ");
}while(10>20)
while(10>20){
System.out.println("Inside While Loop ");
}
int i = 1;
for(; i<=10; ){
System.out.println("I is "+i);
i++;
}*/
}
}