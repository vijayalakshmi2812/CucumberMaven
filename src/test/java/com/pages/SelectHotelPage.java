package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.LibGlobal;

public class SelectHotelPage extends LibGlobal {
	public SelectHotelPage() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="radiobutton_0")
	private WebElement btnRadio;
	
	@FindBy(id="continue")
	private WebElement btnContinue;

	public WebElement getBtnRadio() {
		return btnRadio;
	}

	public WebElement getBtnContinue() {
		return btnContinue;
	}

}


