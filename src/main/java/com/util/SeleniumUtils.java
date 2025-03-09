package com.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.factory.DriverFactory;

public class SeleniumUtils {

	public static void selectDropDownValue(String locator, String type, String value) {
		
		WebElement ele = DriverFactory.getDriver().findElement(By.xpath(String.format(locator, "Title")));
		//ele.click();
		Select select = new Select(ele);
		switch(type){
		case "index":
			select.selectByIndex(Integer.parseInt(value));
			break;
		case "visibleText":
			select.selectByVisibleText(value);
			break;
		case "selectByValue":
			select.selectByValue(value);
			break;
		default:
			System.out.println("Please enter valid selction criteria");
			break;
		}
			
	}
}
