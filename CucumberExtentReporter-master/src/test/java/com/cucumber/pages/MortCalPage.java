package com.cucumber.pages;

public class MortCalPage {
	
public  final static String mortgagecal_link = "//a[text()='Mortgage Calculator']";
	
	public  final static String homePrice = "//input[@name='chouseprice']";

	//public static String homePrice="//input[@name='chouseprice']";

	public final static String dwnPayment="//input[@name='cdownpayment' and @type='text']";
	 
	public final static String loanTerm="//input[@name='cloanterm' and @type='text']";
	 
	public final static String intrRate="//input[@name='cinterestrate']";
	 
	public final static String startDate="//select[@id='cstartmonth']";

	public final static String startDateDrpValue="//select[@id='cstartmonth']//option[text()='Mar']";
	 
	public final static String pTax="//Input[@id='cpropertytaxes' and @type='text']";
	 
	public final static String homeIns="//Input[@id='chomeins' and @type='text']";
	 
	public final static String pMIIns="//Input[@id='cpmi' and @type='text']";
	 
	public  final static String hoaFee="//Input[@id='choa' and @type='text']";
	 
	public final static String otherCst="//Input[@id='cothercost' and @type='text']";
	 
	public final static String calBtn="//input[@value='Calculate']";



}
