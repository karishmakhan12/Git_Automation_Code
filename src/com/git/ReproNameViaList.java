package com.git;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReproNameViaList {
	public static WebDriver driver;

	public  static boolean reproNameViaList() {
		driver= new ChromeDriver();
		driver.get(CommonConstant.REPRO_URL);
		String 	UserName = "karishmakhan12";
		String parampath = "?tab=repositories";
		String profileUrl = (CommonConstant.DASHBOARD_URL)+UserName +parampath;
		System.out.println(profileUrl);
		driver.get(profileUrl);
		System.out.println(driver.getCurrentUrl());

		WebElement count = driver.findElement(By.xpath(CommonConstant.UI_OF_REPROLIST));
		String countOfTotalRepo = count.getText();
		System.out.println(countOfTotalRepo);
		int countOfTotalRepo1=Integer.parseInt(countOfTotalRepo); 
		String startingXpath = "//*[@id=\"user-repositories-list\"]/ul/li[";
		String endXpath = "]/div[1]/div[1]/h3/a";
		//String finalXpath = startingXpath + middleXpath(i)+ endXpath;
		boolean myRepo = false;
			
		for(int i=1;i<=countOfTotalRepo1;i++) {
			String finalXpath = startingXpath +i + endXpath;
			WebElement SingleName = driver.findElement(By.xpath(finalXpath));
			String repositoriesName = (SingleName.getText());
			System.out.println(repositoriesName);
			
			if (repositoriesName.equalsIgnoreCase(CommonConstant.F_REP_NAME)) {
				myRepo=true;
				break;
			}

		}
		return myRepo;
	}
}