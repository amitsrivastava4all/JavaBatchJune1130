import java.util.Scanner;

public class StringBuilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// StringBuilder comes in Java 5
		// StringBuffer Legacy Class 
		// StringBuilder Methods are Not Synchronized
		// StringBuffer Methods are Synchronized
		StringBuilder sb = new StringBuilder(500);
		//StringBuffer sb = new StringBuffer(500);
		//StringBuffer sb = new StringBuffer("select * from products where type='");
		sb.append("select * from products where type='");
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the Product Type ");
		String type = scanner.next();
		//sql = sql +type+"'";
		sb.append(type).append("'");
		System.out.println("Enter the Price");
		double price = scanner.nextDouble();
		//sql = sql + " and price > "+price;
		sb.append(" and price>").append(price);
	}

}
