package StepDefinations;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import OpenCard1.OpenCard1.AddOrder;
import OpenCard1.OpenCard1.AddReturns;
import OpenCard1.OpenCard1.CatalogTest;
import OpenCard1.OpenCard1.CustomerFields;
import OpenCard1.OpenCard1.Layouts;
import OpenCard1.OpenCard1.Producat;
import OpenCard1.OpenCard1.ProducatData;
import OpenCard1.OpenCard1.loginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenCardData {

	static WebDriver driver;
	public loginPage loginpage;

	public CatalogTest catalogpage;

	public Producat producat;

	public ProducatData producatData;

	public AddOrder addOrder;

	public Layouts layouts;

	public AddReturns addReturns;

	public CustomerFields customerfields;

	@Given("is an landing page")
	public void is_an_landing_page() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.get("https://demo3x.opencartreports.com/admin/index.php?route=common/login");
		loginpage = new loginPage(driver);

		driver.manage().window().maximize();
	}

	@When("Login into application with {string} and password {string};")
	public void login_into_application_with_and_password(String userName, String password) {

		loginpage.loginDetials(userName, password);

	}

	@When("clicked on login button")
	public void clicked_on_login_button() {

		loginpage.loginClick();

	}

	@Given("is an Catlalog menu")
	public void is_an_catlalog_menu() {

		catalogpage = new CatalogTest(driver);
		catalogpage.catalogData();
	}

	@When("Dashboard page menu bar user has clicked on Catalog")
	public void dashboard_page_menu_bar_user_has_clicked_on_catalog() {

	}

	@When("clicked on Categories Menu button")
	public void clicked_on_categories_menu_button() {
		catalogpage.catagiresMenu();
	}

	@When("clicked on AddNew button")
	public void clicked_on_add_new_button() {

		catalogpage.addNew();
	}

	@When("User enter data Catagorie text box {string};")
	public void user_enter_data_catagorie_text_box(String catagire) {

		catalogpage.Catagires(catagire);
	}

	@When("User enter data Description text area {string};")
	public void user_enter_data_description_text_area(String textarea) {

		catalogpage.CatalogTextArea(textarea);
	}

	@When("User enter data Mata tag Titel text box {string};")
	public void user_enter_data_mata_tag_titel_text_box(String mataTitlel) {

		catalogpage.MataTatile(mataTitlel);
	}

	@When("User enter data Mata tag Discription {string};")
	public void user_enter_data_mata_tag_discription(String mata) {

		catalogpage.MataData(mata);

	}

	@When("User enter data Mata tag Mata Tag KeyWords {string};")
	public void user_enter_data_mata_tag_mata_tag_key_words(String keyword) {

		catalogpage.KeyWord(keyword);
	}

	@When("User has clicked on save button")
	public void user_has_clicked_on_save_button() {

		catalogpage.SubmitButton();
	}

	@When("verifiy the valition")
	public void verifiy_the_valition() {

		catalogpage.AlertMessageValidtion();

	}

	@Given("is an Prodct page menu")
	public void is_an_prodct_page_menu() {

		producat = new Producat(driver);

		producat.ProducatMenu();
	}

	@Given("Dashboard page menu bar user has clicked on Products")
	public void dashboard_page_menu_bar_user_has_clicked_on_products() {

		producat.ProducatListData();

	}

	@Given("User clicked on pules icon")
	public void user_clicked_on_pules_icon() {
		catalogpage = new CatalogTest(driver);
		catalogpage.addNew();

	}

	@Given("User Add data in Producat Name text box {string};")
	public void user_add_data_in_producat_name_text_box(String productname) {
		producat = new Producat(driver);
		producat.productName(productname);
	}

	@Given("User Enter data in Producat Discription text box {string}")
	public void user_enter_data_in_producat_discription_text_box(String productDesc) {

		producat.productDescription(productDesc);

	}

	@Given("User has clicked on Bold button")
	public void user_has_clicked_on_bold_button() {

		boolean flage = producat.boldButton();

		assertEquals(flage, true);

	}

	@Given("User enter data Producat Mata tag Titel text box {string};")
	public void user_enter_data_producat_mata_tag_titel_text_box(String matatitlel) {

		catalogpage = new CatalogTest(driver);
		catalogpage.MataTatile(matatitlel);

	}

	@Given("User enter data Product Mata tag Discription {string};")
	public void user_enter_data_product_mata_tag_discription(String mata) {

		catalogpage.MataData(mata);
	}

	@Given("User enter data Product Mata tag Mata Tag KeyWords {string};")
	public void user_enter_data_product_mata_tag_mata_tag_key_words(String keyword) {

		catalogpage.KeyWord(keyword);

	}

	@Given("User enter data Producat Tages {string}")
	public void user_enter_data_producat_tages(String productTages) {

		producat.ProductTages(productTages);
	}

	@Given("User has clicked Product on save button")
	public void user_has_clicked_product_on_save_button() {

		producat.SaveButton();
	}

	@Given("verifiy the valition in Procuct")
	public void verifiy_the_valition_in_procuct() {

		catalogpage.AlertMessageValidtion();
	}

	// Producat Data

	@Given("User has clicked on Data link")
	public void user_has_clicked_on_data_link() {

		producatData = new ProducatData(driver);

		producatData.DataLinkMenu();

	}

	@Given("User has Enter data in Model text box {string}")
	public void user_has_enter_data_in_model_text_box(String model) {

		producatData.modelDetails(model);
	}

	@Given("User has validate Message")
	public void user_has_validate_message() {

		producatData.exptedText();
	}

	@Given("User has Enter data SKU text box {string};")
	public void user_has_enter_data_sku_text_box(String stockKeeping) {

		producatData.SKU(stockKeeping);
	}

	@Given("User has Enter data UPC text box {string};")
	public void user_has_enter_data_upc_text_box(String UPC) {

		producatData.univsalProductCode(UPC);
	}

	@Given("User has Enter data EAN text box {string};")
	public void user_has_enter_data_ean_text_box(String UAN) {

		producatData.uropeanAritalNumber(UAN);
	}

	@Given("User has Enter data JAN text box {string};")
	public void user_has_enter_data_jan_text_box(String JAN) {

		producatData.japaniesArticalNumber(JAN);
	}

	@Given("User has Enter data ISBN text box {string};")
	public void user_has_enter_data_isbn_text_box(String ISBN) {

		producatData.InterNationalNumberData(ISBN);
	}

	@Given("User has Enter data MPN text box {string};")
	public void user_has_enter_data_mpn_text_box(String MPN) {

		producatData.manufatringPartNumber(MPN);
	}

	@Given("User has Enter data Location text box {string};")
	public void user_has_enter_data_location_text_box(String loc) {

		producatData.location(loc);
	}

	@Given("User has select Suplier dropdown value")
	public void user_has_select_suplier_dropdown_value() {

		producatData.Suppiers();

	}

	@Given("User has Enter data Price text box {string};")
	public void user_has_enter_data_price_text_box(String price) {

		producatData.PriceData(price);
	}

	@Given("User has Enter data PriceInclTex {string};")
	public void user_has_enter_data_price_incl_tex(String pTax) {

		producatData.PriceTax(pTax);
	}

	@Given("User has select Costing Methos value")
	public void user_has_select_costing_methos_value() {

		producatData.costingMethod();
	}

	@Given("User has Enter BaseCost text box {string};")
	public void user_has_enter_base_cost_text_box(String cAmount) {

		producatData.costAmount(cAmount);

	}

	@Given("User has Enter BaseCost Perseatage text box {string};")
	public void user_has_enter_base_cost_perseatage_text_box(String cPersentage) {

		producatData.costPersentage(cPersentage);

	}

	@Given("User has Enter Additonal cost text box {string};")
	public void user_has_enter_additonal_cost_text_box(String CostAdditional) {

		producatData.costAdditional(CostAdditional);
	}

	@Given("User has Enter Quitity text box {string};")
	public void user_has_enter_quitity_text_box(String quty) {

		producatData.quantity(quty);

	}

	@Given("User has select data taxClass value")
	public void user_has_select_data_tax_class_value() {

		producatData.taxClass();
	}

	@Given("User has select DataAvaible")
	public void user_has_select_data_avaible() {

		producatData.CanaderSelect();
	}

	@Given("User has Enter Length text box {string};")
	public void user_has_enter_length_text_box(String len) {

		producatData.length(len);
	}

	@Given("User has Enter Width text box {string};")
	public void user_has_enter_width_text_box(String wid) {

		producatData.width(wid);
	}

	@Given("User has Enter Height text box {string};")
	public void user_has_enter_height_text_box(String heig) {

		producatData.heigth(heig);

	}

	@Given("User has Enter Weigth text box {string};")
	public void user_has_enter_weigth_text_box(String weig) {

		producatData.weigth(weig);
	}

	// Add Order

	@Given("User has Clicked on Sales link")
	public void user_has_clicked_on_sales_link() throws Exception {

		addOrder = new AddOrder(driver);

		addOrder.sales();
		Thread.sleep(3000);

	}

	@Given("User has Clicked on Order link")
	public void user_has_clicked_on_order_link() {

		addOrder.order();

	}

	@Given("User has Enter Customer text box {string};")
	public void user_has_enter_customer_text_box(String cust) {

		catalogpage = new CatalogTest(driver);
		catalogpage.addNew();

		addOrder = new AddOrder(driver);
		addOrder.customer(cust);
	}

	@Given("User has Enter Ic Number text box {string};")
	public void user_has_enter_ic_number_text_box(String ICNum) {

		addOrder.IcNumber(ICNum);

	}

	@Given("User has Enter Company Name text box {string};")
	public void user_has_enter_company_name_text_box(String CName) {

		addOrder.CompanyName(CName);
	}

	@Given("User has Enter Company Id text box {string};")
	public void user_has_enter_company_id_text_box(String cId) {

		addOrder.CompanyID(cId);
	}

	@Given("User has Enter VAT Number text box {string};")
	public void user_has_enter_vat_number_text_box(String VNumber) {

		addOrder.VATnumber(VNumber);
	}

	@Given("User has Select Customer Grop dropdown list;")
	public void user_has_select_customer_grop_dropdown_list() {

		addOrder.customerGroup();
	}

	@Given("User has Enter FirstName text box {string};")
	public void user_has_enter_first_name_text_box(String fName) {

		addOrder.firstName(fName);
	}

	@Given("User has Enter LastName text box {string};")
	public void user_has_enter_last_name_text_box(String lName) {

		addOrder.lastName(lName);
	}

	@Given("User has Enter EMail text box {string};")
	public void user_has_enter_e_mail_text_box(String email) {

		addOrder.email(email);

	}

	@Given("User has Enter Phone Number text box {string};")
	public void user_has_enter_phone_number_text_box(String pNumber) {

		addOrder.phoneNumber(pNumber);
	}

	@Given("User has clicked on Contniue button;")
	public void user_has_clicked_on_contniue_button() {

		addOrder.button();
	}

	// Layouts

	@Given("User has Clicked on Design link")
	public void user_has_clicked_on_design_link() {

		layouts = new Layouts(driver);

		layouts.design();

	}

	@Given("User has Clicked on Layouts link")
	public void user_has_clicked_on_layouts_link() {

		layouts.layouts();
	}

	@Given("User has User has clicked on AddNew button")
	public void user_has_user_has_clicked_on_add_new_button() {

		catalogpage = new CatalogTest(driver);
		catalogpage.addNew();
	}

	@Given("User has Enter Layout Name text box {string};")
	public void user_has_enter_layout_name_text_box(String lName) {

		layouts.layoutName(lName);
	}

	@Given("User has clicked on AddRouter button")
	public void user_has_clicked_on_add_router_button() {

		layouts.addRouter();
	}

	@Given("User has Enter Router text box {string};")
	public void user_has_enter_router_text_box(String rout) {

		layouts.router(rout);
	}

	@Given("User has Selenct Left dropdownList")
	public void user_has_selenct_left_dropdown_list() {

		layouts.leftDrop();
	}

	@Given("User has clicked on Add Model button")
	public void user_has_clicked_on_add_model_button() {

		layouts.addLeft();
	}

	@Given("User has Select Left1 dropdownList")
	public void user_has_select_left1_dropdown_list() {

	}

	@Given("User has Select on Content Top dropdownList")
	public void user_has_select_on_content_top_dropdown_list() {

		layouts.contenttop();
	}

	@Given("User has Select on Column Right dropdownList")
	public void user_has_select_on_column_right_dropdown_list() {

		layouts.columnRigth();
	}

	@Given("User has Select on ContentButton dropdownlist")
	public void user_has_select_on_content_button_dropdownlist() {

		layouts.Contantbutton();
	}

	@Given("User has Clicked on Returns link")
	public void user_has_clicked_on_returns_link() throws InterruptedException {

		addOrder = new AddOrder(driver);

		addOrder.sales();
		Thread.sleep(3000);

		addReturns = new AddReturns(driver);

		addReturns.returns();

		catalogpage = new CatalogTest(driver);
		catalogpage.addNew();

	}

	@Given("User has Enter Order Id text box {string};")
	public void user_has_enter_order_id_text_box(String orderId) {

		addReturns.orderid(orderId);

	}

	@Given("User clciked on DataPicker;")
	public void user_clciked_on_data_picker() throws InterruptedException {

		addReturns.SelectCalader();
	}

	@Given("User has Enter Customer1 text box {string};")
	public void user_has_enter_customer1_text_box(String customer) {
		addOrder = new AddOrder(driver);

		addOrder.customer(customer);
	}

	@Given("User has Enter FirstName1 text box {string};")
	public void user_has_enter_first_name1_text_box(String fName) {

		addOrder.firstName(fName);
	}

	@Given("User has Enter LastName1 text box {string};")
	public void user_has_enter_last_name1_text_box(String lName) {

		addOrder.lastName(lName);
	}

	@Given("User has Enter Email1 text box {string};")
	public void user_has_enter_email1_text_box(String Email) {

		addOrder.email(Email);
	}

	@Given("User has Enter Telephonenumber text box {string};")
	public void user_has_enter_telephonenumber_text_box(String phone) {

		addOrder.phoneNumber(phone);
	}

	@Given("User has Enter Product text box {string};")
	public void user_has_enter_product_text_box(String product1) {

		addReturns.Product(product1);

	}

	@Given("User has Enter Model {string};")
	public void user_has_enter_model(String model1) {

		addReturns.Model(model1);
	}

	@Given("User has Enter Quantity {string};")
	public void user_has_enter_quantity(String Quantity) {

		addReturns.quntity(Quantity);
	}

	@Given("User has Enter Comment {string};")
	public void user_has_enter_comment(String comment) {

		addReturns.Comment(comment);

	}

	@Given("User has Select Return Action dropdown")
	public void user_has_select_return_action_dropdown() {

		addReturns.action();
	}

	@Given("User has Select Return Status dropdown")
	public void user_has_select_return_status_dropdown() {

		addReturns.Status();

	}

	// Add Customer field

	@Given("User has clicked on Customer link")
	public void user_has_clicked_on_customer_link() throws InterruptedException {

		customerfields = new CustomerFields(driver);

		customerfields.CustomerData();

		Thread.sleep(3000);
	}

	@Given("User has clicked on CustomerField link")
	public void user_has_clicked_on_customer_field_link() {

		customerfields.CustomerFieldDetails();
	}

	@Given("User has clicked on addbutton")
	public void user_has_clicked_on_addbutton() {

		catalogpage = new CatalogTest(driver);
		catalogpage.addNew();
	}

	@Given("User has Customer field Name text box {string};")
	public void user_has_customer_field_name_text_box(String fieldName) {

		customerfields.Customerfieldname(fieldName);
	}

	@Given("User has Select Location dropdown list")
	public void user_has_select_location_dropdown_list() {

		customerfields.Location1();
	}

	@Given("User has Select Type dropdown list")
	public void user_has_select_type_dropdown_list() {

		customerfields.Radio1();
	}

	@Given("User has clicked on Customer Group Radio button")
	public void user_has_clicked_on_customer_group_radio_button() {

		customerfields.CustomerGrop();
	}

	@Given("User has clicked on Requried Radio button")
	public void user_has_clicked_on_requried_radio_button() {

		customerfields.Required();
	}

	@Given("User has Enter text in to sort Order text box {string};")
	public void user_has_enter_text_in_to_sort_order_text_box(String sort1) {

		customerfields.Sort(sort1);
	}

	@Given("User has clicked on save1 button")
	public void user_has_clicked_on_save1_button() {
		customerfields.save();
		
	
	}

}