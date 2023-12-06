package com.git;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteRepo {
	public static WebDriver driver;
	public  static void deleteRepo() throws InterruptedException {
		driver= new ChromeDriver();
		driver.get(CommonConstant.REPRO_URL);
		String 	UserName = "karishmakhan12";
		String parampath = "?tab=repositories";
		String profileUrl = (CommonConstant.DASHBOARD_URL)+UserName +parampath;
		System.out.println(profileUrl);
		driver.get(profileUrl);
		System.out.println(driver.getCurrentUrl());

		WebElement count = driver.findElement(By.xpath(CommonConstant.UI_OF_REPROLIST));
		Thread.sleep(30000);
		String countOfTotalRepo = count.getText();
		System.out.println(countOfTotalRepo);
		int countOfTotalRepo1=Integer.parseInt(countOfTotalRepo); 
		String startingXpath = "//*[@id=\"user-repositories-list\"]/ul/li[";
		String endXpath = "]/div[1]/div[1]/h3/a";
		Thread.sleep(30000);
		for(int i=1;i<=countOfTotalRepo1;i++) {
			String finalXpath = startingXpath +i + endXpath;
			WebElement SingleName = driver.findElement(By.xpath(finalXpath));
			String repositoriesName = (SingleName.getText());
			System.out.println(repositoriesName);
			System.out.println("DELETE BLOG_1");
			CommonConstant cc = new CommonConstant();
			cc.setGitRepoName();
			if(repositoriesName.equalsIgnoreCase(CommonConstant.F_REP_NAME)) {
				System.out.println("DELETE BLOG_2");
				driver.findElement(By.name(repositoriesName)).click();
				driver.findElement(By.xpath(CommonConstant.SETTING_BTN)).click();
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript(CommonConstant.SCROLL_WINDOW_DOWN_SIZE, "");
				Thread.sleep(3000);
				driver.findElement(By.xpath(CommonConstant.DELETE_PATH)).click();
				driver.findElement(By.xpath(CommonConstant.DELETE_REPO_TEXT)).click();
				driver.findElement(By.xpath(CommonConstant.RAED_AGREE_LINK)).click();
				String deleteText = driver.findElement(By.xpath(CommonConstant.DELETE_REPO_NAME)).getText();
				driver.findElement(By.xpath(CommonConstant.DELETE_VERIFICATION_FIELD)).sendKeys(deleteText);
				driver.findElement(By.xpath(CommonConstant.DELETE)).click();

				break;
			}
		}


	}
}