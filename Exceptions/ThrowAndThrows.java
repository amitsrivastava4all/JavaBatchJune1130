import java.sql.SQLException;

class LoginView
{
	void doLogin(){
		System.out.println("Ask Login");
		System.out.println("Call Helper");
		LoginHelper helper = new LoginHelper();
		try{
		helper.doLogin();
		System.out.println("Show the result to the User");
		}
		catch(SQLException e){
			System.out.println("DB Server Problem , Kindly re-login after some time");
		}
		}
}
class LoginHelper{
	void doLogin() throws SQLException{
		System.out.println("*********************************");
		System.out.println("Get Login Details from LoginView");
		System.out.println("Call to DAO");
		LoginDAO loginDAO = new LoginDAO();
		loginDAO.doLogin();
		System.out.println("Send DAO Result Back to LoginView");
		System.out.println("*************************************");
	}
}
class LoginDAO{
	// throws - When Ur Method Don't want to handle the exception
	// so it will throws to the caller 
	// so now caller will handle it
	// throws always on method level
	void doLogin() throws SQLException{
		System.out.println("###################################");
		try{
		System.out.println("Get Login Details From LoginHelper");
		System.out.println("Connection OPen ");
		System.out.println("DO Query");
		// throw is a Keyword , and it is used to Explicitly generate
		// the exception
		// throw always use on Statement Level
		if(10>2){
		throw new SQLException();
		}
		System.out.println("Get Result");
		}
		finally{
		System.out.println("Connection Close");
		System.out.println("###################################");
		}
		System.out.println("Send Result to Helper");
		
	}
}
public class ThrowAndThrows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginView view = new LoginView();
		view.doLogin();

	}

}
