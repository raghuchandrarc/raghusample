package mavenprojectgithub;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hp.lft.sdk.*;
import com.hp.lft.sdk.web.*;
import com.hp.lft.verifications.*;

import unittesting.*;

public class LeanFtTest extends UnitTestClassBase {
	public static Browser driver;

    
    @Test
    public void test() throws GeneralLeanFtException { 
    	driver=BrowserFactory.launch(BrowserType.CHROME);
    	driver.navigate("https://www.google.co.in/");
    	driver.describe(EditField.class, new EditFieldDescription.Builder()
    			.id("lst-ib").build()).setValue("Facebook");;
    
    }
    @Test
    public void test6() throws  GeneralLeanFtException {
    	driver=BrowserFactory.launch(BrowserType.CHROME);
    }
    //https://github.com/raghuchandrarc/raghusample.git

}