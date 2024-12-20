package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import ru.stqa.pft.addressbook.appmanager.ApplicationManager;

import static org.testng.Assert.fail;

public class TestBase {

    protected final ApplicationManager app = new ApplicationManager();

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        app.init();
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
        app.stop();
        String verificationErrorString = app.verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

}
