package com.git;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class GithubAutomation {
	
	@Test(priority=1)

	public void Login() throws InterruptedException {
		GitLogin gl = new GitLogin(); 
	String s = gl.gitLoginPage();
	Assert.assertEquals(CommonConstant.ACTUAL_NAME,s );

	}

	@Test (priority=2)
	public void CreatingNewRepo() throws InterruptedException {
		CreateRep cr = new CreateRep();
		cr.createRepro();
		Reporter.log("Success");
	}


	@Test(priority=3)
	public void ReproCounting() throws InterruptedException {
		ReproNameViaList rvl = new ReproNameViaList();
		boolean myRepo =rvl.reproNameViaList();
		Thread.sleep(3000);
		Assert.assertEquals(true,myRepo );

	}
	@Test(priority=4)
	public void DeleteRepoFromList() throws InterruptedException {
		DeleteRepo dr = new DeleteRepo();
		dr.deleteRepo();
	}


}

