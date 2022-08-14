package com.qa.pages;

import com.qa.utils.TestUtils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class SplitwiseSwipePage extends BasePage {
    TestUtils utils = new TestUtils();

    @AndroidFindBy(id = "com.Splitwise.SplitwiseMobile:id/middleText")
    private MobileElement welcomeSliderText;



    public SplitwiseSwipePage() {
    }

    public SplitwiseGroupPage swipeTheWelcomeSlider() throws Exception {
        click(welcomeSliderText);
        tapOnScreen(3);
        return new SplitwiseGroupPage();
    }


}
