package com.zerozero.common;

import com.alibaba.fastjson.JSONObject;
import macaca.client.MacacaClient;

/**
 * Created by libingxin on 9/12/16.
 */
public class MyUtils {
    //    String version    = "9.3.5";
//    private static  String version    = "10.2.1";
//    private static  String udid       = "072b828fa043bedc3882b1b059d4e64cd672c0b5";
    //  iPhone 6s Plus
     private static String version    = "10.1.1";
     private static String udid       = "0e270414b17c0a5b77e75aac65b959c7cd093a8a";
    //  iPhone SE
    //    String version = "10.0.1";
    //    String udid    = "0619b0fd54e9f65144e7623180d701b035daf5d8";
    //  iPhone 7
//    private static String version   = "10.1.1";
//    private static String udid      = "a57a04fa98d1ab1b877989fdbbf28cb587a2de98";
    //  iPhone 7 Plus
//    private static String version   = "10.2.1";
//    private static String udid      = "9f689390f60defba8d7b94dd0ae32fd4cdaeeb17";

    public MyUtils() {
        //
    }

    public static void setCapabilityForNonFirstInstall(JSONObject desiredCapabilities) {
        String platform = "ios";
        String bundleId = "ai.think.ios.Hover.release";
//        String bundleId = "ai.think.ios.Hover.Demo.CES";
//        Logger logger = Logger.getLogger(getClass());
//        desiredCapabilities = new JSONObject();
        desiredCapabilities.put("bundleId", bundleId);
        desiredCapabilities.put("version", version);
        desiredCapabilities.put("udid", udid);
        desiredCapabilities.put("platformName", platform);
        desiredCapabilities.put("autoAcceptAlerts", true);
        desiredCapabilities.put("reuse", 1);
    }

    public static boolean isElementExist(MacacaClient driver, String name) {
        try {
            driver.elementByName(name);
            return true;

        } catch (Exception e) {
            // TODO: handle exception
            return false;
        }
    }

    public static boolean isElementExistXPath(MacacaClient driver, String xpath) {
        try {
            driver.elementByXPath(xpath);
            return true;

        } catch (Exception e) {
            // TODO: handle exception
            return false;
        }
    }

    public static boolean isWiFiExist(MacacaClient driver, String name) {
        try {
            driver.elementByName(name);
            return true;
        } catch (Exception e) {
            // TODO: handle exception
            return false;
        }
    }

}
