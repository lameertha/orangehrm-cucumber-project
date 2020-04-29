package com.orangehrm.www.pages;

import com.cucumber.listener.Reporter;
import com.orangehrm.www.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/* Created
 * by Lamee*/
public class WelcomeAdminPage extends Utility {

    private static final Logger log = LogManager.getLogger(WelcomeAdminPage.class.getName());



    @FindBy(xpath = "//a[@id='welcome']")
    WebElement _welcomeAdminText;

    public String getWelcomeAdminText() {
        Reporter.addStepLog("Displaying Welcome AdminText :" + _welcomeAdminText.toString());
        log.info("Displaying Welcome AdminText : " + _welcomeAdminText.toString());
        return getTextFromElement(_welcomeAdminText);
    }
}
