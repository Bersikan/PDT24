package com.example.tests;

import org.testng.annotations.Test;



public class NonEmptyContactAdd extends TestBase {


 

  @Test
  public void nonEmptyContactAdd() throws Exception {
	openMainPage();
    initContactCreation();
    ContactData contact = new ContactData();
	contact.contactName = "cName";
	contact.contactLastName ="cLName";
	contact.address = "cAddress";
	contact.homePhone = "hPhone";
	contact.mobilePhone ="mPhone";
	contact.workPhone="wPfone";
	contact.email_1="eM1";
	contact.email_2="eM2";
	contact.birhDay="17";
	contact.birthMonth="July";
	contact.birthYear="1988";
	contact.groupAssign = "123";
	contact.secAddr="sAddr";
	contact.secHomeAddr="sHAddr";
	fillContactForm(contact);
    submitContact();
    returnToHomePage();
  }

 
  
}
