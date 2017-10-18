package com.zerozero.autoTestCase;

import com.alibaba.fastjson.JSONObject;
import com.zerozero.common.Locators;
import com.zerozero.common.MyUtils;
import com.zerozero.pages.AlbumPage;
import com.zerozero.pages.HomePage;
import macaca.client.MacacaClient;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

//import static org.hamcrest.Matchers.containsString;

/**
 * Created by libingxin on 9/12/16.
 */
public class TestHomePage {
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
    public void testHomePageTakeScreen() throws Exception {
        driver.saveScreenshot("/Users/libingxin/Downloads/Hompage.jpg");
        driver.sleep(2000);
//        String str = driver.source();
//        System.out.println(str);
        System.out.println("==========================");
    }

    @Test
    public void testAlbumAndBack() {
        System.out.println("Test Case: Test Album - Open Album Page and Back.");
        try{
            HomePage.openAlbum(driver);
            boolean isAlbumPage = MyUtils.isElementExist(driver, Locators.albumTitle_name);
            System.out.println(isAlbumPage);
            assertTrue("Not Album page",isAlbumPage);
            driver.sleep(2000);
            AlbumPage.quitAlbum(driver);
        } catch (Exception e) {
        // TODO: handle exception
        e.printStackTrace();
        }

    }

    @Test
    public void testSetWiFi() {
        System.out.println("Testcase: Set Hover Wi-Fi.");
        try {
            HomePage.setHoverWiFi(driver);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }

    @Test
    public void testOpenSettings(){
        System.out.println("Testcase: Open Settings page and Back.");
        try{
            driver
                    .elementByName(Locators.homepageSettings_name)
                    .click()
                    .sleep(2000)
                    .elementByName(Locators.backToHome_name)
                    .click();
        }catch (Exception e){
            // TODO: handle exception
            e.printStackTrace();
        }
    }
    @Test
    public void testHomePageInstagram() throws Exception {
        System.out.println("Testcase: Open Instagram page.");

        try {
            HomePage.openWiFi(driver);

            if (MyUtils.isWiFiExist(driver, Locators.zerozeroWiFi_name)) {
                driver
                        .elementByName(Locators.zerozeroWiFi_name)
                        .click()
                        .elementByName(Locators.backToHC_name)
                        .click()
                        .elementByName(Locators.homepageIns_name)
                        .click();
                driver.saveScreenshot("/Users/libingxin/Downloads/Instagram.jpg");
                driver
                        .elementByName(Locators.insBackHome_name)
                        .click();
                driver.sleep(2000);
            } else {
                System.out.println("Please connect to Zerozero WiFi !!!!!!!!!!!!!!!!");
            }
        }catch (Exception e){
            // TODO: handle exception
            e.printStackTrace();
        }
    }

//    @Test
//    public void testHomePageUpdateNot() throws Exception {
//        driver
//                .elementByName("Not now")
//                .click();
//        driver.saveScreenshot("/User/libingxin/Downloads/homepage.jpg");
//        driver.sleep(2000);
//        System.out.println("==========================");
//    }
//
//
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
