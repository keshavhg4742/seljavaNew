package selepract;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportEx implements ITestListener {

	public  ExtentReports extentReports;
	public  ExtentSparkReporter sparkReporter;
	public  ExtentTest test;

	@Override
	public void onStart(ITestContext context) {
		extentReports = new ExtentReports();
		sparkReporter = new ExtentSparkReporter("./report/re.html");
		extentReports.attachReporter(sparkReporter);

		sparkReporter.config().setReportName("QA report");
		sparkReporter.config().setTheme(Theme.DARK);

	}

	@Override
	public void onTestFailure(ITestResult result) {
		test = extentReports.createTest(result.getName());
		test.log(Status.FAIL, "test case fail is" + result.getName());
		test.fail(MediaEntityBuilder.createScreenCaptureFromPath("img.png").build());

		// base64
		test.fail(MediaEntityBuilder.createScreenCaptureFromBase64String("base64").build());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test = extentReports.createTest(result.getName());
		test.log(Status.PASS, "test case pass is" + result.getName());

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		test = extentReports.createTest(result.getName());
		test.log(Status.SKIP, "test case skipped is" + result.getName());

	}

	@Override
	public void onFinish(ITestContext context) {
		extentReports.flush();
	}
}
