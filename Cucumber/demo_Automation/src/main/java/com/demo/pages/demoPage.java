package com.demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.demo.automation.framework.TestSession;
import com.demo.automation.framework.pagefactory.MobileWebViewPage;
import com.demo.utils.InitData;
import com.demo.utils.PropFileHandler;

public class demoPage extends MobileWebViewPage {

	public static String platformName = InitData.platformName;

	public demoPage(TestSession session) throws Exception {

		super(session, "Applications/demo");

	}

	/**
	 * Verify the Home page is visible
	 * 
	 * @return
	 */
	public boolean isHomePageVisible() {

		WebDriverWait wait = new WebDriverWait(session.driver, 60);
		return wait.until(ExpectedConditions.visibilityOf(element("homePage"))).isDisplayed();

	}

	/**
	 * Verify the Url
	 * 
	 * @return
	 * @throws InterruptedException
	 */
	public boolean isUrlCorrect() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("url****" + session.driver.getCurrentUrl());
		return session.driver.getCurrentUrl().contains(PropFileHandler.readProperty("url"));

	}

	/**
	 * Select any category
	 * 
	 * @throws InterruptedException
	 * 
	 */
	public void selectCategory() throws InterruptedException {
		String x1 = "//*[text()=' ";
		String x2 = PropFileHandler.readProperty("category");
		String x3 = " ']";
		String xpath = x1 + x2 + x3;
		WebElement category = session.driver.findElement(By.xpath(xpath));
		JavascriptExecutor js = (JavascriptExecutor) session.driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: green; border: 2px solid red;');", category);
		Thread.sleep(2000);
		category.click();
	}

	/**
	 * Select brand
	 * @throws InterruptedException 
	 * 
	 */
	public void selectBrand() throws InterruptedException {
		String x1 = "//*[text()='";
		String x2 = PropFileHandler.readProperty("brand");
		String x3 = "']/parent::a/child::div";
		String xpath = x1 + x2 + x3;
		WebElement brand = session.driver.findElement(By.xpath(xpath));
		JavascriptExecutor js = (JavascriptExecutor) session.driver;
		js.executeScript("arguments[0].scrollIntoView();",session.driver.findElement(By.xpath(xpath)));	
		js.executeScript("arguments[0].setAttribute('style', 'background: green; border: 2px solid red;');", brand);
		Thread.sleep(2000);
		brand.click();

	}

	/**
	 * Verify the options displayed according to the brand
	 * 
	 * @return
	 */
	public boolean areOptionsAccordingToFilterSet() {
		boolean status = false;

		for (int i = 0; i <= elements("optionsDisplayed").size() - 1; i++) {

			if (elements("optionsDisplayed").get(i).getText().contains(PropFileHandler.readProperty("brand"))) {
				System.out.println("Option " + i + " is -->" + elements("optionsDisplayed").get(i).getText());
				status = true;
			} else {
				status = false;
			}
		}
		return status;

	}
	
}
