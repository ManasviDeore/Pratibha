package Program1;

import org.testng.annotations.Test;

public class IntroductionToTestNG {
	// my program is succesfully Run
	// @Test ==> Annotation  ==> @ ==> annotations
	// 1. open url ==> login ==> logout
	// output ==> 3 place
	// 1. regular console
	// 2. testng console
	// 3. report (test-output)
	
	// Testng ==> execute ==> alphabetical order
	// testng execution control ==> keyword ==> priority  ==> numerical numbers ==> positive or negative or zero
	
	
	
	@Test (priority = 13)
	public void logout() {
		System.out.println("Logged out from the application sucessfully");
	}
	
	
	@Test (priority = 1)
	public void openurl() {
		System.out.println("Url is opened");
	}
	
	@Test (priority = 12)
	public void login() {
		System.out.println("Logged into the application successfully");
	}
	
	

}
