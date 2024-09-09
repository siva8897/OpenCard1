package OpenCard1.OpenCard1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddOrder {

	WebDriver driver;

	@FindBy(xpath = "//ul[@id=\"menu\"]//a[text()=\" Sales\"]")

	WebElement Sales;

	@FindBy(xpath = "//ul[@id=\"collapse4\"]//a[text()=\"Orders\"]")
	WebElement Orders;

	@FindBy(id = "input-customer")
	WebElement Customer;
	
	@FindBy(id="input-custom-field4")
	WebElement ICNumber;
	
	@FindBy(id="input-custom-field3")
	WebElement CompanyName;
	
	@FindBy(id="input-custom-field2")
	WebElement CompanyId;
	
	@FindBy(id="input-custom-field1")
	WebElement VATNumber;
	
	@FindBy(id="input-customer-group")
	
	WebElement CustomerGroup;
	
	@FindBy(id="input-firstname")
	WebElement FirstName;
	
	@FindBy(id="input-lastname")
	WebElement LastName;
	
	@FindBy(id="input-email")
	WebElement Email;
	
	@FindBy(id="input-telephone")
	WebElement Telephone;
	
	@FindBy(id="button-customer")
	WebElement Button;
	
	

	public void sales() {

		Sales.click();
	}

	public void order() {

		Orders.click();
	}

	public void customer(String cust) {

		Customer.sendKeys(cust);
	}
	
	public void IcNumber(String ICNum) {
		ICNumber.sendKeys(ICNum);
	}
	
	public void CompanyName(String CName) {
		
		CompanyName.sendKeys(CName);
	}
	
	public void CompanyID(String cId) {
		
		CompanyId.sendKeys(cId);
	}
	
	public void VATnumber(String VNumber) {
		
		VATNumber.sendKeys(VNumber);
	}
	
	public void customerGroup() {
		
		Select custdrop= new Select(CustomerGroup);
		
		custdrop.selectByValue("2");
	}
	
	public void firstName(String fName) {
		
		FirstName.sendKeys(fName);
	}
	
	public void lastName(String lName) {
		
		LastName.sendKeys(lName);
	}
	
	public void email(String mail) {
		
		Email.sendKeys(mail);
	}
	
	public void phoneNumber(String pNumber) {
		
		Telephone.sendKeys(pNumber);
	}
	
	public void button() {
		Button.click();
		
		
	}

	public AddOrder(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

}
