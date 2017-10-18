package com.zerozero.autoTestCase;

import com.alibaba.fastjson.JSONObject;
import com.zerozero.common.Locators;
import com.zerozero.common.MyUtils;
import com.zerozero.pages.HomePage;
import com.zerozero.pages.PreviewPage;
import macaca.client.MacacaClient;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


//import static org.hamcrest.Matchers.containsString;

/**
 * Created by libingxin on 9/12/16.
 */
public class TestTakePhotoVideoPage {
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
    public void testTakePicture() throws Exception{
        System.out.println("TestCase: Take one Picture.");
        try {
            HomePage.letUsHover(driver);
            PreviewPage.takePhoto(driver);
            PreviewPage.cancelPreview(driver);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

        System.out.println("==========================");
    }

    @Test
    public void testTake100Pictures() throws Exception{
        System.out.println("TestCase: Take 100 Pictures.");
        try {
            HomePage.letUsHover(driver);
//            Integer n = 10;
            for (int i=0; i< Locators.takePicTimes; i++) {
                PreviewPage.takePhoto(driver);
            }
//            driver.sleep(6*60000);
            PreviewPage.cancelPreview(driver);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

        System.out.println("==========================");
    }

    @Test
    // new UI demo

    public void newUIDemo() throws Exception{
        System.out.println("TestCase: Take newUI Pictures.");
        try {
            driver
                    .elementByName(Locators.flyScene_name)
                    .click()
                    .elementByName(Locators.getStarted_name)
                    .click()
                    .elementByName(Locators.go_name)
                    .click();
//                    .elementByName(Locators.connectWiFi_name)
//                    .click()
//                    .sleep(5000)
//                    .elementByName(Locators.WiFi_name)
//                    .click()
//                    .elementByName(Locators.backHoverApp_name)
//                    .click()

            if (MyUtils.isElementExist(driver, Locators.skipUpgrade_name)) {
                driver
                        .elementByName(Locators.skipUpgrade_name)
                        .click()
                        .sleep(2000);
            }

            if (MyUtils.isElementExist(driver, Locators.closeWarning_name)) {
                driver
                        .elementByName(Locators.closeWarning_name)
                        .click()
                        .sleep(2000);
            }

            driver
                    .elementByName(Locators.switchToPhoto_name)
                    .click()
                    .sleep(5000);

            for (int i=0; i< Locators.takePicTimes; i++) {
                  PreviewPage.newTakePhoto(driver);
            }
            driver
                    .elementByXPath(Locators.end_xpath)
                    .click()
                    .sleep(10000);

//            if (MyUtils.isElementExistXPath(driver, Locators.title_xpath)){
//                String countStr         =       "40//40";
//                String sessionTitle     =       driver.elementByXPath(Locators.title_xpath).text();
//                System.out.println("The count is :" + sessionTitle);
//                assertTrue("Incorrect photo numbers", sessionTitle.equals(countStr));
//
//            }
//            else {
//                System.out.println("Can not find the title element ?");
//            }

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

        System.out.println("==========================");
    }

    @Test
    public void testTakeVideo() throws Exception{
        System.out.println("TestCase: Take video for one minute.");
        try {
            HomePage.letUsHover(driver);
            PreviewPage.changeToVideoMode(driver);
            PreviewPage.takeVideo(driver);
            driver.sleep(Locators.takeVideoLength);
            PreviewPage.stopVideo(driver);
            PreviewPage.changeToPhotoMode(driver);
            PreviewPage.cancelPreview(driver);
        } catch (Exception e) {
        // TODO: handle exception
        e.printStackTrace();
        }
        System.out.println("==========================");
    }

    @Test
    public void testTake1TenMinsVideo() throws Exception{
        System.out.println("TestCase: Take one video for ten minutes.");
        try {
            HomePage.letUsHover(driver);
            PreviewPage.changeToVideoMode(driver);
            PreviewPage.takeVideo(driver);
            driver.sleep(10*Locators.takeVideoLength);
            PreviewPage.stopVideo(driver);
            PreviewPage.changeToPhotoMode(driver);
            PreviewPage.cancelPreview(driver);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        System.out.println("==========================");
    }

    @Test
    public void testTake10OneMinVideos() throws Exception{
        System.out.println("TestCase: Take 10 videos for one minute.");
        try {
            HomePage.letUsHover(driver);
            PreviewPage.changeToVideoMode(driver);
            for (int i=0; i< 10; i++) {
                PreviewPage.takeVideo(driver);
                driver.sleep(Locators.takeVideoLength);
                PreviewPage.stopVideo(driver);
            }
            PreviewPage.changeToPhotoMode(driver);
            PreviewPage.cancelPreview(driver);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

        System.out.println("==========================");
    }


    @After
    public void tearDown() throws Exception {
        driver.quit();
    }
}
