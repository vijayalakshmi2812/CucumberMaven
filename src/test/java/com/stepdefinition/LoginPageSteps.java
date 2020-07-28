package com.stepdefinition;

import com.base.LibGlobal;
import com.manager.PageObjectManager;
import com.pages.BookHotelPage;
import com.pages.LoginPage;
import com.pages.SearchHotelPage;
import com.pages.SelectHotelPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginPageSteps extends LibGlobal{
	PageObjectManager manager;
	LoginPage loginpage;
	SearchHotelPage searchhotelpage;
	SelectHotelPage selecthotelpage;
	BookHotelPage bookhotelpage;
	@Given("User is on login page")
	public void user_is_on_login_page() {
		//getDriverCloud(); 
		getDriver();
		  loadUrl("http://adactinhotelapp.com/");
	    	}

	@When("User enters {string},{string}")
	public void user_enters(String uname, String pass) {
	   manager=new PageObjectManager();
	   loginpage=manager.getLoginpage();
	   type(loginpage.getTxtUsername(),uname);
		type(loginpage.getTxtPassword(),pass);
	 	}

	@When("User should click login button")
	public void user_should_click_login_button() {
	    btnClick(loginpage.getBtnLogin());
	}

	@When("I select {string},{string},{string},{string},{string},{string}")
	public void i_select(String loc, String hotel, String roomtype, String noofroom, String adult, String child) throws InterruptedException {
		searchhotelpage=manager.getSearchhotelpage();
		selectByText(searchhotelpage.getLocation(),loc);
		selectByText(searchhotelpage.getHotel(),hotel);
		selectByText(searchhotelpage.getRoomType(),roomtype);
		selectByText(searchhotelpage.getNoOfRoom(),noofroom);
		selectByText(searchhotelpage.getAdults(),adult);
		selectByText(searchhotelpage.getChildren(),child);
		}

	@When("I should click search button")
	public void i_should_click_search_button() {
	   btnClick(searchhotelpage.getBtnSearch());
	}

	@When("I select radio button")
	public void i_select_radio_button() {
		selecthotelpage=manager.getSelecthotelpage();
		btnClick(selecthotelpage.getBtnRadio());
	}

	@When("I should click continue button")
	public void i_should_click_continue_button() {
	   btnClick(selecthotelpage.getBtnContinue());
	}

	@When("I enters {string},{string},{string},{string}")
	public void i_enters(String fname, String lname, String addrs, String cardno) {
		bookhotelpage=manager.getBookhotelpage();
		type(bookhotelpage.getTxtFirstName(),fname);
		type(bookhotelpage.getTxtLastName(),lname);
		type(bookhotelpage.getTxtAddress(),addrs);
		type(bookhotelpage.getTxtCardNo(),cardno);
	}


	@When("I select {string},{string},{string},{string}")
	public void i_select(String cardtype, String expmnth, String expyr, String cvv) throws InterruptedException {
	    selectByText(bookhotelpage.getCardType(),cardtype);
	    selectByText(bookhotelpage.getExpMonth(),expmnth);
	    selectByText(bookhotelpage.getExpyear(),expyr);
	    type(bookhotelpage.getTxtCvv(),cvv);
	}

	@When("I should click book now button")
	public void i_should_click_book_now_button() {
	    btnClick(bookhotelpage.getBtnbooknow());
	}

	@Then("I should verify the message")
	public void i_should_verify_the_message() {
		Assert.assertTrue("Verify url", driver.getCurrentUrl().contains("adactinhotelapp"));
		//quit();
	}}

