class ArrayDemo{
public static void main(String args[]){
//int x[] = {10,20,30,40,50};
//int []x = {10,20,30,40,50};
int x[] = new int[5];
//int x[] = new int[]{10,20,40};
/*for(int y :x ){
System.out.println("Y is "+y);
}*/
//int z[][]= new int [3][10];
//int [][]z= new int [3][10];
//int []z[]= new int [3][10];
//int z[][]= {{10,20,30},{90,88,11}};
int z[][] = new int[3][];
z[0] = new int[10];
z[1] = new int[20];
z[2] = new int[30];
for(int y[] : z){
for(int d : y){
System.out.print(d+ " " );
}
System.out.println();
}
/*
for(int i = 0 ; i<z.length; i++){
for(int j = 0 ; j<z[i].length; j++){
System.out.print(z[i][j]+" ");
}
System.out.println();
}
*/
}
}