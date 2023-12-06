package com.git;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GitLogin{
	public  String gitLoginPage() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.get(CommonConstant.WEBSITE_ADDRESS);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(1000);
		driver.findElement(By.xpath(CommonConstant.SINGIN_BUTTON_PATH)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(CommonConstant.EMAIL_PATH)).sendKeys(CommonConstant.EMAIL_ADDRESS);
		driver.findElement(By.xpath(CommonConstant.PASSWORD_PATH)).sendKeys(CommonConstant.PASSWORD_ADDRESS);
		driver.findElement(By.xpath(CommonConstant.SINGIN_PATH)).click();
		String dashboardURL=driver.getCurrentUrl();
		String 	UserName = "karishmakhan12";
		String profileUrl = dashboardURL+UserName;
		System.out.println(profileUrl);
		driver.get(profileUrl);
		System.out.println(driver.getCurrentUrl());
		WebElement element = driver.findElement(By.xpath(CommonConstant.NAME));
		String nameOnProfile = element.getText();
		System.out.println(nameOnProfile);
		return nameOnProfile;

	}
}

