package demo;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DetaProvider {
	
	
	public Object [] [] provideData(){
		Object [] [] data = new Object [500] [500];
		
		return data;
	}

	
	@Test(dataProvider = "provideData")
	void test(String username, String pass){
		
	}
}




