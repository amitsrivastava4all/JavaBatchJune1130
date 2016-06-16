import org.testng.Assert;
import org.testng.annotations.Test;


public class TestCases {
@Test(timeOut=1000,priority=1)
	//@Test(enabled=false)
	//@Test(priority=1)	
public void testNegativeSalary(){
	double expectedResult = 0.0;
	Employee employee = new Employee();
	double result = employee.computeHRA(-9000);
	Assert.assertEquals(result, expectedResult);
	//Assert.assertEquals(0,0);
}

@Test(priority=2)	
public void testNegativeSalary2(){
	double expectedResult = 2700;
	Employee employee = new Employee();
	double result = employee.computeHRA(9000);
	Assert.assertEquals(result, expectedResult);
	//Assert.assertEquals(0,0);
}
}
