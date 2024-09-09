package OpenCard1.OpenCard1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {

	WebDriver driver;

	@FindBy(id = "input-username")
	WebElement usernameField;

	@FindBy(id = "input-password")
	WebElement passwordField;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement loginButton;

	public void loginDetials(String userName, String password) {

		usernameField.sendKeys(userName);

		passwordField.sendKeys(password);

	}

	public void loginClick() {

		loginButton.click();

	}

	public loginPage(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

}
