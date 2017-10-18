package com.zerozero.autoTestCase;

import com.alibaba.fastjson.JSONObject;
import com.zerozero.common.Locators;
import com.zerozero.common.MyUtils;
import macaca.client.MacacaClient;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

//import static org.hamcrest.Matchers.containsString;

/**
 * Created by libingxin on 9/12/16.
 */
public class TestTutorialPage {
    MacacaClient driver = new MacacaClient();

    @Before
    public void setUp() throws Exception {
        JSONObject porps = new JSONObject();
        MyUtils.setCapabilityForNonFirstInstall(porps);
        JSONObject desiredCapabilities = new JSONObject();
        desiredCapabilities.put("desiredCapabilities",porps);
        driver.initDriver(desiredCapabilities);
        driver.sleep(2000);
    }

    @Test
    public void testHomePageTutorial() throws Exception {
        System.out.println("TestCase: HomePage tutorial scan page by page.");
        driver
                .elementByName(Locators.homeTutorial_name)
                .click();
        JSONObject windowSize = driver.getWindowSize();
        System.out.println(windowSize);
        int x = windowSize.getInteger("width");
        int y = 1/2*windowSize.getInteger("height");
        int endX = 1/7*windowSize.getInteger("width");
        int endY = 1/2*windowSize.getInteger("height");
        int duration = 300;
        driver
                .swipe(x, y, endX, endY, duration)
                .swipe(x, y, endX, endY, duration)
                .swipe(x, y, endX, endY, duration)
                .swipe(x, y, endX, endY, duration)
                .elementByName(Locators.enjoyBtn_name)
                .click();
        driver.sleep(2000);
        System.out.println("==========================");
    }

    @Test
    public void testHomePageTutorialSkip() throws Exception {
        System.out.println("TestCase: HomePage tutorial skipped.");
        driver
                .elementByName(Locators.homeTutorial_name)
                .click()
                .elementByName(Locators.homeTutorialSkip_name)
                .click();
        driver.sleep(2000);
        System.out.println("==========================");

    }


    @After
    public void tearDown() throws Exception {
        driver.quit();
    }
}
