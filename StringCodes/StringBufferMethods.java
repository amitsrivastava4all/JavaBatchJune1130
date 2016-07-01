
public class StringBufferMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		sb.append("hello");
		System.out.println("sb "+sb);
		sb.append("hi");  // add in end
		
		System.out.println("After APpend "+sb);
		sb.insert(1, "Friends");  // add at index
		System.out.println("After Insert "+sb);
		sb.deleteCharAt(0); // single char delete
		System.out.println("After Single char delete "+sb);
		sb.delete(2, 5); // 2 is index and 5 position
		System.out.println("After Multi Char Delete "+sb);
		sb.reverse();
		System.out.println("Reverse is "+sb);
		sb.charAt(0);
		sb.indexOf("h");
		sb.lastIndexOf("h");
	}

}
