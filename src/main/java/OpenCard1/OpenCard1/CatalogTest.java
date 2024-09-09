package OpenCard1.OpenCard1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

public class CatalogTest {
	
	  WebDriver driver;
	  
	  @FindBy (xpath="//i[@class='fa fa-tags fw']")
	  
	  WebElement catalogClick;
	  
	  @FindBy (xpath="//ul[@id='collapse1']//a[text()='Categories']")
	  
	  WebElement catagories;
	  
	  
	  @FindBy (xpath="//i[@class='fa fa-plus']")
	  
	  WebElement AddNew;
	  
	  @FindBy (id="input-name1")
	  
	  WebElement catagore;
	  
	  @FindBy (xpath="//div[@class='note-editable']")
	  
	  WebElement Textarea;
	  
	  @FindBy (id="input-meta-title1")
	  
	  WebElement mataTitlel;
	  
	  @FindBy (id="input-meta-description1")
	  
	  WebElement Mata;
	  
	  @FindBy (id="input-meta-keyword1")
	  
	  WebElement Keyword;
	  
	  @FindBy (xpath="//button[@form='form-category']")
	  
	  WebElement Submit;
	  
	  @FindBy (xpath="//div[@class='alert alert-danger alert-dismissible']")
	  
	  WebElement Alert;
	  
	  
	  
	  public void  catalogData() {
		  
		  catalogClick.click();
	  }
	  
	  public void catagiresMenu() {
		  
		  catagories.click();
	  }
	  
	  public void addNew() {
		  
		  AddNew.click();
	  }
	  
	  public void Catagires(String catagire) {
		  
			catagore.sendKeys(catagire);
	  }
	  
	  public void CatalogTextArea(String textarea) {
		  
		  Textarea.sendKeys(textarea);
	  }
	  
	  public void MataTatile(String matatitlel) {
		  
		  mataTitlel.sendKeys(matatitlel);
	  }
	  
	  public void MataData(String mata) {
		  
		  Mata.sendKeys(mata);
	  }
	  
	  public void KeyWord(String keyword) {
		  
		  Keyword.sendKeys(keyword);
	  }
	  
	  public void SubmitButton() {
		  
		  Submit.click();
	  }
	  
	  public void AlertMessageValidtion() {
		  
		  String Attualvalue =	Alert.getText();

			System.out.println(Attualvalue);

			String extpetedvalue = "[[Warning: You do not have permission to modify categories!\r\n" + "×]]";

			SoftAssert softassert = new SoftAssert();

			softassert.assertEquals(Attualvalue, extpetedvalue);

	  }
	  
	  public CatalogTest(WebDriver driver) {
		  
		  this.driver=driver;
		  
		  
		  PageFactory.initElements(driver, this);
	  }
	  
	  

}
