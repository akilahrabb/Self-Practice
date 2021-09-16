package com.RTSLabs.pages;

import com.RTSLabs.utilities.WebDriverFactory;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage (){
        PageFactory.initElements(WebDriverFactory.getDriver("chrome"), this);
    }
}
