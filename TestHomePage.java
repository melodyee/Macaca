package com.zerozero.autoTestCase;

import com.alibaba.fastjson.JSONObject;
import macaca.client.MacacaClient;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

//import static org.hamcrest.Matchers.containsString;

/**
 * Created by libingxin on 9/12/16.
 */
public class TestHomePage {
    MacacaClient driver = new MacacaClient();

    @Before
    public void setUp() throws Exception {
        String platform = "ios";
//        Logger logger = Logger.getLogger(getClass());
        JSONObject porps = new JSONObject();
        porps.put("platformName", platform);
        porps.put("autoAcceptAlerts", true);
        porps.put("reuse", 1);
//      Simulator Settings
//      porps.put("deviceName", "iPhone 6s");
//      porps.put("app","/Users/libingxin/Research/Appium/Hover.app");
//      porps.put("app","/Users/libingxin/Work/HoverCamera/ipa/1.0.8_PP/Hover.app");
        porps.put("bundleId", "ai.think.ios.Hover");
        porps.put("version", "9.3.5");
        porps.put("udid", "072b828fa043bedc3882b1b059d4e64cd672c0b5");

//        iPhone7 Settings
//        porps.put("version", "10.1.1");
//        porps.put("udid", "a57a04fa98d1ab1b877989fdbbf28cb587a2de98");
//      iPhone 6s Plus Settings
//      porps.put("version", "10.1.1");
//      porps.put("udid", "0e270414b17c0a5b77e75aac65b959c7cd093a8a");
//      porps.put("bundleId", "cn.ZeroZeroRobotics.HoverCamera");

        JSONObject desiredCapabilities = new JSONObject();
        desiredCapabilities.put("desiredCapabilities",porps);
        driver.initDriver(desiredCapabilities);
        driver.sleep(20000);
    }

//    @Test
//    public void testHomePage() throws Exception {
//        driver.saveScreenshot("/Users/libingxin/Downloads/homepageUpdateNotify.jpg");
//        driver.sleep(2000);
//        String str = driver.source();
//        System.out.println("==========================");
//        System.out.println(str);
//    }
//
//    @Test
//    public void testHomePageInstagram() throws Exception {
//        driver
//                .elementByName("n3_icon_home_instagram")
//                .click();
//        driver.saveScreenshot("/User/libingxin/Downloads/Instagram.jpg");
//        driver
//                .elementByName("Home")
//                .click();
//        driver.sleep(2000);
//        System.out.println("==========================");
//    }
//
//    @Test
//    public void testHomePageUpdateNot() throws Exception {
//        driver
//                .elementByName("Not now")
//                .click();
//        driver.saveScreenshot("/User/libingxin/Downloads/homepage.jpg");
//        driver.sleep(2000);
//        System.out.println("==========================");
//    }

    //    n3_icon_home_settings
    @Test
    public void testHomePageTutorial() throws Exception {
        driver
                .elementByName("n3_icon_home_tutorial")
                .click();
        JSONObject windowSize = driver.getWindowSize();
        System.out.println(windowSize);

        String enjoyBtn_name = "n3 bg tutorial slide 06";
        int x = windowSize.getInteger("width");
        int y = 1/2*windowSize.getInteger("height");
        int endX = 1/7*windowSize.getInteger("width");
        int endY = 1/2*windowSize.getInteger("height");
        int duration = 500;
        driver
                .swipe(x, y, endX, endY, duration)
                .swipe(x, y, endX, endY, duration)
                .swipe(x, y, endX, endY, duration)
                .swipe(x, y, endX, endY, duration)
                .elementByName(enjoyBtn_name)
                .click();
        driver.sleep(2000);
        System.out.println("==========================");
    }

//    public String skipTuturialCN  = "n3 btn tutorial skip cn";
//    public String skipTuturial    = "n3 btn tutorial skip";
//    @Test
//    public void testHomePageTutorialSkip() throws Exception {
//        driver
//                .elementByName("n3_icon_home_tutorial")
//                .click()
//                .elementByName(skipTuturialCN)
//                .click();
//        driver.sleep(2000);
//        System.out.println("==========================");
//    }


    @After
    public void tearDown() throws Exception {
        driver.quit();
    }
}
