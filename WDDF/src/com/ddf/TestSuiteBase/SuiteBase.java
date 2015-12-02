package com.ddf.TestSuiteBase;

import java.io.IOException;
import com.ddf.utility.Read_XLS;

public class SuiteBase {	
	public static Read_XLS TestSuiteListExcel   = null;
	public static Read_XLS TestCaseListExcelOne = null;
	public static Read_XLS TestCaseListExcelTwo = null;
	
	//created Init() function In this file to Initialize all .xls file's paths.
	public void init() throws IOException{
		//Please change file's path strings bellow If you have stored them at location other than bellow.
		//Initializing Test Suite List(TestSuiteList.xls) File Path Using Constructor Of Read_XLS Utility Class.
		TestSuiteListExcel = new Read_XLS(System.getProperty("user.dir")+"\\src\\com\\ddf\\ExcelFiles\\TestSuiteList.xls");
		//Initializing Test Suite One(SuiteOne.xls) File Path Using Constructor Of Read_XLS Utility Class.
		TestCaseListExcelOne = new Read_XLS(System.getProperty("user.dir")+"\\src\\com\\ddf\\ExcelFiles\\SuiteOne.xls");
		//Initializing Test Suite Two(SuiteTwo.xls) File Path Using Constructor Of Read_XLS Utility Class.
		TestCaseListExcelTwo = new Read_XLS(System.getProperty("user.dir")+"\\src\\com\\ddf\\ExcelFiles\\SuiteTwo.xls");																			
	}	
}