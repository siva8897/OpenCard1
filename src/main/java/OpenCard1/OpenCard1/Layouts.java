package OpenCard1.OpenCard1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Layouts {
	
	
	WebDriver driver;
	
	@FindBy (xpath="//ul[@id=\"menu\"]//a[text()=\" Design\"]")
	
	WebElement Design;
	
	@FindBy (xpath="//ul[@id=\"collapse3\"]//a[text()=\"Layouts\"]")
	
	WebElement Layouts;
	
	@FindBy (id="input-name")
	
	WebElement LayoutName;
	
	@FindBy (xpath="//button[@data-original-title=\"Add Route\"]")
	
	WebElement AddRouter;
	
	@FindBy (xpath="//input[@name=\"layout_route[0][route]\"]")
	
	WebElement Router;
	
	@FindBy (xpath="//select[@class=\"form-control input-sm\"][1]")
	
	WebElement Left;
	
	@FindBy (xpath="//button[@onclick=\"addModule('column-left');\"]")
	
	WebElement AddLeft;
	
	@FindBy (xpath="(//select[@class='form-control input-sm'])[1]")
	
	WebElement Left1;
	
	@FindBy (xpath="//table[@id='module-content-top']//select[@class='form-control input-sm']")
	
	WebElement Contenttop;
	
	@FindBy (xpath="//table[@id='module-column-right']//select[@class='form-control input-sm']")
	
	WebElement CoulumnRigh;
	
	@FindBy (xpath="//table[@id='module-content-bottom']//select[@class='form-control input-sm']")
	
	WebElement ContentButton;
	

	
	
	public void design() {
		
		Design.click();
	}
	
	public void layouts() {
		
		Layouts.click();
	}
	
	public void layoutName(String lName) {
		
		LayoutName.sendKeys(lName);
	}
	
	public void addRouter() {
		
		AddRouter.click();
	}
	
	public void router(String rout) {
		
		Router.sendKeys(rout);
	}
	
	public void leftDrop() {
		
		Select ldrop= new Select(Left);
		
		ldrop.selectByIndex(1);
	}
	
	public void addLeft() {
		
		AddLeft.click();
	}
	
	public void leftDrop1() {
		
		Select drop1= new Select(Left1);
		
		drop1.selectByIndex(8);
	}
	
	
	public void contenttop() {
		
		Select drop2= new Select(Contenttop);
		
		drop2.selectByIndex(2);
	}
	
	public void columnRigth() {
		
		Select drop3= new Select(CoulumnRigh);
		
		drop3.selectByValue("adv_profit_module");
	}
	
	public void Contantbutton() {
		
		Select drop4= new Select(ContentButton);
		
		drop4.selectByValue("adv_profit_module");
	}
	
	public Layouts(WebDriver driver) {
		
		 this.driver=driver;
		 
		 PageFactory.initElements(driver, this);
	}

}
