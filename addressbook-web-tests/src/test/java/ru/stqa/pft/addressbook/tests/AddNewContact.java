package ru.stqa.pft.addressbook.tests;


import org.testng.annotations.Test;

public class AddNewContact extends TestBase {

    @Test
    public void testAddNewContact() {
        app.getNavigationHelper().gotoAddNewContact();
        app.getContactHelper().fillContactForm("Michael", "Michael", "Michael", "Michael", "Michael", "Michael", "Michael", "Michael", "Michael", "Michael", "Michael", "Michael", "Michael", "Michael", "Michael", "1", "//*[@id=\"content\"]/form/select[1]/option[3]", "//*[@id=\"content\"]/form/select[2]/option[9]", "1990", "//*[@id=\"content\"]/form/select[3]/option[4]", "//*[@id=\"content\"]/form/select[4]/option[4]", "1990", "//*[@id=\"content\"]/form/select[5]/option[2]", "Michael", "Michael", "Michael");
        app.getContactHelper().AddNewContactSubmit();

    }




}
