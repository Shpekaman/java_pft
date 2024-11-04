package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupHelper extends HelperBase {


    public GroupHelper(WebDriver driver) {
        super(driver);
    }

    public void returnToGroupPage() {
        click(By.linkText("group page"));
    }

    public void submitGroupCreation() {
        click(By.name("submit"));
    }

    public void initGroupCreation() {
        click(By.name("new"));
    }

    public void CreationGroupCreation(GroupData groupData) {
        type(By.name("group_name"), groupData.header());
        type(By.name("group_header"), groupData.header());
        type(By.name("group_footer"), groupData.footer());
    }

    public void deleteSelectedGroups() {
        click(By.xpath("//input[@value = \"Delete group(s)\"]"));
    }

    public void selectGroup() {
        click(By.name("selected[]"));
    }




    public void initGroupModification() {
        click(By.xpath("//input[@value = \"Edit group\"]"));
    }

    public void submitGroupModification() {
        click(By.xpath("//input[@value = \"Update\"]"));
    }
}
