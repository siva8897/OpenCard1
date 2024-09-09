package OpenCard1.OpenCard1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Producat {

	WebDriver driver;

	@FindBy(xpath = "//ul[@id='collapse1']//a[text()='Products']")

	WebElement producatClick;

	@FindBy(xpath = "//div[@class='table-responsive']//tbody//tr//td")

	List<WebElement> ProducatList;
	
	@FindBy(id="input-name1")
	
	WebElement ProducatName;
	
	@FindBy(xpath="//div[@class='note-editable']")
	
	WebElement ProductDescription;
	
	@FindBy(xpath="//i[@class='note-icon-bold']")
	
	WebElement BoldButton;
	
	@FindBy(id="input-tag1")
	
	WebElement productTages;
	
	@FindBy(xpath="//i[@class='fa fa-save']")
	
	WebElement saveButton;

	public void ProducatMenu() {

		producatClick.click();
	}

	public void ProducatListData() {

		List<WebElement> prodeuctlist = new ArrayList<WebElement>(ProducatList);

		Iterator<WebElement> it = prodeuctlist.iterator();

		String product = "iMac";

		while (it.hasNext()) {

			WebElement productName = it.next();

			// System.out.println(productName.getText());

			if (productName.getText().contains(product)) {

				System.out.println(productName.getText());

			}
		}
	}
	
	public void productName(String productname) {
		
		ProducatName.sendKeys(productname);
	}
	
	public void productDescription(String productDesc) {
		
		ProductDescription.sendKeys(productDesc);
		
	
	}
	
	public boolean boldButton() {
		
		BoldButton.click();
		
		return true;
		
	}
	
	public void ProductTages(String producttages) {
		
		productTages.sendKeys(producttages);
	}
	
	public void SaveButton() {
		
		saveButton.click();
	}

	public Producat(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

}
