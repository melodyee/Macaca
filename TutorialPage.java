package com.zerozero.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by libingxin on 19/12/16.
 */
public class TutorialPage {
    public String enjoyBtn_name = "n3 bg tutorial slide 06";
    public String skipBtn_name = "n3 btn tutorial skip"
    public void skipTermsPage( WebElement driver){
        WebElement skipBtn = driver.findElement(By.name(skipBtn_name));
        skipBtn.click();
    }
    
}
