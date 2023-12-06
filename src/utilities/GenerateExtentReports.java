package utilities;

import java.sql.Date;
import java.text.SimpleDateFormat;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class GenerateExtentReports  implements ITestListener{
	static ExtentTest test; //what details should be populated in the report 
	static ExtentReports extent;  // specify the location of the reports 
	static  ExtentSparkReporter sparkReporter;

	String repName;
	public void onStart(ITestContext testContext) {
		String timeSTamp = new SimpleDateFormat("yyy.MM.dd.HH.mm.ss").format(new Date(0)); // date stamp
		repName = "Test-Report-"+ timeSTamp + ".html";
		sparkReporter = new  ExtentSparkReporter(".\\reports\\"+repName); //specify the location of the report
		sparkReporter.config().setDocumentTitle("GitHbAutomationProject"); // Title of the report
		sparkReporter.config().setReportName("Git Automation"); // name of the report 
		sparkReporter.config().setTheme(Theme.DARK);

		extent = new ExtentReports();
		extent.attachReporter(sparkReporter);
		extent.setSystemInfo("Application", "Git Automation");
		extent.setSystemInfo("Operating System", System.getProperty("os.name"));
		extent.setSystemInfo("User NAme", System.getProperty("user.name"));
		extent.setSystemInfo("Environment", "QA");
		extent.setSystemInfo("User", "Kari");

	}
	public void onTestSuccess(ITestResult result) {
		test=extent.createTest(result.getName());
		test.assignCategory(result.getMethod().getGroups());
		test.createNode(result.getName());
		test.log(Status.PASS, "Test Passed");

	}
	public void onTestFailure(ITestResult result) {
		test=extent.createTest(result.getName());
		test.assignCategory(result.getMethod().getGroups());
		test.createNode(result.getName());
		test.log(Status.FAIL, "Test Failed");
		test.log(Status.FAIL, result.getThrowable().getMessage());

	}
	public void onTestSkipped(ITestResult result) {
		test=extent.createTest(result.getName());
		test.assignCategory(result.getMethod().getGroups());
		test.createNode(result.getName());
		test.log(Status.SKIP, "Test Skipped");
		test.log(Status.SKIP, result.getThrowable().getMessage());

	}
	public void onFinish(ITestContext testContext) {
		extent.flush();

	}

}