package TugasEmpat;

import org.testng.annotations.Test;
import Tugas4.pages.ListFlightPage;
import Tugas4.pages.LoginPage;
import Tugas4.pages.SearchPage;

public class Tugas4 extends BaseWebTest{
	LoginPage loginPage = new LoginPage(driver, explicitWait);
	SearchPage searchTripPage = new SearchPage(driver, explicitWait);
	ListFlightPage listFlightPage = new ListFlightPage(driver, explicitWait);

	@Test (testName = "sukses", description = "Print harga")
	public void test() {
		String username = "muhammadtaufik433@gmail.com";
		String password = "Taufik433";
		String from = "Jogja";
		String to = "Jakarta";
		loginPage.login(username, password);
		searchTripPage.searchTrip(from, to);
		listFlightPage.viewPrice();
		String actualString = listFlightPage.viewPrice();
		System.out.println("Price with decimal separator: "+ actualString.replaceAll("[^0-9,]", ""));
		System.out.println("Price without decimal separator: "+ actualString.replaceAll("[^0-9]", ""));
	}
}