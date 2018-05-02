package com.cucumber.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.cucumber.pages.MortCalPage;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MortCalStep {
	
	MortCalPage mcp;
	public WebDriver mydobj;
	
	@Given("^Cal web cal application$")
    public void Cal_web_cal_application()throws Throwable{
		
		System.out.println("Driver intiatied here--->>>>>>>>");
		System.setProperty("webdriver.chrome.driver", "D://softwares//chromedriver_win32//chromedriver.exe");
	    mydobj = new org.openqa.selenium.chrome.ChromeDriver();
		//mydobj.navigate().to("http://www.calculator.net/mortgage-calculator.html");
        System.out.println("-------------->>>>> We are in Before method");
		mydobj.get("http://www.calculator.net/");
		System.out.println("!! app Launched *****");
		
    }

    @When("^User Clcks on Mortg Cal link$")
    public void User_Clcks_on_Mortg_Cal_link() throws Throwable {
    	System.out.println("!! Trying to click mortgagecal_link *****");
    	
    	mydobj.findElement(By.xpath(MortCalPage.mortgagecal_link)).click();
    	System.out.println("!! We are in mortgagecal page *****");
    }
    

    @Then("^User clrs the default val in Home price txt fld$")
    public void User_clrs_the_default_val_in_Home_price_txt_fld() throws Throwable{
    	mydobj.findElement(By.xpath(MortCalPage.homePrice)).clear();
    }
    
    @Then("^User entr the val n Home price txt fld$")
    public void User_entr_the_val_n_Home_price_txt_fld() throws Throwable{
    	mydobj.findElement(By.xpath(MortCalPage.homePrice)).sendKeys("8000");
    }
    
    @Then("^User clrs the default val n Dwnpymnt txt fld$")
    public void User_clrs_the_default_val_n_Dwnpymnt_txt_fld() throws Throwable{
    	
    	mydobj.findElement(By.xpath(MortCalPage.dwnPayment)).clear();
    }
    
    @Then("^User entr the val in Dwnpymnt txt fld$")
    public void User_entr_the_val_in_Dwnpymnt_txt_ssfld() throws Throwable{
    	
    	mydobj.findElement(By.xpath(MortCalPage.dwnPayment)).sendKeys("12");
    }
    
    
    @Then("^User clcks on cal btn$")
    public void User_clcks_on_cal_btn()throws Throwable{
    	
    	mydobj.findElement(By.xpath(MortCalPage.calBtn)).click();
    }
    
    @Then("^User cls the bwsr$")
    public void User_cls_the_bwsr()throws Throwable{
    	mydobj.close();
    	
    	//mydobj.findElement(By.xpath(MortgageCalculatorPage.calBtn)).click();
    }


}
