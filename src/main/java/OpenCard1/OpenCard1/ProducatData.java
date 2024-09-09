package OpenCard1.OpenCard1;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class ProducatData {

	WebDriver driver;

	@FindBy(xpath = "//ul[@class='nav nav-tabs']//a[text()='Data']")

	WebElement DataLink;

	@FindBy(id = "input-model")

	WebElement Model;

	@FindBy(xpath = "//div[text()='Product Model must be greater than 1 and less than 64 characters!']")

	WebElement ExptedText;

	@FindBy(id = "input-sku")

	WebElement StockKeeping;

	@FindBy(id = "input-upc")

	WebElement UnivasalProducatCode;

	@FindBy(id = "input-ean")

	WebElement UropanArticalNumber;

	@FindBy(id = "input-jan")

	WebElement JapaniesArticalNumber;

	@FindBy(id = "input-isbn")

	WebElement InternationalNumber;

	@FindBy(id = "input-mpn")

	WebElement ManufaturingPartNumber;

	@FindBy(id = "input-location")

	WebElement Location;

	@FindBy(id = "input-supplier")

	WebElement Supplier;

	@FindBy(id = "price")

	WebElement Price;

	@FindBy(id = "input-price")

	WebElement priceTax;

	@FindBy(id = "input-costing-method")

	WebElement CostingMethoed;

	@FindBy(id = "cost_amount")

	WebElement CostAmount;

	@FindBy(id = "cost_percentage")

	WebElement CostPercentage;

	@FindBy(id = "cost_additional")

	WebElement CostAdditional;

	@FindBy(id = "restock_quantity")

	WebElement Quantity;

	@FindBy(id = "input-tax-class")

	WebElement TaxClass;

	@FindBy(xpath = "//button[@class=\"btn btn-default\"]")

	WebElement CalanderClick;

	@FindBy(xpath = "//table[@class='table-condensed']//tr//td[text()='17']")

	WebElement SelectDate;
	
	@FindBy(id="input-length")
	
	WebElement Length;
	
	@FindBy(id="input-width")
	
	WebElement Width;
	
	@FindBy(id="input-height")
	
	WebElement Heigth;
	
	@FindBy(id="input-weight")
	
	WebElement Weight;

	public void DataLinkMenu() {

		DataLink.click();
	}

	public void modelDetails(String model) {

		Model.sendKeys(model);
	}

	public void exptedText() {

		System.out.println(ExptedText.getText());

		String Attualtext = ExptedText.getText();

		String exptedText = "Product Model must be greater than 1 and less than 64 characters!";

		Assert.assertEquals(Attualtext, exptedText);

	}

	public void SKU(String stockKeeping) {

		StockKeeping.sendKeys(stockKeeping);
	}

	public void univsalProductCode(String UPC) {
		UnivasalProducatCode.sendKeys(UPC);
	}

	public void uropeanAritalNumber(String UAN) {

		UropanArticalNumber.sendKeys(UAN);
	}

	public void japaniesArticalNumber(String JAN) {

		JapaniesArticalNumber.sendKeys(JAN);
	}

	public void InterNationalNumberData(String ISBN) {

		InternationalNumber.sendKeys(ISBN);
	}

	public void manufatringPartNumber(String MPN) {

		ManufaturingPartNumber.sendKeys(MPN);
	}

	public void location(String loc) {

		Location.sendKeys(loc);
	}

	public void Suppiers() {

		Select drop = new Select(Supplier);

		drop.selectByIndex(4);
	}

	public void PriceData(String price) {

		Price.sendKeys(price);
	}

	public void PriceTax(String pTax) {

		priceTax.sendKeys(pTax);
	}

	public void costingMethod() {

		Select costDrop = new Select(CostingMethoed);

		costDrop.selectByIndex(1);
	}

	public void costAmount(String costA) {

		CostAmount.clear();

		CostAmount.sendKeys(costA);
	}

	public void costPersentage(String cPersentage) {

		CostPercentage.clear();

		CostPercentage.sendKeys(cPersentage);
	}

	public void costAdditional(String cAdditional) {

		CostAdditional.clear();

		CostAdditional.sendKeys(cAdditional);
	}

	public void quantity(String quty) {

		Quantity.clear();

		Quantity.sendKeys(quty);
	}

	public void taxClass() {

		Select dropc = new Select(TaxClass);

		dropc.selectByValue("9");

	}

	public void CanaderSelect() {

		CalanderClick.click();
		SelectDate.click();

	}
	
	public void length(String len) {
		
		Length.sendKeys(len);
	}
	
	public void width(String wid) {
		
		Width.sendKeys(wid);
	}
	
	public void heigth(String heig) {
		
		Heigth.sendKeys(heig);
	}
	
	public void weigth(String weig) {
		
		Weight.sendKeys(weig);
	}
	
	

	public ProducatData(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);
	}
}
