
public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String is Bad for Modification 
		// String is Immutable
		// And For Modification of String Java Build StringBuffer Class
		String a = "Hello";
		// a[0] - H a[1]-e
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println("Total Capacity is "+sb.capacity());
		System.out.println("Total Length is "+sb.length());
		
		// new capacity = oldcapacity * 2  + 2
		// 21 * 2 + 2 = 44
		// Now it create a new Array of 44 size and copy the old array in 
		// new array and then delete the old array
		//sb.ensureCapacity(1000);
		// Hello length + 16 Space = array 21, filled 5 , 21 - 5 = 16
		// if length>newcapacity
		// newcapacity = length
		sb.append("How are you jhfjhjfkjfghkjfghkjflkjhkjfhjfljhklfjhkljfglkhkhjjhhj");
		//sb.ensureCapacity(100);
		System.out.println(sb);
		System.out.println("After Append ...............");
		System.out.println("Total Capacity is "+sb.capacity());
		System.out.println("Total Length is "+sb.length());
	}

}
