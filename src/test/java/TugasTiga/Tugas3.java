package TugasTiga;

import org.testng.annotations.Test;

import Tugas3.pages.LoginPage;
import Tugas3.pages.ProfilePage;


public class Tugas3 extends BaseWebTest{
	LoginPage loginPage = new LoginPage(driver, explicitWait);
	ProfilePage profilePage = new ProfilePage(driver, explicitWait);

	@Test (testName = "verify login is successful", description = "login will be working just fine ")
	public void test1() {
		String email = "testautomation";

		loginPage.login(email);
		String actualString = profilePage.getFirstMailText();
		System.out.println("Content : "+ actualString);
		
	}
}