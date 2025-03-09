package com.pages;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.factory.DriverFactory;
import com.util.SeleniumUtils;

public class LoginPage {


	private By titleDropDown = By.xpath("//select/option[text()='Select an option']");
	private static final String enrollmentFields = "//label[text()='%s']";
	private static final String dropdownElement = "//label[text()='%s']/following-sibling::select ";

	public static String getPageTitle() {
		return DriverFactory.getDriver().getTitle();
	}

	public boolean isDropDownDisplayed() {
		return DriverFactory.getDriver().findElement(titleDropDown).isDisplayed();
	}

	public static boolean checkEnrollmentFields(List<String> fieldLabels) {
		boolean isDisplayed = false;
		for (String fieldLabel : fieldLabels) {
			try {
				WebElement ele = DriverFactory.getDriver().findElement(By.xpath(String.format(enrollmentFields, fieldLabel)));
				isDisplayed = ele.isDisplayed();
			} catch (NoSuchElementException e) {
				e.printStackTrace();
			}
		}
		return isDisplayed;
	}
	
	public static void selectDropDownValue(String drodownValue) {
		SeleniumUtils.selectDropDownValue(dropdownElement, "selectByValue", drodownValue);
	}
}
