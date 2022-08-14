package com.qa.pages;

import com.qa.utils.TestUtils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class SplitwiseLoginPage extends BasePage {
    TestUtils utils = new TestUtils();

    @AndroidFindBy(id = "com.Splitwise.SplitwiseMobile:id/loginButton")
    private MobileElement firstloginBtn;

    @AndroidFindBy (id = "com.Splitwise.SplitwiseMobile:id/emailInputField")
    @iOSXCUITFindBy (id = "test-Username")
    private MobileElement usernameTxtFld;

    @AndroidFindBy (id = "com.Splitwise.SplitwiseMobile:id/passwordInputField")
    @iOSXCUITFindBy (id = "test-Password")
    private MobileElement passwordTxtFld;

    @AndroidFindBy (id = "com.Splitwise.SplitwiseMobile:id/loginButton")
    @iOSXCUITFindBy (id = "test-LOGIN")
    private MobileElement loginBtn;

    @AndroidFindBy (xpath = "//XCUIElementTypeOther[@name=\"test-Error message\"]/child::XCUIElementTypeStaticText")
    private MobileElement forgetPwdLnk;

    @AndroidFindBy (xpath = "//android.view.ViewGroup[@content-desc=\"test-Error message\"]/android.widget.TextView")
    @iOSXCUITFindBy (xpath = "//XCUIElementTypeOther[@name=\"test-Error message\"]/child::XCUIElementTypeStaticText")
    private MobileElement errTxt;

    public SplitwiseLoginPage() {
    }

    public SplitwiseLoginPage enterUserName(String username) throws InterruptedException {
        clear(usernameTxtFld);
        sendKeys(usernameTxtFld, username, "login with " + username);
        return this;
    }

    public SplitwiseLoginPage enterPassword(String password) {
        clear(passwordTxtFld);
        sendKeys(passwordTxtFld, password, "password is " + password);
        return this;
    }

    public SplitwiseLoginPage pressFirstLoginBtn() {
        click(firstloginBtn, "press first login button");
        return this;
    }

    public SplitwiseSwipePage pressLoginBtn() {
        click(loginBtn, "press login button");
        return new SplitwiseSwipePage();
    }

    public SplitwiseSwipePage login(String username, String password) throws InterruptedException {
        enterUserName(username);
        enterPassword(password);
        return pressLoginBtn();
    }

    public String getErrTxt() {
        String err = getText(errTxt, "error text is - ");
        return err;
    }

}
