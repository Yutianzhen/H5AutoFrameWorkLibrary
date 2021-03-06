package page.pc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import basicTool.WaitTool;

public class FunctionDetailPage extends AbstractPCPage {

    @FindBy(css = "#news-catetory")
    private WebElement functionDetailListField;

    public FunctionDetailPage(WebDriver driver) {
        super(driver);
        WaitTool.waitFor(driver, WaitTool.DEFAULT_WAIT_4_ELEMENT, functionDetailListField);
    }

}
