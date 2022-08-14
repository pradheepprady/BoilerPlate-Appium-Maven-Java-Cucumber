package com.qa.pages;

import com.qa.utils.TestUtils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.junit.Assert;

public class SplitwiseActivityPage extends BasePage {
    TestUtils utils = new TestUtils();

    @AndroidFindBy(id = "com.Splitwise.SplitwiseMobile:id/activity")
    private MobileElement activityTab;
    @AndroidFindBy(id = "com.Splitwise.SplitwiseMobile:id/friends")
    private MobileElement friendsTab;

    @AndroidFindBy(xpath = "(//android.widget.TextView)[1]")
    private MobileElement firstElement;


    public SplitwiseActivityPage() {

    }


    public SplitwiseActivityPage navigateToActivityPage() throws Exception {
        click(friendsTab);
        click(activityTab);
        return this;
    }

    public String textDisplayedInFirstPlace() {
        return getText(firstElement, "text");
    }

}
