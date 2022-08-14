package com.qa.pages;

import com.qa.utils.TestUtils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SplitwiseAddExpensesPage extends BasePage {
    TestUtils utils = new TestUtils();

    @AndroidFindBy(id = "com.Splitwise.SplitwiseMobile:id/personChooser")
    private MobileElement searchTextField;

    @AndroidFindBy (xpath = "//android.widget.ImageButton[@content-desc=\"Navigate up\"]")
    private MobileElement backBtn;

    @AndroidFindBy (id = "com.Splitwise.SplitwiseMobile:id/descriptionView")
    private MobileElement descriptionTextField;
    @AndroidFindBy (id = "com.Splitwise.SplitwiseMobile:id/amountView")
    private MobileElement amountTextField;

    @AndroidFindBy (id = "com.Splitwise.SplitwiseMobile:id/doneAction")
    private MobileElement saveButton;

    @AndroidFindBy (id = "com.Splitwise.SplitwiseMobile:id/payerButton")
    private MobileElement paidByButton;

    @AndroidFindBy (id = "            'com.Splitwise.SplitwiseMobile:id/splitButton';")
    private MobileElement splitButton;

    public SplitwiseAddExpensesPage() {
    }

    public SplitwiseAddExpensesPage enterDescription(String description) {
        clear(descriptionTextField);
        sendKeys(descriptionTextField, description, "descriptionTextField is " + description);
        return this;
    }

    public SplitwiseAddExpensesPage enterAmount(String amount) {
        clear(amountTextField);
        sendKeys(amountTextField, amount, "descriptionTextField is " + amount);
        return this;
    }

    public SplitwiseAddExpensesPage pressSaveBtn() {
        click(saveButton, "press save button");
        return this;
    }

    public SplitwiseAddExpensesPage addExpenses(String description, String amount) {
        enterDescription(description);
        enterAmount(amount);
        return pressSaveBtn();
    }


}
