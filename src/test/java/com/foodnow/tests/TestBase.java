package com.foodnow.tests;

import com.foodnow.config.ApplicationManager;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class TestBase {

    protected ApplicationManager app = new ApplicationManager(System.getProperty("browser", "chrome"));

    Logger logger = LoggerFactory.getLogger(TestBase.class);
    public WebDriver driver;

    @BeforeMethod
   // @BeforeSuite
    public void init(ITestContext context) {
        driver = app.startTest();
        logger.info("Start test: " + context.getName());
    }

    @AfterMethod()
   // @AfterSuite()
    public void tearDown(ITestResult result) {
        if (result.isSuccess()) {
            logger.info("Test result: PASSED " + result.getMethod().getMethodName());
        } else {
            logger.error("Test result: FAILED " + result.getMethod().getMethodName());
        }
        logger.info("***********************************************");
        app.stopTest();
    }
}
