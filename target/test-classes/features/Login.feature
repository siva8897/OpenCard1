#Author:lingalasiva.
#Keywords Summary :login testing
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Application login
  
 
  Scenario: Home page defult login
    Given is an landing page
    When Login into application with "demo" and password "demo";
    And clicked on login button
   
  Scenario: Catalalog page MenuBar
    Given is an Catlalog menu
    When Dashboard page menu bar user has clicked on Catalog
    And clicked on Categories Menu button
    And clicked on AddNew button
    And User enter data Catagorie text box "Hp";
    And User enter data Description text area "HP AMDA Radeon";
    And User enter data Mata tag Titel text box "Hp Core i5";
    And User enter data Mata tag Discription "Test data HP Core i5 Test Discription";
    And User enter data Mata tag Mata Tag KeyWords "Hp Core i5 Tag KeyWords";
    And User has clicked on save button
    And verifiy the valition 
    
   Scenario: Product page MenuBar
    Given is an Prodct page menu
    And Dashboard page menu bar user has clicked on Products
   
    
   Scenario: Add New Product Details
    Given User clicked on pules icon
    And User Add data in Producat Name text box "Dell";
    And User Enter data in Producat Discription text box "Dell intel Core i7 Pro"
    And User has clicked on Bold button
    And User enter data Producat Mata tag Titel text box "Dell Core i7";
    And User enter data Product Mata tag Discription "Test data Dell Core i7 Test Discription";
    And User enter data Product Mata tag Mata Tag KeyWords "Dell Core i7 Tag KeyWords";
    And User enter data Producat Tages "Dell Intel"
    And User has clicked Product on save button
    And verifiy the valition in Procuct
    
    Scenario: Product Data Details
    
    Given User has clicked on Data link
    And User has Enter data in Model text box "Dell2024"
    And User has validate Message
    And User has Enter data SKU text box "21";
    And User has Enter data UPC text box "UPC2041";
    And User has Enter data EAN text box "EAN3217";
    And User has Enter data JAN text box "JN7845";
    And User has Enter data ISBN text box "74512";
    And User has Enter data MPN text box "MPN78456";
    And User has Enter data Location text box "Hydarabad";
    And User has select Suplier dropdown value
    And User has Enter data Price text box "85000";
    And User has Enter data PriceInclTex "850";
    And User has select Costing Methos value
    And User has Enter BaseCost text box "4200";
    And User has Enter BaseCost Perseatage text box "24";
    And User has Enter Additonal cost text box "10";
    And User has Enter Quitity text box "12";
    And User has select data taxClass value
    And User has select DataAvaible 
    And User has Enter Length text box "4M";
    And User has Enter Width text box "10";
    And User has Enter Height text box "5.8";
    And User has Enter Weigth text box "63Kg";
    
    Scenario: Add Order Details
    
    Given User has Clicked on Sales link
    And User has Clicked on Order link
    And User has Enter Customer text box "Tom";
    And User has Enter Ic Number text box "IN14485";
    And User has Enter Company Name text box "Radiant";
    And User has Enter Company Id text box "CI7458";
    And User has Enter VAT Number text box "7451";
    And User has Select Customer Grop dropdown list;
    And User has Enter FirstName text box "Rich";
    And User has Enter LastName text box "Pointing";
    And User has Enter EMail text box "RichPointing@gmail.com";
    And User has Enter Phone Number text box "8897451249";
    And User has clicked on Contniue button;
    
    Scenario: Layouts Details
    
    Given User has Clicked on Design link
    And User has Clicked on Layouts link
    And User has User has clicked on AddNew button
    And User has Enter Layout Name text box "Akshaya";
    And User has clicked on AddRouter button
    And User has Enter Router text box "linkedInEthernet";
    And User has Selenct Left dropdownList
    And User has clicked on Add Model button
    And User has Select Left1 dropdownList
    And User has Select on Content Top dropdownList
    And User has Select on Column Right dropdownList
    And User has Select on ContentButton dropdownlist
    
    Scenario: Returns Details;
    
    Given User has Clicked on Returns link
    And User has Enter Order Id text box "4466";
    And User clciked on DataPicker;
    And User has Enter Customer1 text box "Tom";
    And User has Enter FirstName1 text box "Tom";
    And User has Enter LastName1 text box "Latham";
    And User has Enter Email1 text box "Tom@Gmail.com";
    And User has Enter Telephonenumber text box "7844218745";
    And User has Enter Product text box "DELL Desktop";
    And User has Enter Model "2008";
    And User has Enter Quantity "8";
    And User has Enter Comment "Poor Quality Producat";
    And User has Select Return Action dropdown
    And User has Select Return Status dropdown
    
    Scenario: AddCustomer Field Details:
    
    Given User has clicked on Customer link
    And User has clicked on CustomerField link
    And User has clicked on addbutton 
    And User has Customer field Name text box "TomLetham";
    And User has Select Location dropdown list
    And User has Select Type dropdown list
    And User has clicked on Customer Group Radio button
    And User has clicked on Requried Radio button
    And User has Enter text in to sort Order text box "Books";
    And User has clicked on save1 button
    
    
    
    
    
    
    
    
    
    
    
 
    
    
    
    
    
    
    
    
    

    
    
    
    
    
    

  