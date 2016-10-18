import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;


import java.net.URL;

import helloworld.com.helloworld.R;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

/**
 * Created by mukesh on 10/14/2016.
 */

public class test {
    AndroidDriver driver;

    @Before
    public void testCaseSetup() throws Exception {
        //service.start();
        //reader.readFile();
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android device");
        cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "4000");
        cap.setCapability(MobileCapabilityType.APP_PACKAGE, "helloworld.com.helloworld");
        cap.setCapability(MobileCapabilityType.APP_ACTIVITY, ".MainActivity");
        cap.setCapability(MobileCapabilityType.APP, "C://Users//mukesh//AndroidStudioProjects//Helloworld//app//build//outputs//apk//app-debug.apk");
        driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723//wd/hub"), cap);

    }

    @Test
    public void testcase1() throws Exception {
        Thread.sleep(15000);
        driver.findElementById("editText").sendKeys("Mukesh");
        Thread.sleep(5000);
        driver.findElementById("btnnext").click();
        Thread.sleep(5000);
        System.out.println(driver.findElementById("textview1").getText());


    }

    @After
    public void testCaseTearDown() {
        //driver.quit();
    }


}
