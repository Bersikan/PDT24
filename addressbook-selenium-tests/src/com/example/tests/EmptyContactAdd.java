package com.example.tests;

import org.testng.annotations.Test;



public class EmptyContactAdd extends TestBase {


 

  @Test
  public void nonEmptyContactAdd() throws Exception {
	openMainPage();
    initContactCreation();
	fillContactForm(new ContactData("", "", "", "", "", "", "", "", "-", "-", "", "", "", ""));
    submitContact();
    returnToHomePage();
  }

 
  
}
