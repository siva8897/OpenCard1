package OpenCard1.OpenCard1;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class CustomerFields {

	WebDriver driver;

	@FindBy(xpath = "//a[normalize-space(text()) ='Customers' and @data-toggle='collapse']")

	WebElement CustomerDetails;

	@FindBy(xpath = "//ul[@id='collapse5']//a[text()='Custom Fields']")

	WebElement CustomerFields;

	@FindBy(name = "custom_field_description[1][name]")

	WebElement CustomerfieldName;

	@FindBy(name = "location")

	WebElement Location;

	@FindBy(id = "input-type")

	WebElement Radio;

	@FindBy(name = "custom_field_customer_group[0][customer_group_id]")

	WebElement CustomerGrop;

	@FindBy(name = "custom_field_customer_group[1][customer_group_id]")

	WebElement CustomerGrop1;

	@FindBy(name = "custom_field_customer_group[0][required]")

	WebElement Required;

	@FindBy(name = "custom_field_customer_group[1][required]")

	WebElement Required1;

	@FindBy(name = "sort_order")

	WebElement sort;

	@FindBy(xpath = "//button[@form='form-custom-field']")

	WebElement Save;

	@FindBy(xpath = "//div[normalize-space(text())=\"Warning: Custom Field Values required!\"]")

	WebElement AlertMessage;

	public void CustomerData() {

		CustomerDetails.click();
	}

	public void CustomerFieldDetails() {

		CustomerFields.click();
	}

	public void Customerfieldname(String fieldName) {

		CustomerfieldName.sendKeys(fieldName);
	}

	public void Location1() {

		Select drop = new Select(Location);

		drop.selectByVisibleText("Address");
	}

	public void Radio1() {

		Select drop = new Select(Radio);

		drop.selectByVisibleText("Radio");
	}

	public void CustomerGrop() {

		CustomerGrop.click();
		CustomerGrop1.click();

	}

	public void Required() {

		Required.click();
		Required1.click();
	}

	public void Sort(String sort1) {

		sort.sendKeys(sort1);
	}

	public void save() {

		Save.click();

		SoftAssert sa = new SoftAssert();

		String AttualValue = AlertMessage.getText();

		String ExpatedValue = " Warning: Custom Field Values required!\r\n" + "      ";

		System.out.println(AttualValue);

		sa.assertEquals(ExpatedValue, AttualValue);
	}

	public CustomerFields(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

}
