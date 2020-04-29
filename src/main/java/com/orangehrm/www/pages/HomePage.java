package com.orangehrm.www.pages;

import com.cucumber.listener.Reporter;
import com.orangehrm.www.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/* Created
 * by Lamee*/
public class HomePage extends Utility {

    private static final Logger log  = LogManager.getLogger(HomePage.class.getName());



    @FindBy(xpath ="//div[@id='logInPanelHeading']")
    WebElement _loginPanelText;

    @FindBy(xpath = "//input[@id='txtUsername']")
    WebElement _usernameField;

    @FindBy(xpath = "//input[@id='txtPassword']")
    WebElement _passwordField;

    @FindBy(xpath= "//input[@id='btnLogin']")
    WebElement _loginBtn;

    @FindBy(xpath = "//a[@id='welcome']")
    WebElement _welcomeAdminText;

    @FindBy(xpath = "//span[@id='spanMessage']")
    WebElement _spanMessage;


    public String getLoginPanelText (){
        Reporter.addStepLog("Displaying Login Panel Link : " + _loginPanelText.toString());
        log.info("Displaying Login Panel Link : " + _loginPanelText.toString());
        return getTextFromElement(_loginPanelText);
    }
    public void enterUsernameField (String username){
        Reporter.addStepLog("Entering Username  : " + username +" "+ _usernameField.toString());
        sendTextToElement(_usernameField, username);
        log.info("Entering Username : " + username + " "+_usernameField.toString());
    }

    public void enterPasswordField (String password){
        Reporter.addStepLog("Entering Password  : " + password +" "+ _passwordField.toString());
        sendTextToElement(_passwordField, password);
        log.info("Entering Password : " + password + " "+_passwordField.toString());
    }

    public void clickonLoginBtn(){
        Reporter.addStepLog("Clicking on Login Button  : " + _loginBtn.toString());
        clickOnElement(_loginBtn );
        log.info("Clicking on Login Button : " + _loginBtn.toString());
    }

    public String getWelcomeAdminText() {
        Reporter.addStepLog("Displaying Welcome AdminText :" + _welcomeAdminText.toString());
        log.info("Displaying Welcome AdminText : " + _welcomeAdminText.toString());
        return getTextFromElement(_welcomeAdminText);

    }
    public String getSpanMessage(){
        Reporter.addStepLog("Displaying SpanMessage :" + _spanMessage.toString());
        log.info("Displaying Welcome AdminText : " + _spanMessage.toString());
        return getTextFromElement(_spanMessage);

    }
    public void loginToApplication(String username, String password) {
        enterUsernameField(username);
        enterUsernameField(password);
        clickonLoginBtn();
    }

}
