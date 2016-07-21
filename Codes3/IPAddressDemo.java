import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class IPAddressDemo {

	public static void main(String[] args) throws UnknownHostException {
		// TODO Auto-generated method stub
		InetAddress inet = InetAddress.getLocalHost();
		System.out.println("Host IP "+inet.getHostAddress());
		System.out.println("Host Name "+inet.getHostName());
		System.out.println("Enter the Host Name");
		Scanner scanner = new Scanner(System.in);
		String hostName = scanner.next();
		InetAddress inetArray[] = InetAddress.getAllByName(hostName);
		for(InetAddress i : inetArray){
			System.out.println("IP "+i.getHostAddress());
		}

	}

}
