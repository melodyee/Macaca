package com.zerozero.pages;
import com.zerozero.common.Locators;
import com.zerozero.common.MyUtils;
import macaca.client.MacacaClient;

/**
 * Created by libingxin on 9/12/16.
 */
public class PreviewPage {
//    private MacacaClient mc;
//    public PreviewPage(MacacaClient mc) {
//        this.mc = mc;
//    }

    public static void cancelPreview(MacacaClient driver) throws Exception{
        if (!MyUtils.isElementExist(driver, Locators.cancelPreview_name)){
            System.out.println("Cannot find Back button !!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        }
        else {
            driver
                    .elementByName(Locators.cancelPreview_name)
                    .click()
                    .sleep(2000);
            System.out.println("Return to Homepage ~~~~~");
        }
    }
    public static void changeToPhotoMode(MacacaClient driver) throws Exception{
        if (!MyUtils.isElementExist(driver, Locators.changeToPhoto_name)){
            System.out.println("Cannot find changeToPhoto button !!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        }
        else {
            driver
                    .elementByName(Locators.changeToPhoto_name)
                    .click()
                    .sleep(10000);
            System.out.println("############## Changed to Photo successfully ##############");
        }
    }
    public static void changeToVideoMode(MacacaClient driver) throws Exception{
        if (!MyUtils.isElementExist(driver, Locators.changeToVideo_name)){
            System.out.println("Cannot find changeToVideo button !!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        }
        else {
            driver
                    .elementByName(Locators.changeToVideo_name)
                    .click()
                    .sleep(10000);
            System.out.println("############## Changed to Video successfully ##############");
        }
    }

    public static void takePhoto(MacacaClient driver) throws Exception{
        if (!MyUtils.isElementExist(driver, Locators.takePic_name)) {
            System.out.println("Cannot find take Picture button !!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        }
        else{
            driver
                    .elementByName(Locators.takePic_name)
                    .click()
                    .sleep(100);
            System.out.println("############## Take Photo successfully ##############");
        }
    }

    public static void takeVideo(MacacaClient driver) throws Exception{
       if (!MyUtils.isElementExist(driver, Locators.takeVideo_name)){
           System.out.println("Cannot find take Video button !!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
       }
       else {
           driver
                   .elementByName(Locators.takeVideo_name)
                   .click()
                   .sleep(2000);
           System.out.println("############## Start to take Video successfully ##############");
       }

    }

    public static void stopVideo(MacacaClient driver) throws Exception{
        if (!MyUtils.isElementExist(driver, Locators.stopVideo_name)){
            System.out.println("Cannot find stop Video button !!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        }
        else {
            driver
                    .elementByName(Locators.stopVideo_name)
                    .click()
                    .sleep(2000);
            System.out.println("############## STOP to take Video successfully ##############");
        }
    }


    //new UI
    public static void newTakePhoto(MacacaClient driver) throws Exception{
        if (!MyUtils.isElementExist(driver, Locators.newTakePic_name)) {
            System.out.println("Cannot find take Picture button !!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        }
        else{
            driver
                    .elementByName(Locators.newTakePic_name)
                    .click()
                    .sleep(100);
            System.out.println("############## Take Photo successfully ##############");
        }
    }

}
