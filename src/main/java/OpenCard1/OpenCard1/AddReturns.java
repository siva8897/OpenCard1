package OpenCard1.OpenCard1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddReturns {

	WebDriver driver;

	@FindBy(linkText = "Returns")

	WebElement Return;

	@FindBy(name = "order_id")

	WebElement Orderid;

	@FindBy(xpath = "//i[@class='fa fa-calendar']")

	WebElement Calander;

	@FindBy(xpath = "//div[@class='datepicker-days']//th[@class='prev'][contains(text(),'‹')]")

	WebElement prv;

	@FindBy(xpath = "//table[@class='table-condensed']/thead/tr/th[text()='February 2023']")

	WebElement emonthandyear;

	@FindBy(xpath = "//td[@class='day'][normalize-space()='4']")

	WebElement edate;

	@FindBy(name = "product")

	WebElement product;

	@FindBy(name = "model")

	WebElement model;
	
	@FindBy(name="quantity")
	
	WebElement Quantity;
	
	@FindBy(name="comment")
	
	WebElement Comment;
	
	@FindBy(name="return_action_id")
	
	WebElement Action;
	
	@FindBy(name="return_status_id")
	
	WebElement Status;
	
	

	public void returns() {

		Return.click();
	}

	public void orderid(String orderId) {

		Orderid.sendKeys(orderId);
	}

	public void SelectCalader() throws InterruptedException {

		Calander.click();

		/*
		 * String monthandyear = "February 2023";
		 * 
		 * String date = "4";
		 * 
		 * Calander.click();
		 * 
		 * prv.click();
		 * 
		 * while (true) {
		 * 
		 * String MonthandYear = emonthandyear.getText();
		 * 
		 * 
		 * 
		 * String Date = edate.getText();
		 * 
		 * 
		 * Thread.sleep(5000);
		 * 
		 * if (MonthandYear.equals(monthandyear) && Date.equals(date)) {
		 * 
		 * emonthandyear.click();
		 * 
		 * edate.click();
		 * 
		 * break; } }
		 */
	}

	public void Product(String product1) {

		product.sendKeys(product1);
	}

	public void Model(String model1) {

		model.sendKeys(model1);
	}
	
	public void quntity(String Qunitity) {
		
		Quantity.sendKeys(Qunitity);
	}
	
	public void Comment(String comment) {
		
		Comment.sendKeys(comment);
	}
	
	public void action() {
		
		Select drop= new Select( Action);
		
		drop.selectByVisibleText("Replacement Sent");
	}
	
	public void Status() {
		
		Select drop1= new Select(Status);
		
		drop1.selectByVisibleText("Pending");
	}

	public AddReturns(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

}
