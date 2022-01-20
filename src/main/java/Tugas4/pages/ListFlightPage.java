package Tugas4.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ListFlightPage extends BasePage{
	String pricePath ="//*[@id=\"flight_list_item_0_RKEY:346930b0-c66a-45a7-a9a1-3f752f6eb8fe:6_0\"]/div[1]/div[2]/div[4]/div/div/p";

	public ListFlightPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		PageFactory.initElements(driver.get(), this);
	}

	public String viewPrice() {
		return driver.get().findElement(By.xpath(pricePath)).getText();
	}
}