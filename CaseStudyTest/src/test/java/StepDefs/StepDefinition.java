package StepDefs;

import org.openqa.selenium.By;

import Base.TestBaseFinal;
import Pages.MainPage;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends TestBaseFinal{
	
	MainPage mainpage;
	
	@Before
	public void before()
	{
		initialization();
	}
	
	@Given("Login to App")
	public void login_to_app() {
	    // Write code here that turns the phrase above into concrete actions
		
		mainpage = new MainPage();
		mainpage.navigateToLogin();
		
		
	}
	@When("Add an item to cart")
	public void add_an_item_to_cart() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	@Then("Items must be added to cart")
	public void items_must_be_added_to_cart() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}
	
	@When("List of Items should be available in cart")
	public void list_of_items_should_be_available_in_cart() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}
	@Then("Delete an item from Cart")
	public void delete_an_item_from_cart() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}
	
	
	@When("Items should be available in Cart")
	public void items_should_be_available_in_cart() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}
	@When("Place Order")
	public void place_order() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}
	@Then("Purchase Items")
	public void purchase_items() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}










}
