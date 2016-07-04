
public class Demo2 {
	static void finallyDemo(){
		try{
			System.out.println("Open a DB Connection....");
			System.out.println("Do Query to the DataBase");
			//int e = 100/0;
			if(100>2){
				System.exit(0);
				//return ;
			}
			System.out.println("Get the DB Result");
			//System.out.println("Close the DB Connection");
		}
		catch(Exception e){
			System.out.println("Some Problem");
			//int k = 10/0;
			//System.out.println("Close the DB Connection");
			
		}
		finally{
			System.out.println("(FINALLY)Close the DB Connection");
		}
		//int p= 10/0;
		//System.out.println("Close the DB Connection");
	}
	public static void main(String[] args) {
		finallyDemo();
		// TODO Auto-generated method stub
		
		// finally is a block and this block always execute
		// if exception occured or not it will execute

	}

}
