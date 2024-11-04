package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupCreationTests extends TestBase {

	@Test
	public void testGroupCreation() {
		app.getNavigationHelper().gotoGroupPage();
		app.getGroupHelper().initGroupCreation();
		app.getGroupHelper().CreationGroupCreation(new GroupData("test65", "test6", "test6"));
		app.getGroupHelper().submitGroupCreation();
		app.getGroupHelper().returnToGroupPage();
	}


}
