package com.git;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GithubAutomation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get(CommonConstant.WEBSITE_ADDRESS);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(1000);
		driver.findElement(By.xpath(CommonConstant.SINGIN_BUTTON_PATH)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(CommonConstant.EMAIL_PATH)).sendKeys(CommonConstant.EMAIL_ADDRESS);
		driver.findElement(By.xpath(CommonConstant.PASSWORD_PATH)).sendKeys(CommonConstant.PASSWORD_ADDRESS);
		driver.findElement(By.xpath(CommonConstant.SINGIN_PATH)).click();
		driver.getCurrentUrl();
		Thread.sleep(3000);
		driver.findElement(By.xpath(CommonConstant.NEW_BTN_PATH)).click();
		driver.findElement(By.xpath(CommonConstant.REP_NAME_PATH)).sendKeys(CommonConstant.REP_NAME);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(CommonConstant.SCROLL_WINDOW_DOWN_SIZE, "");
		Thread.sleep(3000);
		driver.findElement(By.xpath(CommonConstant.CREAT_PATH)).click();
	}
}
