package testnglearning;

import org.testng.annotations.Test;

public class DependanciesManagement {
//Problem1:You have to Admit a Student To Engineering
//Problem1:You have to Admit a Student To higher Secondary
	@Test(enabled = true)
	public void highschool() {
	System.out.println("High School");	
	}
	@Test(dependsOnMethods = "highschool")
	public void higherSecondary() {
		System.out.println("High Sec Schooll");
	}
	@Test(dependsOnMethods = "higherSecondary")
	public void engineering() {
		System.out.println("college");
	}

}
