package extentReports;

import java.time.LocalDateTime;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ToLearnExtentReport {
	@Test
	public void createReport() {
		String timestamp=LocalDateTime.now().toString().replace(":", "-");
		
		//Step 1: create an instance of ExtentSparkReporter
		ExtentSparkReporter spark=new ExtentSparkReporter("./HTML_reports/extentReports_"+timestamp+".html");
		
		//Step 2: Create an instance of ExtentReports
		ExtentReports extReport=new ExtentReports();
		
		// step3:attach ExtentSparkReporter to attachReporter
		extReport.attachReporter(spark);
		
		// step 4: create ExtentTest object
		ExtentTest test = extReport.createTest("ToLearnExtentReport");
		
		//step 5:call log() to provide status and message
		test.log(Status.PASS, "Log message added into report");
		
		
		//step6: call flush()
		extReport.flush();
		
	}
}
