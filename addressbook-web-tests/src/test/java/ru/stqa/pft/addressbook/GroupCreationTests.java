package ru.stqa.pft.addressbook;

import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {

	@Test
	public void testGroupCreation() throws Exception {
		gotoGroupPage();
		initGroupCreation();
		CreationGroupCreation(new GroupData("test6", "test6", "test6"));
		submitGroupCreation();
		returnToGroupPage();
	}


}
