package com.zerozero.pages;

import com.zerozero.common.Locators;
import macaca.client.MacacaClient;

/**
 * Created by libingxin on 27/12/16.
 */
public class HomePage {
    public static void letUsHover(MacacaClient driver) throws Exception{
        driver
                .elementByName(Locators.letUsHover_name)
                .click()
                .sleep(2000);
        System.out.println("Let's Hover ~~~~~");
    }

    public static void openAlbum(MacacaClient driver) throws Exception {
        driver
                .elementByName(Locators.album_name)
                .click();
    }
    public static void openWiFi(MacacaClient driver) throws Exception{
        driver
                .elementByName(Locators.homepageWiFi_name)
                .click()
                .sleep(20000);
    }

    public static void quitWiFi(MacacaClient driver) throws Exception{
        driver
                .elementByName(Locators.backToHC_name)
                .click();
    }

    public static void setZerozeroWiFi(MacacaClient driver) throws Exception{
        driver
                .elementByName(Locators.homepageWiFi_name)
                .click()
                .sleep(20000)
                .elementByName(Locators.zerozeroWiFi_name)
                .click()
                .sleep(2000)
                .elementByName(Locators.backToHC_name)
                .click();
    }
    public static void setHoverWiFi(MacacaClient driver) throws Exception{
        driver
                .elementByName(Locators.homepageWiFi_name)
                .click()
                .sleep(20000)
                .elementByName(Locators.hoverWiFi_name)
                .click()
                .sleep(2000)
                .elementByName(Locators.backToHC_name)
                .click()
                .sleep(2000);
    }



}
