#Automation Freshers Exit Test Assignment



###package description
AppDriver - To Use Set and Get function



BaseFile


Imports-
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
---------------------------------------



PageObject - POM1 , POM2 , POM3



Resources - Log4j2.xml



-------------------------------------



Feature - Features File



StepDefination - StepDefination File




###Test.java File Description



**BaseTest** - the main class - shows the initialization of the App and @after @before METHOD AND SUITE with Swipe down/Scroll Function with Closing App method



**POM1 ** - include test - the class which Perform simple Click function



**POM2** - includes test - the class to Check the Visibility of the button and verify it



**POM5** - includes test -to check the Display test of Show_title and Show_custom button




###Reports and Screenshot
Extent reports gets generated after the run under .\Reports\ExtentReports.html



Screenshots get placed under .\FailedScreenshots\ folder with test name