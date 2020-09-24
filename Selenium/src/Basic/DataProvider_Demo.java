package Basic;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Demo {
  @Test(dataProvider="cred")
  public void f(String name,String password) {
	  System.out.println(name);
	  System.out.println(password);
  }
  
@DataProvider(name="cred")
public Object[][] getData(){
	Object[][] data= new Object[2][2];
	
	data[0][0] = "donhere";
	data[0][1] = "123";
	
	data[1][0] = "donhere@123";
	data[1][1] = "123456";
	
	return data;
}
  
}
