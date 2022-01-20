package Tugas4.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public final class LoginPage extends BasePage{
//	By closeIklan = By.xpath("//*[@id=\"root\"]/div/div[2]/div/main/div[8]/span");
	By loginLink = By.xpath("//*[@id=\"SW\"]/div[1]/div[1]/ul/li[3]/div[3]/div/div[2]");
	By usernamePath = By.id("username");
	By continueBtn = By.xpath("//button[@class='capText font16']");
	By passwordPath = By.id("password");
	By loginBtn = By.xpath("//button[@class='capText font16']");
	By closeBtn = By.xpath("//span[@class='crossIcon popupSprite popupCrossIcon']");
	
	
	//pake constructer 
	public LoginPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		PageFactory.initElements(driver.get(), this);
	}
	
	public void login(String username, String password) {
//		clickAndWaitByXpath(closeIklan);
		clickAndWaitByXpath(loginLink);
		setText(usernamePath, username);
		clickAndWaitByXpath(continueBtn);
		setText(passwordPath, password);
		clickAndWaitByXpath(loginBtn);
		clickAndWaitByXpath(closeBtn);
	}
	
}