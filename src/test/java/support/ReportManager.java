package support;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import java.io.IOException;

public class ReportManager {

    private static ExtentReports extent;
    private static ExtentSparkReporter spark;

    public static ExtentReports getInstance() {
        if (extent == null) {
            extent = new ExtentReports();
            spark = new ExtentSparkReporter("target/Spark.html");
            extent.attachReporter(spark);
        }
        return extent;
    }

    public static void logScreenshot(String description, String base64Screenshot) throws IOException {
        extent.createTest(description).fail("Teste falhou", MediaEntityBuilder.createScreenCaptureFromBase64String(base64Screenshot).build());
    }


}
