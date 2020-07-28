package com.manager;

import com.pages.BookHotelPage;
import com.pages.LoginPage;
import com.pages.RegisterPage;
import com.pages.SearchHotelPage;
import com.pages.SelectHotelPage;

public class PageObjectManager {
	private LoginPage loginpage;
	private RegisterPage registerpage;
	private SearchHotelPage searchhotelpage;
	private SelectHotelPage selecthotelpage;
	private BookHotelPage bookhotelpage;
	public LoginPage getLoginpage() {
		return (loginpage == null) ? loginpage=new LoginPage() : loginpage;
	}
	public RegisterPage getRegisterpage() {
		return (registerpage == null) ? registerpage=new RegisterPage() : registerpage;
	}
	public SearchHotelPage getSearchhotelpage() {
		return (searchhotelpage == null) ? searchhotelpage=new SearchHotelPage() : searchhotelpage;
	}
	public SelectHotelPage getSelecthotelpage() {
		return (selecthotelpage == null) ? selecthotelpage=new SelectHotelPage() : selecthotelpage;
	}
	public BookHotelPage getBookhotelpage() {
		return (bookhotelpage == null)? bookhotelpage=new BookHotelPage():bookhotelpage;
	}
	
}
