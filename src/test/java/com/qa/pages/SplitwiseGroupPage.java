package com.qa.pages;

import com.qa.utils.TestUtils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SplitwiseGroupPage extends BasePage {
    TestUtils utils = new TestUtils();

    @AndroidFindBy(id = "com.Splitwise.SplitwiseMobile:id/groups")
    private MobileElement groupTab;

    @AndroidFindBy(id = "com.Splitwise.SplitwiseMobile:id/fab")
    private MobileElement addExpensesBtn;





    public SplitwiseGroupPage() {

    }


    public SplitwiseGroupPage selectTheGroup(String groupName) throws Exception {
       MobileElement element =  andScrollToElementUsingUiScrollable("textContains", groupName);
       click(element);
       return this;
    }

    public SplitwiseAddExpensesPage tapAddExpensesButton() throws Exception {
        click(addExpensesBtn);
        return new SplitwiseAddExpensesPage();
    }





}
