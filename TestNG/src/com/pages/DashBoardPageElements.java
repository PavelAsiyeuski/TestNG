package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utils.BaseClass;

public class DashBoardPageElements {
@FindBy(id="welcome")
public WebElement welcome;

@FindBy(xpath ="//div[@id='branding']/a[1]/img")
public WebElement logo;

@FindBy(xpath ="//a[@id='menu_pim_viewPimModule']")
public WebElement PIM;

@FindBy(xpath = "//a[@id='menu_pim_addEmployee']")
public WebElement addEmp;

	public DashBoardPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
}
